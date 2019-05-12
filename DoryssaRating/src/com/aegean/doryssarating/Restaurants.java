package com.aegean.doryssarating;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;



import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Restaurants extends Activity 
{
	private final String LOG_TAG = "Restaurants";

	  private RatingBar RatingBarR1;	
	  private RatingBar RatingBarR2;
	  private RatingBar RatingBarR3;
	  private RatingBar RatingBarR4;
	  private RatingBar RatingBarR5;
	  private Button btnRSubmit;
	 
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurants);
	 
		addListenerOnButton();
	 
	  }
	  public void addListenerOnButton() {

			RatingBarR1 = (RatingBar) findViewById(R.id.ratingBarR1);
			RatingBarR2 = (RatingBar) findViewById(R.id.ratingBarR2);
			RatingBarR3 = (RatingBar) findViewById(R.id.ratingBarR3);
			RatingBarR4 = (RatingBar) findViewById(R.id.ratingBarR4);
			RatingBarR5 = (RatingBar) findViewById(R.id.ratingBarR5);
			
			btnRSubmit = (Button) findViewById(R.id.buttonRSubmit);

			// if click on me, then display the current rating value.
			btnRSubmit.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					new UpdateDBTask().execute();
				}

			});

		}
	  ProgressDialog pleaseWaitDialog;
	  
	  public class UpdateDBTask extends AsyncTask<Void, Void, String> {

			private static final String DEBUG_TAG = "restaurants$UpdateDBTask";

			@Override
			protected void onPreExecute() {
				pleaseWaitDialog = ProgressDialog.show(
						Restaurants.this, "Αναμονή",
						"Αποστολή δεδομένων", true, true);
				pleaseWaitDialog.setOnCancelListener(new OnCancelListener() {
					public void onCancel(DialogInterface dialog) {
						Log.d(DEBUG_TAG, "onCancel -- dialog");
					}
				});
			}

			@Override
			protected String doInBackground(Void... params) {
				String retValue = "Αρχικοποίηση. Δεν πρέπει να γυρίσει αυτή η τιμή!!!";
				
//				JSONObject json = new JSONObject();
//				try {
//					json.put("sandy_beach", RatingBar1.getRating());
//					json.put("sports", RatingBar2.getRating());
//					json.put("water_sports", RatingBar3.getRating());
//					json.put("shopping", RatingBar4.getRating());
//					json.put("children_playground", RatingBar5.getRating());
//					json.put("gym", RatingBar6.getRating());
//				} catch (JSONException e) {
//					e.printStackTrace();
//				}
//				Log.i(LOG_TAG, json.toString());
				
				Resources res = getResources();
				HttpHost targetHost = new HttpHost(
						res.getString(R.string.hostname), Integer.parseInt(
						res.getString(R.string.port)), 
						res.getString(R.string.scheme)
					);
				
				HttpPost httpPost = new HttpPost(res.getString(R.string.setRatingRestaurants));
				DefaultHttpClient httpClient = new DefaultHttpClient();
				
				try {
//					StringEntity se = new StringEntity(json.toString());
//					httpPost.setEntity(se);
//					List<NameValuePair> postParams = new ArrayList<NameValuePair>();
//					postParams.add(new BasicNameValuePair("json", json.toString()));

					List<NameValuePair> postParams = new ArrayList<NameValuePair>();
					postParams.add(new BasicNameValuePair("Village_Restaurant", String.valueOf(RatingBarR1.getRating())));
					postParams.add(new BasicNameValuePair("Hotel_Restaurant", String.valueOf(RatingBarR2.getRating())));
					postParams.add(new BasicNameValuePair("Kafenio", String.valueOf(RatingBarR3.getRating())));
					postParams.add(new BasicNameValuePair("A_la_carte", String.valueOf(RatingBarR4.getRating())));
					postParams.add(new BasicNameValuePair("Room_Service", String.valueOf(RatingBarR5.getRating())));
					
					
					httpPost.setEntity(new UrlEncodedFormEntity(postParams));
					
					HttpResponse response = httpClient.execute(targetHost, httpPost);
					if (response.getStatusLine().getStatusCode() == 200) {
						Log.i(LOG_TAG, response.getStatusLine().toString());
						retValue = "OK!!!";
					} else {
						Log.i(LOG_TAG, response.getStatusLine().toString());
						retValue = "Update Failed!!";
					}
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				} catch (ClientProtocolException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return retValue;
			}

			@Override
			protected void onPostExecute(String retValue) {
				pleaseWaitDialog.dismiss();
				Toast.makeText(getApplicationContext(), retValue, Toast.LENGTH_LONG)
				.show();
			}
		}

	  
	 
	 
}
