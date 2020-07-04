package com.example.clientestreaming;

import ProtoGrpc.AudioStreamGrpc;
import ProtoGrpc.AudioStreaming;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.os.Build;
import android.os.AsyncTask;

import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView nombreUsuario;
    private TextView contraseña;
    private Button botonRegistrar;
    private Button botonIngresar;
    private Window window;
    private ManagedChannel canal;
    private AudioStreamGrpc.AudioStreamStub stub;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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
        ObtenerAudioFormat();
    }

    public  void  ObtenerAudioFormat(){

        canal = ManagedChannelBuilder.forAddress("192.168.1.74",5000).usePlaintext().build();
        stub = AudioStreamGrpc.newStub(canal);
        final ProtoGrpc.AudioStreaming.Cancion nombreCancion = ProtoGrpc.AudioStreaming.Cancion.newBuilder()
                .setNombre("adasd")
                .build();

        stub.elegirCancion(nombreCancion, new StreamObserver<AudioStreaming.AudioFormat>() {
            @Override
            public void onNext(AudioStreaming.AudioFormat value) {
            }

            @Override
            public void onError(Throwable t) {

                Toast toast = Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_LONG);
                toast.show();
            }

            @Override
            public void onCompleted() {

            }
        });
    }

    public void ingresar(View view){
        new Login().execute();
        Intent siguiente = new Intent(this,MenuPrincipal.class);
        startActivity(siguiente);
    }

    public void registrarse(View view){
        Intent siguiente = new Intent(this,RegistroUsuario.class);
        startActivity(siguiente);
    }

    public static class Login extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            final String url="https://localhost:5001/";
            Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
            IServicioLogin servicioLogin = retrofit.create(IServicioLogin.class);
            Call<List<ResponseService>> response = servicioLogin.Get();
            try {
                for(ResponseService user : response.execute().body()) {
                    Log.e("Respuesta ", user.getNombreUsuario() + " " + user.getCorreoElectronico());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
