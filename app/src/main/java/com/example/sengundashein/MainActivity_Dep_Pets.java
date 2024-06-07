package com.example.sengundashein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_Dep_Pets extends AppCompatActivity {
    private TextView txt_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_dep_pets);

        txt_name = (TextView) findViewById(R.id.txt_view_name_home2);
        String nombre = getIntent().getStringExtra("name");
        txt_name.setText(nombre);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void cambiar_menu (View view){
        Intent var_call_Departamentos=new Intent(this, MainActivity.class) ;
        var_call_Departamentos.putExtra("name", txt_name.getText().toString());
        startActivity(var_call_Departamentos);
    }
}