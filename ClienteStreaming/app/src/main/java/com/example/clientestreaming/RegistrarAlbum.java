package com.example.clientestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrarAlbum extends AppCompatActivity {

    private Window window;
    private ImageButton volver;
    private Button canciones;
    private ImageView imagenAlbum;
    private Button botonCargar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_album);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
        volver=(ImageButton) findViewById(R.id.botonV);
        canciones=(Button)findViewById(R.id.botonCanciones);
        imagenAlbum=(ImageView)findViewById(R.id.imagenAlbum);
        botonCargar=(Button)findViewById(R.id.cargarImagen);
    }

    public void volver(View view){
        Intent siguiente = new Intent(this,InicioCreadorContenido.class);
        startActivity(siguiente);
    }

    public void canciones(View view){
        Intent siguiente = new Intent(this,RegistroCanciones.class);
        startActivity(siguiente);
    }

    public void cargarImagen(View view){
        Intent foto = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        foto.setType("image/");
        startActivityForResult(foto.createChooser(foto,"Seleccione la aplicación"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Uri path=data.getData();
            imagenAlbum.setImageURI(path);
        }
    }
}
