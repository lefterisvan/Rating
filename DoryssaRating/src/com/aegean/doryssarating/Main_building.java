package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main_building extends Activity {
	Button bGardenView;
	Button bClassicSea;
	Button bExecutive;
	Button bFamily;
	Button bDeluxe;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_building);
		addActionListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_building, menu);
		return true;
	}
	public void addActionListenerOnButton() {
		 
		bGardenView = (Button) findViewById(R.id.buttonGardenView);
		bClassicSea = (Button) findViewById(R.id.buttonClassicSea);
		bExecutive = (Button) findViewById(R.id.buttonExecutive);
		bFamily = (Button) findViewById(R.id.buttonFamily);
		bDeluxe = (Button) findViewById(R.id.buttonDeluxe);

		
		
		
 
		bGardenView.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.M_CLASSIC_VIEW"));
 
			}
 
		});
		bClassicSea.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.M_CLASIC_SEA"));
 
			}
 
		});
		bExecutive.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.M_EXECUTIVE"));
 
			}
 
		});
		bFamily.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.M_FAMILY"));
 
			}
 
		});
		bDeluxe.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			 
			  startActivity(new Intent ("com.aegean.M_DELUXE"));
 
			}
 
		});
	}

}
