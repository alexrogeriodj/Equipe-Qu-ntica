package com.quantica.amigodapraca;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.quantica.amigodapraca.adapters.EventoAdapter;
import com.quantica.amigodapraca.firebaseobjects.Evento;
import com.quantica.amigodapraca.firebaseobjects.Praca;

/**
 * Created by andre on 22/04/2017.
 */

public class EventosActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacoes);
        RecyclerView rv = (RecyclerView) findViewById(R.id.lista);

        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        t.setTitle("Notificações");

        final EventoAdapter ea = new EventoAdapter();



        final RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(ea);

        FirebaseDatabase fbdb = FirebaseDatabase.getInstance();
        DatabaseReference ref = fbdb.getReference("Eventos/");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    Evento e = ds.getValue(Evento.class);
                    ea.add(e);
                    ea.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void voltar(View v) {
        finish();
    }
}
