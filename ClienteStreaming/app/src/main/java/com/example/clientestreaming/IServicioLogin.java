package com.example.clientestreaming;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface IServicioLogin {
    @GET("api/CuentaController")
    Call<List<ResponseService>> Get();

}
