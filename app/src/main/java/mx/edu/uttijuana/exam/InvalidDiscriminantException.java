package mx.edu.uttijuana.exam;

import androidx.annotation.Nullable;

public class InvalidDiscriminantException extends Exception {
    private String message;

    public InvalidDiscriminantException() {
       this.message = "Discriminant must be greater than zero";
    }

    @Nullable
    @Override
    public String getMessage() {
        return this.message;
    }
}
