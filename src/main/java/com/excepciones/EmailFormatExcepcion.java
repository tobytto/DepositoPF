package com.excepciones;

public class EmailFormatExcepcion extends Exception{
    public EmailFormatExcepcion() {
        super("Incorrect email format");
    }

    // Constructor que permite un mensaje personalizado
    public EmailFormatExcepcion(String message) {
        super(message);
    }

}
