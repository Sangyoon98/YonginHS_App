package com.yonginhs.jysy;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Map;
import java.util.Hashtable;

public class dg extends Activity
{
	String encoding = "UTF-8";
	Activity me = this;
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dg);

		


		{Button bt1 = (Button) findViewById(R.id.bt1);

		bt1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,hg.class);
		startActivity(i);}	

		{Button bt2 = (Button) findViewById(R.id.bt2);

		bt2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,hs.class);
		startActivity(i);}

		{Button bt3 = (Button) findViewById(R.id.bt3);
		
		bt3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,gn.class);
		startActivity(i);}

		{Button bt4 = (Button) findViewById(R.id.bt4);
		
		bt4.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,gg.class);
		startActivity(i);}

		{Button bt5 = (Button) findViewById(R.id.bt5);

		bt5.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,phone.class);
		startActivity(i);}
		
	    {Button gb1 = (Button) findViewById(R.id.gb1);

		gb1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(dg.this,fbk.class);
		startActivity(i);}
	
		{Button kakao = (Button) findViewById(R.id.kakao);
		kakao.setOnClickListener(new OnClickListener(){	public void onClick(View v){
						// kakaolink
		try
		{
							ArrayList<Map<String, String>> metaInfoArray = new ArrayList<Map<String, String>>();

							Map<String, String> metaInfoAndroid = new Hashtable<String, String>(1);
							metaInfoAndroid.put("os", "android");
							metaInfoAndroid.put("devicetype", "phone");
			metaInfoAndroid.put("installurl", "market://details?id=com.yonginhs.jysy");
							metaInfoAndroid.put("executeurl", "linktest://mainactivity");

							metaInfoArray.add(metaInfoAndroid);

							KakaoLink kakaoLink = KakaoLink.getLink(getApplicationContext());

							if(!kakaoLink.isAvailableIntent()) {
								alert("카카오톡이 설치되지 않았습니다.");			
								return;
							}

							kakaoLink.openKakaoAppLink(
								me, 
								"https://play.google.com/store/apps/details?id=com.yonginhs.jysy/", 
								"용인고등학교 학생이라면 꼭 사용해야할 필수어플!(최고) 지금당장 사용해보세요!(방긋)",  
								getPackageName(), 
								getPackageManager().getPackageInfo(getPackageName(), 0).versionName,
								"용인고 App",
								encoding, 
								metaInfoArray);

						} catch (NameNotFoundException e)
						{
							alert(e.toString());
						}
					}
				});
		}
		private void alert(String message) {
			new AlertDialog.Builder(dg.this)
				.setIcon(R.drawable.ic_launcher)
				.setTitle(R.string.app_name)
				.setMessage(message)
				.setPositiveButton(android.R.string.ok, null)
				.create().show();
		}
		
		});}});}});}});}});}});}}}
	
		
		
