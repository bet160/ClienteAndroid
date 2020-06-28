package com.example.clientestreaming;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegistroUsuario extends AppCompatActivity {

    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
    }
}
