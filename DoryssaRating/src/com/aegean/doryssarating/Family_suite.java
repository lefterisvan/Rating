package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Family_suite extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.family_suite);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.family_suite, menu);
		return true;
	}

}
