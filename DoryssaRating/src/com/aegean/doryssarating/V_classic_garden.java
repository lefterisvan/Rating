package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class V_classic_garden extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v_classic_garden);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.v_classic_garden, menu);
		return true;
	}

}
