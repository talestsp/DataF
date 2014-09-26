package view;


import com.futebol.tatcfc.R;
import android.app.Activity;
import android.content.Intent;
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
		//Log.d("Eu",(String) radioTimeButton.getText());
		
		Intent intent = new Intent(this, JogarCasa.class);
		String stats = getData( (String) radioTimeButton.getText(), true);
	    intent.putExtra("stats", stats);
	    startActivity(intent);
	    finish();
	}

	public void fora(View v){
		radioTime = (RadioGroup) findViewById(R.id.radioTimes);
		
		int selectedId = radioTime.getCheckedRadioButtonId();
		radioTimeButton = (RadioButton) findViewById(selectedId);
		//Log.d("Eu2",(String) radioTimeButton.getText());
		
		Intent intent = new Intent(this, JogarVisitante.class);
		String stats = getData( (String) radioTimeButton.getText(), false);
	    intent.putExtra("stats", stats);
		startActivity(intent);
	    finish();
	}

	private String getData(String time, boolean emCasa) {
		String data = "0.0, 45.6, 5.0, 7.4, 38.9, 19.1";
		// TODO Pegar os dados do BD
		return data;
	}
}
