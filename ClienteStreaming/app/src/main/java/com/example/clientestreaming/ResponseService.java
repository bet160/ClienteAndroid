package com.example.clientestreaming;

import java.util.HashMap;
import java.util.Map;

public class ResponseService {

    private Integer id;

    private String nombreUsuario;

    private String correoElectronico;

    private String contraseña;

    private String tipo;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    public String getContraseña() {
        return contraseña;
    }


    public void setContraseña(String contraseA) {
        this.contraseña = contraseña;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}