package com.example.katiuskagonzalez.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.katiuskagonzalez.calculator.modelo.Calcular;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txe_monto;
    EditText txe_tasa;
    EditText txe_couta;
    EditText txe_total;
    Button btn_calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txe_monto = findViewById(R.id.txe_monto);
        txe_tasa = findViewById(R.id.txe_tasa);
        txe_couta = findViewById(R.id.txe_cuota);
        txe_total = findViewById(R.id.txe_total);
        btn_calcular = findViewById(R.id.btn_calcular);

       btn_calcular.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        //Valor de Monto
        String monto = txe_monto.getText().toString();
        double Monto = Double.parseDouble(monto);
        //Valor de tasa
        String tasa = txe_tasa.getText().toString();
        double Tasa = Double.parseDouble(tasa);
        //Valor de Couta
        String couta = txe_couta.getText().toString();
        double Couta = Double.parseDouble(couta);

        //Instacia
        Calcular cal = new Calcular(Monto,Tasa,Couta);
        double total = cal.getTotal();
        txe_total.setText(total+"RD$");

    }
}
