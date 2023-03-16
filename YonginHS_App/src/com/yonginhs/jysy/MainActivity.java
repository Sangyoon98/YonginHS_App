package com.yonginhs.jysy;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity {
	private static final int MSG_TIMER_EXPIRED = 1;
	private static final int BACKKEY_TIMEOUT = 2;
	private static final int MILLIS_IN_SEC = 1000;
	private boolean mIsBackKeyPressed = false;
	private long mCurrTimeInMillis = 0;
	public void onBackPressed()
	{if (mIsBackKeyPressed == false)
		{mIsBackKeyPressed = true;mCurrTimeInMillis = Calendar.getInstance().getTimeInMillis();
			Toast.makeText(this, "'뒤로'버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT).show();startTimer();} 
		else {mIsBackKeyPressed = false;if (Calendar.getInstance().getTimeInMillis() <= (mCurrTimeInMillis + (BACKKEY_TIMEOUT * MILLIS_IN_SEC))){finish();}}}
	private void startTimer(){mTimerHandler.sendEmptyMessageDelayed(MSG_TIMER_EXPIRED, BACKKEY_TIMEOUT * MILLIS_IN_SEC);}
	private Handler mTimerHandler = new Handler(){
		public void handleMessage(Message msg) {
			switch (msg.what) {case MSG_TIMER_EXPIRED: {mIsBackKeyPressed = false;}break;}}};

public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
	AlertDialog.Builder builder = new AlertDialog.Builder(this);
	builder.setTitle("용인고 App");
	builder.setMessage("이 앱은 상업적용도가 아닌,\n용인고 학생들의 더욱 편안한 \n학교생활과 학생들이 학교에 대해\n더 쉽고, 빠르고, 자세히 알 수 \n있도록 하기 위해 만들어졌습니다.\n\n피드백 환영(메인->더보기->피드백)\n개발자:황재영,채상윤");
	builder.setCancelable(false);
	builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {

			}
		});
	builder.show();
		
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getNetworkInfo( ConnectivityManager.TYPE_WIFI);
		NetworkInfo in = cm.getNetworkInfo( ConnectivityManager.TYPE_MOBILE);
		boolean isWifiConn = ni.isConnected();
		boolean isMobileConn = in.isConnected();

		if(isWifiConn==true) {
			Toast.makeText(getApplicationContext(), "네트워크 연결됨", Toast.LENGTH_SHORT).show(); }

	startActivity(new Intent(this, SplashActivity.class));
	

	

		{Button bt1 = (Button) findViewById(R.id.bt1);

		bt1.setOnClickListener(new OnClickListener(){ public void onClick(View v){
	    Intent i=new Intent(MainActivity.this,gj.class);
		startActivity(i);}	
	
		{Button bt2 = (Button) findViewById(R.id.bt2);

		bt2.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(MainActivity.this,gt.class);
		startActivity(i);}
		
		{Button bt3 = (Button) findViewById(R.id.bt3);

		bt3.setOnClickListener(new OnClickListener(){ public void onClick(View v){
	    Intent i=new Intent(MainActivity.this,jg.class);
	    startActivity(i);}
		
		{Button bt4 = (Button) findViewById(R.id.bt4);

		bt4.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(MainActivity.this,dgtab.class);
		startActivity(i);}
		
		{Button bt5 = (Button) findViewById(R.id.bt5);

		bt5.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(MainActivity.this,gptab.class);
		startActivity(i);}
		
		{Button bt6 = (Button) findViewById(R.id.bt6);

		bt6.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(MainActivity.this,hi.class);
		startActivity(i);}	
		
		{Button bt7 = (Button) findViewById(R.id.bt7);

		bt7.setOnClickListener(new OnClickListener(){ public void onClick(View v){
		Intent i=new Intent(MainActivity.this,ybs.class);
		startActivity(i);}	
	});}
			
						
	
		
	});}});}});}});}});}});}}}
