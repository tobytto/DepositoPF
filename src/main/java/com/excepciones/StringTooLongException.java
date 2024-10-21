package com.excepciones;

public class StringTooLongException extends Exception{
    public StringTooLongException() {
        super("String too short or too long. String lenght must be 8....");
    }

    // Constructor que permite un mensaje personalizado
    public StringTooLongException(String message) {
        super(message);
    }
}
