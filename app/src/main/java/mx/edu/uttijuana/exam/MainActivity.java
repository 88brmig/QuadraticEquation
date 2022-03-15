package mx.edu.uttijuana.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(view -> solveQuadraticEquation());
    }

    public void solveQuadraticEquation(){
        EditText editA = (EditText) findViewById(R.id.editTextA);
        EditText editB = (EditText) findViewById(R.id.editTextB);
        EditText editC = (EditText) findViewById(R.id.editTextC);

        EditText editX1 = (EditText) findViewById(R.id.editTextX1);
        EditText editX2 = (EditText) findViewById(R.id.editTextX2);

        try {
            int a = Integer.parseInt(editA.getText().toString());
            int b = Integer.parseInt(editB.getText().toString());
            int c = Integer.parseInt(editC.getText().toString());

            QuadraticEquation q = new QuadraticEquation(a,b,c);

            editX1.setText(String.valueOf(q.getX1()));
            editX2.setText(String.valueOf(q.getX2()));
        } catch (InvalidDiscriminantException e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}