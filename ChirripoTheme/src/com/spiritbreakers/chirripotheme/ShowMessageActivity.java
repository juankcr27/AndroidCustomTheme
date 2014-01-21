package com.spiritbreakers.chirripotheme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_message);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
        TextView showMessage = (TextView)findViewById(R.id.display_message);        
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        showMessage.setText(message); 
	}

}
