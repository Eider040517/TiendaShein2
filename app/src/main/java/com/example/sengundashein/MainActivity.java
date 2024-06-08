package com.example.sengundashein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_menu, btn_horarios, btn_direccion;
    private TextView txt_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_menu= (Button)findViewById(R.id.btn_menu);
        btn_horarios= (Button)findViewById(R.id.btn_horarios);
        btn_direccion= (Button)findViewById(R.id.btn_direccion);

        txt_name = (TextView) findViewById(R.id.txt_view_name);
        String nombre = getIntent().getStringExtra("name");
        txt_name.setText(nombre);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void mostrarHorarios(View view) {
        Intent var_mostrar_horarios= new Intent(this,MainActivity_Horarios.class);
        var_mostrar_horarios.putExtra("name", txt_name.getText().toString());
        startActivity(var_mostrar_horarios);
    }
    public void mostrarDireccionTelefono(View view){
        Intent var_mostrar_direcccionTelefono = new Intent(this, MainActivity_Direccion_Telefono.class);
        var_mostrar_direcccionTelefono.putExtra("name", txt_name.getText().toString());
        startActivity(var_mostrar_direcccionTelefono);
    }
    public void insert_name(View view){
        Intent var_insert_name=new Intent(this, MainActivity_Insert_name.class);
        var_insert_name.putExtra("name", txt_name.getText().toString());
        startActivity(var_insert_name);
    }



}