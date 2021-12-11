package com.example.pregunta3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declarar paso
    Button boton;
  String valor = "Texto de prueba";
    FirebaseAuth autentificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inicializamos firebase
        autentificacion = FirebaseAuth.getInstance();

// casteo
       boton= findViewById(R.id.btn_enviar);

//traer al evento
       boton.setOnClickListener(new View.OnClickListener() {


           @Override
           public void onClick(View view) {
// intenst explicito
               Intent intent_explicito = new Intent(MainActivity.this,segundaActivity2.class);
                intent_explicito.putExtra("dato01",valor);
                intent_explicito.putExtra("dato02","Texto de prueba2");
                startActivity(intent_explicito);
           }
       });

        @Override
    public void onClick(View view) {
        //instent implicito
        Intent intent_implicito = new Intent(Intent.ACTION_VIEW);
        Intent_implicito.setData(Uri.parse("https://www.youtube.com/watch?v=KYPc7CAYJOw"));
        startActivity(intent_implicito);
    }
});
        boton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        //instent implicito
        string telefono = "943809532";
        startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+telefono)));
        }
        });


    public void LimpiarCajasDeTextos(){

        valor.setText("");

    }
