package com.yonginhs.jysy;

import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.webkit.*;
import android.widget.*;



public class hi extends Activity {



	private Handler mHandler;
	private boolean mFlag = false;                      
	private boolean isLoading = false;
	private String addr_home = "http://www.yongin.hs.kr/wah/main/mobile/schedule/view.htm";
	private Button mBackButton;
	private Button mHomeButton;
	private Button mNextButton;
	private WebView mWebView;
	private ProgressBar mProgressBar;



	@Override

	protected void onCreate(Bundle savedInstanceState) {



		super.onCreate(savedInstanceState);
    	Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.wv);



		mBackButton = (Button)findViewById(R.id.btnBack);
		mHomeButton = (Button)findViewById(R.id.btnHome);
		mNextButton = (Button)findViewById(R.id.btnNext);
		mWebView = (WebView)findViewById(R.id.webView);
		mProgressBar = (ProgressBar)findViewById(R.id.progressBar);




		mWebView.setWebViewClient(new webClient());      
		WebSettings webSettings = mWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);          
		webSettings.setBuiltInZoomControls(true);        
		mWebView.loadUrl(addr_home);




		mBackButton.setOnClickListener(onclick);
		mHomeButton.setOnClickListener(onclick);
		mNextButton.setOnClickListener(onclick);



		mWebView.setWebChromeClient(new WebChromeClient() {



				@Override

				public void onProgressChanged(WebView view, int newProgress) {
					mProgressBar.setProgress(newProgress);
				}
			});
	}



	private OnClickListener onclick = new OnClickListener() {


		@Override
		public void onClick(View v) {
			switch(v.getId()) {

				case R.id.btnBack:
					if (mWebView.canGoBack()) {
						mWebView.goBack();       

					}
					break;
				case R.id.btnHome:
					mWebView.loadUrl(addr_home);   
					break;
				case R.id.btnNext:
					if (mWebView.canGoForward()) {
						mWebView.goForward();    
					}
					break;

			}
		};};



	class webClient extends WebViewClient {



		@Override

		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			super.onPageStarted(view, url, favicon);
			mProgressBar.setVisibility(View.VISIBLE);
			isLoading = true;

		}



		@Override

		public void onPageFinished(WebView view, String url) {
			super.onPageFinished(view, url);

			mProgressBar.setVisibility(View.GONE);
			isLoading = false;

		}



		@Override

		public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
			super.onReceivedError(view, errorCode, description, failingUrl);

		}



		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;

		}

	}



	@Override

	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

	}



	@Override

	public boolean onOptionsItemSelected(MenuItem item) {
		mWebView.clearCache(true);                
		Toast.makeText(getApplicationContext(), "캐시삭제완료", Toast.LENGTH_SHORT).show();
		return super.onOptionsItemSelected(item);

	}

	}





	

