package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TheVillage extends Activity {
	
	Button bClassicGarden;
	Button bFamilySuite;
	Button bVillageSuite;
	Button bPresidentSuite;
	Button bBeachFront;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.the_village);
		addActionListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addActionListenerOnButton() {
		 
		bClassicGarden = (Button) findViewById(R.id.buttonClassicGarden);
		bFamilySuite = (Button) findViewById(R.id.buttonFamilySuite);
		bVillageSuite = (Button) findViewById(R.id.buttonVillageSuite);
		bPresidentSuite = (Button) findViewById(R.id.buttonPresidentSuite);
		bBeachFront = (Button) findViewById(R.id.buttonBeachFront);

		
		
		
 
		bBeachFront.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.V__BEACH__FRONT_25"));
 
			}
 
		});
		bClassicGarden.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.V_CLASSIC_GARDEN"));
 
			}
 
		});
		bVillageSuite.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.V__SUITE_50"));
 
			}
 
		});
		bPresidentSuite.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.V_PRESIDENT"));
 
			}
 
		});
		bFamilySuite.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.FAMILY_SUITE"));
 
			}
 
		});
	}
}
