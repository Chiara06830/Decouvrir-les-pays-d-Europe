package com.example.projet_mobil.creationPartie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projet_mobil.R;


/*-----------------------------------------------------------
Affiche le nom du joueur et lui prpose de commencer la partie
 ----------------------------------------------------------*/

public class SaisieActivity extends AppCompatActivity{
    EditText etNom;
    Button valider;
    Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);
    }

    //lancer le quizz
    public void debuterJeux(View v){

    }

    //retourner au menu principal
    public void retour(View v){
        finish();
    }
}
