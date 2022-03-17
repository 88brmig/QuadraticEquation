package mx.edu.uttijuana.exam;

import androidx.annotation.Nullable;

public class InvalidEquationException extends Exception {
    private String message;

    public InvalidEquationException() {
       this.message = "Discriminant must be greater than zero";
    }

    @Nullable
    @Override
    public String getMessage() {
        return this.message;
    }
}
