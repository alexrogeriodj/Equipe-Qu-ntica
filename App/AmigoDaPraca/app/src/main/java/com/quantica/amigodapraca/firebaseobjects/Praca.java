package com.quantica.amigodapraca.firebaseobjects;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by andre on 22/04/2017.
 */

public class Praca {
    public String nome;
    public double latitude;
    public double longitude;

    public Praca() {

    }

    public Praca(String nome, Double latitude, Double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;

    }



    public void publish() {
        FirebaseDatabase firebase = FirebaseDatabase.getInstance();
        DatabaseReference reference = firebase.getReference("Pracas").push();
        reference.setValue(this);
    }
}
