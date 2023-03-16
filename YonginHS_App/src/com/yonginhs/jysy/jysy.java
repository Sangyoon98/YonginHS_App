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


public class jysy extends Activity implements OnClickListener {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jysy);
		
		Button alert = (Button) findViewById(R.id.gb1);
		alert.setOnClickListener(this);
	}
	public void onClick(View v) {
		if (v.getId() == R.id.gb1) {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Change Log");
			builder.setMessage("Version 0.0.2\n" +
                    "-change main layout buttons\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.1.0\n" +
                    "-change main layout buttons\n" +
                    "-change white theme\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.1.1\n" +
                    "-add school logo image\n" +
                    "-change layout\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.2.0\n" +
                    "-add webview\n" +
                    "-add activity moving source\n" +
                    "-fix layout\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.3.0\n" +
                    "-add start image\n" +
                    "-add toast source\n" +
                    "-change webview image\n" +
                    "-add app icon image\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.4.0\n" +
                    "-add school meal webview\n" +
                    "-add YBS button\n" +
                    "-add button image\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.6.0\n" +
                    "-possing school meal data\n" +
                    "-add date button image\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.7.0\n" +
                    "-possing school breakfest,meal,dinner\n" +
                    "-add school meal tab\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.8.0\n" +
                    "-change possing server goe.go.kr\n" +
                    "-add noty window\n" +
                    "-add change log\n" +
                    "-change toast text\n" +
                    "-add developer tap\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 0.9.0\n" +
                    "-change main layout button icon image\n" +
                    "-change webview layout button icon\n" +
                    "-change YBS layout button icon\n" +
                    "-change school meal layout button icon\n" +
                    "-change start image\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 1.0.0\n" +
                    "-release at google play\n" +
                    "-fix layout image\n" +
                    "-bug fixed\n" +
                    "\n" +
                    "Version 1.5.0\n" +
                    "-changed meal icons\n" +
                    "-fixed web view buttons\n"
                    "\n"
                    "Version 2.0.0\n"
                    "-apply material design\n" +
                    "-add material source\n"
                    "-support google API ver.21\n"        +
                    "-support andriod 5.0 lollipop\n" +
                    "-supprot x64 processcer\n")

			builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

					}
				});
			builder.show();
		}
	}
}
