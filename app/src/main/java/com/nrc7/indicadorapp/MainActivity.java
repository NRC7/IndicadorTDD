package com.nrc7.indicadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.nrc7.indicadorapp.api.DataSource;
import com.nrc7.indicadorapp.api.IData;

// Cuando una clase implementa una Interface que es un callback
// se convierte en un suscriptor a la respuesta
public class MainActivity extends AppCompatActivity implements IData {

    // Debe ser de alcance de clase para usarlo dentro del notificarValor
    TextView textView;
    DataSource source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        // RETROFIT
        // 1. DEPENDENCIA DE RETROFIT
        // 2. DEPENDENCIA DEL CONVERTER
        // 3. CONFIGURACION DE JAVA 1.8
        // 4. DAR PERMISOS DE INTERNET EN MANIFEST
        // API: MiIndicador

        // Referencia al DataSource
        source = new DataSource(this);
        // INICIAR EL PROCESO DE LLAMADO A LA API MIINDICADOR
        source.getIndicador("uf", "25-03-2020");
    }

    // Cuando me suscribo a un callback, @Override del metodo notificarValor,
    // me entrega el valor completo desde el DataSource, es decir != null
    @Override
    public void notificarValor(String valor) {
        textView.setText(valor);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        source = null;
    }
}
