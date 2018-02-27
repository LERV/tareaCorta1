package com.luis.edward.tareacorta1_conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convertirDinero(View view)
    {
        CheckBox chkButColones=findViewById(R.id.CheckButColones);
        CheckBox chkButDolores=findViewById(R.id.CheckButDolares);
        EditText montoEdit=findViewById(R.id.editMonto);
        Double monto=Double.valueOf(montoEdit.getText().toString());
        if (chkButColones.isChecked() && !chkButDolores.isChecked())
        {
            Double montoColones=monto*571;
            String temp=montoEdit.getText().toString()+" dólares, equivale a: "+String.valueOf(montoColones)+" colones";
            Toast toast = Toast.makeText(this,temp, Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            if (!chkButColones.isChecked() && chkButDolores.isChecked())
            {
                Double montoDolares= monto/571;
                //double dTemp = montoDolares;
                //DecimalFormat fTemp = new DecimalFormat("##.00000");
                //montoDolares=Double.valueOf(fTemp.format(dTemp));
                String temp=montoEdit.getText().toString()+" colones, equivale a: "+String.valueOf(montoDolares)+" dólares";
                Toast toast = Toast.makeText(this,temp, Toast.LENGTH_LONG);
                toast.show();

            }



        }


    }
}
