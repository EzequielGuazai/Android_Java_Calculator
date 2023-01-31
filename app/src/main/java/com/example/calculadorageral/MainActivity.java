package com.example.calculadorageral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText pnmr = findViewById(R.id.primeiro_ed);
        EditText snmr = findViewById(R.id.segundo_ed);
        EditText oper = findViewById(R.id.operador_ed);
        TextView tvresu = findViewById(R.id.resultado_tv);

            try {
                float p = Float.parseFloat(pnmr.getText().toString());
                float s = Float.parseFloat(snmr.getText().toString());
                String operador = oper.getText().toString();

                if(operador.equals("+")) {
                    tvresu.setText(Float.toString(p + s));
                }
                else if(operador.equals("-")) {
                    tvresu.setText(Float.toString(p - s));
                }
                else if(operador.equals("*")) {
                    tvresu.setText(Float.toString(p * s));
                }
                else if(operador.equals("r") || operador.equals("R")) {
                    tvresu.setText(Float.toString((float) Math.sqrt(p)));
                }else{
                    tvresu.setText("Operador Invalido");
                    Toast.makeText(this, "Operador Invalido", Toast.LENGTH_SHORT).show();
                }
            }catch (Exception e){
                Toast.makeText(this, "Dados Invalidos", Toast.LENGTH_SHORT).show();
            }
    }
}