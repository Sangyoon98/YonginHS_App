package com.yonginhs.jysy;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.app.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.content.*;
import android.net.*;
import android.app.Activity.*;
import android.media.MediaPlayer.*;
import android.os.Bundle.*;
import android.app.Activity.*;
import android.app.AlertDialog.*;
import android.content.DialogInterface.*;
import android.os.Bundle.*;
import android.view.View.*;
import android.view.View.OnClickListener.*;
import android.widget.Button.*;
import android.webkit.*;
import android.media.*;
import android.widget.Toast.*;
import android.app.Activity;
import android.widget.EditText.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.renderscript.*;
import android.widget.*;

public class ybssc extends Activity implements OnClickListener {
	ProgressDialog dialog;
	EditText et;
	GMailSender sender;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.ybssc);
		Button bt = (Button) this.findViewById(R.id.bt_help);
		bt.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		et = (EditText) this.findViewById(R.id.et);
		sender = new GMailSender("ybshelp@gmail.com", "ybs123456789"); // SUBSTITUTE ID PASSWORD
		timeThread();
	}

	public void timeThread() {

		dialog = new ProgressDialog(this);
		dialog = new ProgressDialog(this);
		dialog.setTitle("Wait...");
		dialog.setMessage("신청하는 중입니다.");
		dialog.setIndeterminate(true);
		dialog.setCancelable(true);
		dialog.show();
		new Thread(new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					try {
						sender.sendMail("노래, 사연신청", // subject.getText().toString(),
										et.getText().toString(), // body.getText().toString(),
										"ybshelp@gmail.com", // from.getText().toString(),
										"ybshelp@gmail.com" // to.getText().toString()
										);
						sleep(3000);
					} catch (Exception e) {
						Log.e("SendMail", e.getMessage(), e);
						Toast.makeText(ybssc.this, "신청 실패", Toast.LENGTH_SHORT)
							.show();

					}
					dialog.dismiss();
				}

				private void sleep(int i) {
					// TODO Auto-generated method stub

				}

			}).start();
	}

}
