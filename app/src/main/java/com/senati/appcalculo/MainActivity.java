package com.senati.appcalculo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaramos las Variables Java
    private EditText edtNumero1;
    private EditText edtNumero2;
    private Button btnSumar;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de vistas : Java
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        btnSumar = findViewById(R.id.btnSumar);
        txtResultado = findViewById(R.id.textResultado);

        // Acción al presionar el botón : Java
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener valores y sumar
                String num1 = edtNumero1.getText().toString();
                String num2 = edtNumero2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    int resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
                    txtResultado.setText("Resultado: " + resultado);
                } else {
                    txtResultado.setText("Ingresa ambos números");
                }
            }
        });
        // Fin : Boton Java
    }
}