package com.luis.edward.tareacorta1_conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcularEdad(View view)
    {
        RadioButton radButColones=findViewById(R.id.radioButColones);
        RadioButton radButDolores=findViewById(R.id.radioButDolares);
        EditText montoEdit=findViewById(R.id.editMonto);
        Integer monto=Integer.valueOf(montoEdit.getText().toString());
        if (radButColones.isChecked() && !radButDolores.isChecked())
        {
            Integer montoColones=monto*571;
            String temp=montoEdit.getText().toString()+"dolares, equivale a: "+String.valueOf(montoColones)+" colones";
            Toast toast = Toast.makeText(this,temp, Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            if (!radButColones.isChecked() && radButDolores.isChecked())
            {
                Integer montoDolares=monto/571;
                String temp=montoEdit.getText().toString()+"colones, equivale a: "+String.valueOf(montoColones)+" colones";
                Toast toast = Toast.makeText(this,temp, Toast.LENGTH_LONG);
                toast.show();
            }
            }



        }


    }
}
