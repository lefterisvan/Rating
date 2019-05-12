package com.aegean.doryssarating;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Rate_Our_Facilities extends Activity {
	
	Button bActivities;
	Button bDining;
	Button bAccommondation;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rate_our_facilitie);
		addActionListenerOnButton();
	}

	public void addActionListenerOnButton() {
		 
		bActivities = (Button) findViewById(R.id.buttonActivities_Facilities);
		bDining = (Button) findViewById(R.id.buttonDining_Bars);
		bAccommondation = (Button) findViewById(R.id.buttonAccommondation);
		
 
		bActivities.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			  Intent pActivities =  new Intent("com.aegean.ACTIVITIES_AND_FACILITIES" );
			    startActivity(pActivities);
 
			}
 
		});
		bDining.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pDining =  new Intent("com.aegean.DINING_BARS" );
			    startActivity(pDining);
 
			}
 
		});
		bAccommondation.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			  Intent pAccommondation =  new Intent("com.aegean.ACCOMMONDATION" );
			    startActivity(pAccommondation);
 
			}
 
		});
		
	}
}





