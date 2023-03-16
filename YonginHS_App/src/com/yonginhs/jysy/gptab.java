package com.yonginhs.jysy;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

@SuppressWarnings("deprecation")
public class gptab extends TabActivity {
	TabHost mTab;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		TabHost tabHost = getTabHost();

		Intent int1 = new Intent(this, gp1.class);
		int1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		tabHost.addTab(tabHost.newTabSpec("tab")
				.setIndicator("조식")
				.setContent(int1));

		Intent int2 = new Intent(this, gp2.class);
		int2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator("중식")
				.setContent(int2));
		
		Intent int3 = new Intent(this, gp3.class);
		int3.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		tabHost.addTab(tabHost.newTabSpec("tab3")
				.setIndicator("석식")
				.setContent(int3));
	}
}
