package com.example.clientestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ReproduccionMP3 extends AppCompatActivity {

    private Window window;
    private Button play;
    private ProgressBar progressBar;
    private ImageButton adelantar;
    private ImageButton atrasar;
    private ImageButton volver;
    private TextView tiempoAudio;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproduccion_m_p3);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
        play=(Button)findViewById(R.id.busqueda);
        mp=MediaPlayer.create(this,R.raw.hail);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setProgress(100);
        adelantar=(ImageButton)findViewById(R.id.adelantarAudio);
        volver=(ImageButton)findViewById(R.id.botonVolver);
        atrasar=(ImageButton)findViewById(R.id.atrasarAudio);
        tiempoAudio=(TextView)findViewById(R.id.tiempoAudio);
    }

    public void reproducir(View view){
        if(mp.isPlaying()){
            mp.pause();
        }
        else{
            mp.start();

        }
    }

    public void cambiar(View view){
        mp.pause();
        mp=MediaPlayer.create(this,R.raw.gta);
        mp.start();
    }

    public void volver(View view){
        Intent siguiente = new Intent(this,MenuPrincipal.class);
        startActivity(siguiente);
    }

    public void atrasarAudio(View view){
        mp.pause();
        mp=MediaPlayer.create(this,R.raw.dale);
        mp.start();
    }
}
