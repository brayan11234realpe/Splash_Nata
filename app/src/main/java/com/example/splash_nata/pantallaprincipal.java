package com.example.splash_nata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class pantallaprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item2:

                Toast.makeText(this,"seleccionar buscar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item1:
                Toast.makeText(this,"Seleccionar configuracion", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"seleccionar Servicios", Toast.LENGTH_SHORT).show();
            case R.id.item4:
                Toast.makeText(this,"seleccionar Citas", Toast.LENGTH_SHORT).show();
            case R.id.item5:
                Toast.makeText(this,"seleccionar Cerrar Sesion", Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }
}