package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;

import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

public class Resurts_Page extends Activity {

    TextView tv = (TextView) findViewById(R.id.text1);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resurts__page);
		 Intent intent;
	        intent = getIntent();
	        //String message = intent.getStringExtra(Activities_And_Facilities.EXTRA_MESSAGE);

	        //Display the message in textview
	      //  tv.setText(message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.resurts__page, menu);
		return true;
	}
	

}
