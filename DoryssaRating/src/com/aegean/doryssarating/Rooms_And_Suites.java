package com.aegean.doryssarating;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Rooms_And_Suites extends Activity{

	Button bThe_village;
	Button bMain_Building;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roomsandsuites);
		addActionListenerOnButton();
}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void addActionListenerOnButton() {
		 
		bThe_village = (Button) findViewById(R.id.buttonThe_Village);
		bMain_Building = (Button) findViewById(R.id.buttonRMain_Bulding);
		
		
 
		bThe_village.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.THE_VILLAGE"));
 
			}
 
		});
		bMain_Building.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent PMain_Building =  new Intent("com.aegean.MAIN_BUILDING" );
			    startActivity(PMain_Building);
 
			}
 
		});
		
		
	}
}