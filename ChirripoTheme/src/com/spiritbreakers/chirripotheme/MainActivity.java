package com.spiritbreakers.chirripotheme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.spiritbreakers.chirripotheme.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);		
		return super.onCreateOptionsMenu(menu);
	}
		
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.action_search:
	            openSearch();
	            return true;
	        case R.id.action_settings:
	            openSettings();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	public void sendMessage(View view) {
	    EditText editMessage = (EditText)findViewById(R.id.edit_message);
	    String message = editMessage.getText().toString();
	    Intent intent = new Intent(this, ShowMessageActivity.class);
	    intent.putExtra(EXTRA_MESSAGE, message);
	    startActivity(intent);
	}

	public void openSearch(){
		
	}
	
	public void openSettings(){
		
	}
}
