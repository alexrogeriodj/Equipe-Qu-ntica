package com.quantica.amigodapraca;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by andre on 22/04/2017.
 */

public class ServicosActivity extends Activity {
    int id = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);
        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        t.setTitle("Serviços");

        Random r = new Random();
        ImageView iv = ((ImageView) findViewById(R.id.img_servicos));
        int i = r.nextInt(3);
        Toast.makeText(this, ""+i, Toast.LENGTH_LONG).show();
        if(i == 0) iv.setImageResource(R.drawable.propaganda1);
        if(i == 1) iv.setImageResource(R.drawable.propaganda2);
        if(i == 2) iv.setImageResource(R.drawable.propaganda3);
    }

    public void voltar(View view) {
        finish();

    }

}
