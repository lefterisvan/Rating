package com.aegean.doryssarating;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Accommodation extends Activity {
	Button bThe_Village;
	Button bMain_Bulding;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accommodation);
		addActionListenerOnButton();
}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void addActionListenerOnButton() {
		 
		bThe_Village = (Button) findViewById(R.id.buttonThe_Village);
		bMain_Bulding = (Button) findViewById(R.id.buttonMain_Bulding);
		
		
 
		bThe_Village.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent pThe_Village =  new Intent("com.aegean.RATING_VILLAGE" );
			    startActivity(pThe_Village);
 
			}
 
		});
		bMain_Bulding.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pMain_Bulding =  new Intent("com.aegean.RATING_MAINBUILDING" );
			    startActivity(pMain_Bulding);
 
			}
 
		});
	
		
	}

}
