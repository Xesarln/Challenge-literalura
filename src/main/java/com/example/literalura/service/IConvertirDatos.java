package com.example.literalura.service;

public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase);


}
