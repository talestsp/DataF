package com.futebol.tatcfc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TATCFC extends Activity {

	private RadioGroup radioTime;
	private RadioButton radioTimeButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tatcfc);
	}
	
	public void casa(View v){
		radioTime = (RadioGroup) findViewById(R.id.radioTimes);
		
		int selectedId = radioTime.getCheckedRadioButtonId();
		radioTimeButton = (RadioButton) findViewById(selectedId);
		Log.d("Eu",(String) radioTimeButton.getText());
	}

	public void fora(View v){
		radioTime = (RadioGroup) findViewById(R.id.radioTimes);
		
		int selectedId = radioTime.getCheckedRadioButtonId();
		radioTimeButton = (RadioButton) findViewById(selectedId);
		Log.d("Eu2",(String) radioTimeButton.getText());
	}
}
