package com.quantica.amigodapraca;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.quantica.amigodapraca.R;
import com.quantica.amigodapraca.firebaseobjects.Praca;

/**
 * Created by andre on 22/04/2017.
 */

public class SubmitActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_criarpraca);
    }

    public void submit(View v) {
        String nome = ((EditText) findViewById(R.id.nome)).getText().toString();
      //  Double latitude = Double.valueOf(((EditText) findViewById(R.id.latitude)).getText().toString());
      //  Double longitude = Double.valueOf(((EditText) findViewById(R.id.longitude)).getText().toString());

        new Praca("Praça", 0.0, 0.0).publish();
        ((EditText) findViewById(R.id.nome)).setText("");
        ((EditText) findViewById(R.id.latitude)).setText("");
        ((EditText) findViewById(R.id.longitude)).setText("");
    }
}
