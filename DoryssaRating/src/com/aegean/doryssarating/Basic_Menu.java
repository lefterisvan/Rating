package com.aegean.doryssarating;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Basic_Menu extends Activity{

	Button bHotel_Details;
	Button bRoomsNSuites;
	Button bRate;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basic_menu);
		addActionListenerOnButton();
	}

	public void addActionListenerOnButton() {
		 
		bHotel_Details = (Button) findViewById(R.id.buttonHotel_Details);
		bRoomsNSuites = (Button) findViewById(R.id.buttonRooms);
		bRate = (Button) findViewById(R.id.buttonRate_Our_Facilities);
		
 
		bHotel_Details.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  //Intent pHotel_Details =  new Intent("com.aegean.doryssaseasideresort.HOTEL_DETAILS" );
			  startActivity(new Intent ("com.aegean.HOTEL_DETAILS"));
 
			}
 
		});
		bRoomsNSuites.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pRoomsNSuites =  new Intent("com.aegean.ROOMSANDSUITES" );
			    startActivity(pRoomsNSuites);
 
			}
 
		});
		bRate.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pRate =  new Intent("com.aegean.RATE_OUR_FACILITIES" );
			    startActivity(pRate);
 
			}
 
		});
		
	}
}



