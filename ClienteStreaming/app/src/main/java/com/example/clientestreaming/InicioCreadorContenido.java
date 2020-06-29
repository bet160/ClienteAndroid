package com.example.clientestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InicioCreadorContenido extends AppCompatActivity {

    private Window window;
    private Button artista;
    private ImageButton volver;
    private Button album;
    private ImageButton boton;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_creador_contenido);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
        artista=(Button)findViewById(R.id.registroArtista);
        volver=(ImageButton) findViewById(R.id.botonVolver);
        album=(Button)findViewById(R.id.registroAlbum);
    }

    public void registroArtista(View view){
        Intent siguiente = new Intent(this,RegistrarArtista.class);
        startActivity(siguiente);
    }

    public void registroAlbum(View view){
        Intent siguiente = new Intent(this,RegistrarAlbum.class);
        startActivity(siguiente);
    }
}
