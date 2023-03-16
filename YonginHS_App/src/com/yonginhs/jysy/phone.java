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


public class phone extends Activity
{


	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.phone);

		{Button ph1 = (Button) findViewById(R.id.ph1);
		ph1.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent myIntent = new Intent(Intent.ACTION_VIEW,
	    Uri.parse("tel:0313308380"));
		startActivity(myIntent);}
					
		{Button ph2 = (Button) findViewById(R.id.ph2);
		ph2.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent myIntent = new Intent(Intent.ACTION_VIEW,
	    Uri.parse("tel:0313308309"));
		startActivity(myIntent);}
		
		{Button ph3 = (Button) findViewById(R.id.ph3);
		ph3.setOnClickListener(new OnClickListener(){
		public void onClick(View v) {
		Intent myIntent = new Intent(Intent.ACTION_VIEW,
		Uri.parse("tel:0313358406"));
		startActivity(myIntent);}	
	});
}});}});}}}
