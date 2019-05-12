package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class M_classic_view extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m_classic_view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.m_classic_view, menu);
		return true;
	}

}
