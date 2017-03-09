package br.com.fiap.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1, edtVal2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = (EditText) findViewById(R.id.edtVal1);
        edtVal2 = (EditText) findViewById(R.id.edtVal2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
    }
}
