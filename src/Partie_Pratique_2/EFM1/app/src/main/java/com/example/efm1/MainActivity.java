package com.example.efm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
    }

    public void calculer(View view) {
        double IMC,poids,taille;
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        poids=Double.parseDouble(edit1.getText().toString());
        taille=Double.parseDouble(edit2.getText().toString());
        IMC=poids/taille*taille;
        if (IMC<18.5)
            Toast.makeText(this,"Maigreur",Toast.LENGTH_SHORT).show();
        else if (IMC>=18.5 && IMC<25)
            Toast.makeText(this,"Normale",Toast.LENGTH_SHORT).show();
        else if (IMC>=25 && IMC<40)
            Toast.makeText(this,"Surpoids",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Obesite",Toast.LENGTH_SHORT).show();
    }

}