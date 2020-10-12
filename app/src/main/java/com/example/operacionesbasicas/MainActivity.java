package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView suma;
    private TextView resta;
    private TextView multiplicacion;
    private TextView division;
    private Button btncalcular;
    private Button btnborrar;

    double num1;
    double num2;
    double resultsum,resultrest,resultmulti,resultdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.edit_text1);
        n2 = (EditText) findViewById(R.id.edit_text2);
        suma = (TextView) findViewById(R.id.textViewSuma);
        resta = (TextView) findViewById(R.id.textViewResta);
        multiplicacion = (TextView) findViewById(R.id.textViewMultiplicacion);
        division = (TextView) findViewById(R.id.textViewDivision);
        btncalcular = (Button) findViewById(R.id.btn1);
        btnborrar = (Button) findViewById(R.id.btn2);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerNumeros();

                //suma
                resultsum = num1 + num2;
                suma.setText(String.valueOf(resultsum));

                //resta
                resultrest = num1 - num2;
                resta.setText(String.valueOf(resultrest));

                //multiplicacion
                resultmulti = num1 * num2;
                multiplicacion.setText(String.valueOf(resultmulti));

                //division
                resultdiv = num1 / num2;
                division.setText(String.valueOf(resultdiv));

            }
        });

        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrar();
            }
        });
    }

        //Obtiene los valores numericos de los EditText
        private void obtenerNumeros() {
            num1 = Double.parseDouble(n1.getText().toString());
            num2 = Double.parseDouble(n2.getText().toString());
        }

    private void borrar() {

        n1.setText("");
        n2.setText("");
        suma.setText("");
        resta.setText("");
        multiplicacion.setText("");
        division.setText("");
    }
}




