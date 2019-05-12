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

public class Rating_mainbuilding extends Activity {
	
	private final String LOG_TAG = "Rating_mainbuilding";
	
	private RatingBar RatingBarRM1;
	private RatingBar RatingBarRM2;
	private RatingBar RatingBarRM3;
	private RatingBar RatingBarRM4;
	private RatingBar RatingBarRM5;
	private Button btnRMSubmit;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rating_mainbuilding);

		addListenerOnButton();

	}


	public void addListenerOnButton() {

		RatingBarRM1 = (RatingBar) findViewById(R.id.ratingBarRM1);
		RatingBarRM2 = (RatingBar) findViewById(R.id.ratingBarRM2);
		RatingBarRM3 = (RatingBar) findViewById(R.id.ratingBarRM3);
		RatingBarRM4 = (RatingBar) findViewById(R.id.ratingBarRM4);
		RatingBarRM5 = (RatingBar) findViewById(R.id.ratingBarRM5);
		btnRMSubmit = (Button) findViewById(R.id.buttonRMSubmit);

		// if click on me, then display the current rating value.
		btnRMSubmit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				new UpdateDBTask().execute();
			}

		});

	}
	
	
	ProgressDialog pleaseWaitDialog;
	
	public class UpdateDBTask extends AsyncTask<Void, Void, String> {

		private static final String DEBUG_TAG = "Rating_mainbuilding$UpdateDBTask";

		@Override
		protected void onPreExecute() {
			pleaseWaitDialog = ProgressDialog.show(
					Rating_mainbuilding.this, "Αναμονή",
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
			
//			JSONObject json = new JSONObject();
//			try {
//				json.put("sandy_beach", RatingBar1.getRating());
//				json.put("sports", RatingBar2.getRating());
//				json.put("water_sports", RatingBar3.getRating());
//				json.put("shopping", RatingBar4.getRating());
//				json.put("children_playground", RatingBar5.getRating());
//				json.put("gym", RatingBar6.getRating());
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//			Log.i(LOG_TAG, json.toString());
			
			Resources res = getResources();
			HttpHost targetHost = new HttpHost(
					res.getString(R.string.hostname), Integer.parseInt(
					res.getString(R.string.port)), 
					res.getString(R.string.scheme)
				);
			
			HttpPost httpPost = new HttpPost(res.getString(R.string.setRatingRating_Main_Building));
			DefaultHttpClient httpClient = new DefaultHttpClient();
			
			try {
//				StringEntity se = new StringEntity(json.toString());
//				httpPost.setEntity(se);
//				List<NameValuePair> postParams = new ArrayList<NameValuePair>();
//				postParams.add(new BasicNameValuePair("json", json.toString()));

				List<NameValuePair> postParams = new ArrayList<NameValuePair>();
				postParams.add(new BasicNameValuePair("classic_garden_view", String.valueOf(RatingBarRM1.getRating())));
				postParams.add(new BasicNameValuePair("classic_sea_view", String.valueOf(RatingBarRM2.getRating())));
				postParams.add(new BasicNameValuePair("executive_sea_view", String.valueOf(RatingBarRM3.getRating())));
				postParams.add(new BasicNameValuePair("family_suite", String.valueOf(RatingBarRM4.getRating())));
				postParams.add(new BasicNameValuePair("deluxe_junior_suite_view", String.valueOf(RatingBarRM5.getRating())));
				
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