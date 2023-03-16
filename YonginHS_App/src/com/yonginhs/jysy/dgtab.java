package com.yonginhs.jysy;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

@SuppressWarnings("deprecation")
public class dgtab extends TabActivity {
	TabHost mTab;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		TabHost tabHost = getTabHost();

		Intent int1 = new Intent(this, dg.class);
		int1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		tabHost.addTab(tabHost.newTabSpec("tab")
					   .setIndicator("용인고")
					   .setContent(int1));

		Intent int2 = new Intent(this, jysy.class);
		int2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
		tabHost.addTab(tabHost.newTabSpec("tab2")
					   .setIndicator("개발")
					   .setContent(int2));

	}
}
