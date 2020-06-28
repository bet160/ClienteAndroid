package com.example.clientestreaming;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ReproduccionMP3 extends AppCompatActivity {

    private Window window;
    private Button play;
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
        mp=MediaPlayer.create(this,R.raw.gta);

    }

    public void reproducir(View view){
        if(mp.isPlaying()){
            mp.pause();
        }
        else{
            mp.start();

        }
    }
}
