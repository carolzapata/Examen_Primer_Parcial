package com.example.cecyt9.examen1_zapata_manilla_carol_michelle_6im7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

    TextView Titulo;
    EditText numUno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Titulo = (TextView)findViewById(R.id.Titulo);
        numUno = (EditText)findViewById(R.id.numUno);
    }

    public void onClickConvertir(View vw){

        String dolar = numUno.getText().toString();

        try {

            if (dolar != null && !dolar.equals("")) {

                Intent intento = new Intent(this, Actividad2.class);
                Bundle bundle = new Bundle();

                bundle.putString("dolares", "" + Integer.parseInt(dolar) / 15);
                intento.putExtras(bundle);
                finish();
                startActivity(intento);

            } else {

                Toast.makeText(getApplicationContext(), "Campo vacío", Toast.LENGTH_LONG).show();

            }
        }catch (NumberFormatException exc){
            Toast.makeText(getApplicationContext(), "Escribe sólo números enteros", Toast.LENGTH_LONG).show();
        }

    }
}
