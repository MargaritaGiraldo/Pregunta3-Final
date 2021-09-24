package com.example.intents1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaActivity2 extends AppCompatActivity {
     TextView tvt_valor1, tvt_valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);

        recibirDatos();
        
    }

    private void recibirDatos() {

        Bundle recepcion = getIntent().getExtras();
        String d1 = recepcion.getString("dato01");
        String d2 = recepcion.getString("dato02");

        tvt_valor1 = findViewById(R.id.textView);
        tvt_valor2 = findViewById(R.id.textView3);

        tvt_valor1.setText(d1);
        tvt_valor2.setText(d2);
}
}