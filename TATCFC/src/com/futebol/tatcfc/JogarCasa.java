package com.futebol.tatcfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JogarCasa extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_resultados_casa);
    }
	
	 public void voltar(View v){
		Intent intent = new Intent(this, TATCFC.class);
	    startActivity(intent);
	    finish();
	 }
	
}
