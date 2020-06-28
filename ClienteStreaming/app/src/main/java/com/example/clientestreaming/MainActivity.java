package com.example.clientestreaming;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private TextView nombreUsuario;
    private TextView contraseña;
    private Button botonRegistrar;
    private Button botonIngresar;
    private Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreUsuario=(TextView)findViewById(R.id.nombreUsuarioInput);
        contraseña=(TextView)findViewById(R.id.ContraseñaInput);
        botonIngresar=(Button)findViewById(R.id.botonIngresar);
        botonRegistrar=(Button)findViewById(R.id.botonRegistrar);
        this.window=getWindow();
        window.setStatusBarColor(Color.parseColor("#0B0B0B"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#43a074")));
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#494949")));
        window.setNavigationBarColor(Color.parseColor("#43a074"));
    }

    public void ingresar(View view){
        Intent siguiente = new Intent(this,MenuPrincipal.class);
        startActivity(siguiente);
    }

    public void registrarse(View view){
        Intent siguiente = new Intent(this,RegistroUsuario.class);
        startActivity(siguiente);
    }
}
