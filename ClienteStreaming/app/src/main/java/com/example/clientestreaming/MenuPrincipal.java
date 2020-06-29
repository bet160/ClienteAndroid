package com.example.clientestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuPrincipal extends AppCompatActivity {

    private Window window;
    private Button boton;
    private ImageButton volver;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal2);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
        boton=(Button)findViewById(R.id.botonAudio);
        volver=(ImageButton) findViewById(R.id.botonVolver);
    }

    public void cambioPantalla(View view){
        Intent siguiente = new Intent(this,ReproduccionMP3.class);
        startActivity(siguiente);
    }

    public void volver(View view){
        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }
}
