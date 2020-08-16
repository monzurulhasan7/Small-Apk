package ru.sn.mhs;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(getApplicationContext());
		tv.setText("Hello, World");
		setContentView(tv);
	}
}
