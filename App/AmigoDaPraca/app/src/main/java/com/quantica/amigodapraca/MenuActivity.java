package com.quantica.amigodapraca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by andre on 22/04/2017.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        t.setTitle("Início");
        t.removeView(t.findViewById(R.id.toolbar_voltar));
    }

    public void agenda(View view) {
        Intent it = new Intent(this, MapsActivity.class);
        startActivity(it);
    }

    public void servicos(View view) {
        Intent it = new Intent(this, ServicosActivity.class);
        startActivity(it);
    }

    public void notificacoes(View view) {
        Intent it = new Intent(this, EventosActivity.class);
        startActivity(it);
    }

    public void sair(View view) {
        LoginManager.getInstance().logOut();
        FirebaseAuth.getInstance().signOut();
        finish();

    }


}
