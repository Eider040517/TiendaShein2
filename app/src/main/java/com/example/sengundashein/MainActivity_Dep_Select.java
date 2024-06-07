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



public class MainActivity_Dep_Select extends AppCompatActivity {
    private TextView txt_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_dep_select);

        txt_name = (TextView) findViewById(R.id.tv_name_inserted);
        String nombre = getIntent().getStringExtra("name");
        txt_name.setText(nombre);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selecMenDep(View view){
        Intent varMenDepart = new Intent(this, MainActivity_Dep_Men.class);
        varMenDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varMenDepart);
    }
    public void selecWomanDep(View view){
        Intent varWomanDepart = new Intent(this, MainActivity_Dep_Woman.class);
        varWomanDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varWomanDepart);
    }

    public void selecChildDep(View view){
        Intent varChildDepart=new Intent(this, MainActivity_Dep_Child.class);
        varChildDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varChildDepart);
    }
    public void selecHomeDep(View view){
        Intent varHomeDepart=new Intent(this, MainActivity_Dep_Home.class);
        varHomeDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varHomeDepart);
    }
    public void selecBeachDep(View view){
        Intent varBeachDepart=new Intent(this, MainActivity_Dep_Beach.class);
        varBeachDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varBeachDepart);
    }
    public void selecPetsDep(View view){
        Intent varPetsDepart=new Intent(this, MainActivity_Dep_Pets.class);
        varPetsDepart.putExtra("name", txt_name.getText().toString());
        startActivity(varPetsDepart);
    }


}