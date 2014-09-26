package view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.futebol.tatcfc.R;

public class JogarCasa extends Activity {

	String dados;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_resultados_casa);

		Bundle extras = getIntent().getExtras();
		
		if (extras != null) {
		    dados = extras.getString("stats");
		    Log.d("dados", dados);
		}
		
		TextView sexto1Value = (TextView) findViewById(R.id.sexto1_value);
		
		 Log.d("textv1", (String) sexto1Value.getText());


	}

	public void voltar(View v) {
		Intent intent = new Intent(this, TATCFC.class);
		startActivity(intent);
		finish();
	}

}
