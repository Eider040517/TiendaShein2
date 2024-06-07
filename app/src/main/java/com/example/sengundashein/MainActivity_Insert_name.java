package com.example.sengundashein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Insert_name extends AppCompatActivity {
private EditText  nombreIngresado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_insert_name);

        nombreIngresado= (EditText)findViewById(R.id.txt_nombre);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

public void registrarNombre(View view){
    String nombre= nombreIngresado.getText().toString();
        if (nombre.length()==0){
            Toast.makeText(this,"Debes ingresar un nombre", Toast.LENGTH_LONG). show();

        }
        if (nombre.length()!=0){
            Toast.makeText(this, "Ingreso en proceso",Toast.LENGTH_SHORT).show();
            Intent var_call_Departamentos=new Intent(this, MainActivity_Dep_Select.class) ;
            var_call_Departamentos.putExtra("name", nombreIngresado.getText().toString());
            startActivity(var_call_Departamentos);
        }
}



}