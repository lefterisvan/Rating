package com.aegean.doryssarating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Thread Timer = new Thread()
		{
			public void run()
			{
				try 
				{
					sleep(5000);
					startActivity(new Intent ("com.aegean.BASIC_MENU"));
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					finish();
				}
			}
		};
		Timer.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
