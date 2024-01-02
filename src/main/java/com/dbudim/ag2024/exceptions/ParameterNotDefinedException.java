package com.dbudim.ag2024.exceptions;

public class ParameterNotDefinedException extends RuntimeException {

    public ParameterNotDefinedException(String parameter) {
        super("Parameter '" + parameter + "' not defined");
    }

}
