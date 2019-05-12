package com.aegean.doryssarating;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Hotel_Details extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotel_details);
}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}