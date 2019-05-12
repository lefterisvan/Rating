package com.aegean.doryssarating;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Dining_Bars extends Activity{
	Button bRestaurants;
	Button bBars;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dining_bars);
		addActionListenerOnButton();
	}

	public void addActionListenerOnButton() {
		 
		bRestaurants = (Button) findViewById(R.id.buttonRestaurants);
		bBars = (Button) findViewById(R.id.buttonBars);
		
		
 
		bRestaurants.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent pRestaurants =  new Intent("com.aegean.RESTAURANTS" );
			    startActivity(pRestaurants);
 
			}
 
		});
		bBars.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pBars =  new Intent("com.aegean.BARS" );
			    startActivity(pBars);
 
			}
 
		});
	
		
	}
}





