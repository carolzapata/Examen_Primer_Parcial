package com.example.cecyt9.examen1_zapata_manilla_carol_michelle_6im7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends Activity {


    TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        datos = (TextView)findViewById(R.id.txtDatos);

        Bundle bundle = this.getIntent().getExtras();
        datos.setText("Carol Michelle Zapata Manilla" + bundle.getString("dolares"));
    }

    public void onClickEnviar(View vw){

        Intent intento = new Intent(Intent.ACTION_SEND);
        intento.setType("text/plain");
        intento.putExtra(Intent.EXTRA_SUBJECT, "Examen1");
        intento.putExtra(Intent.EXTRA_TEXT, datos.getText().toString());
        intento.putExtra(Intent.EXTRA_EMAIL, new String[]{"eoropeza@ipn.mx"});

        startActivity(intento);

    }
}
