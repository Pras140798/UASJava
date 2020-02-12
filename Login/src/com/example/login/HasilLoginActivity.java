package com.example.login;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilLoginActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	
		TextView labelshow =  (TextView) findViewById(R.id.labelshow);
		Button btnexit = (Button) findViewById(R.id.btnexit);
		
		//Button Exit
		btnexit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		Intent i = getIntent();
		//Menerima Data dari Activity_login
		String username = i.getStringExtra("username");
		
		labelshow.setText(username);
		
	}
}
