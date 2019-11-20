package jbm.example.p2p2yuli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> listaEstados;
    String [] strEstados;
    Spinner objSpiner;
    ArrayAdapter<String> listEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objSpiner= findViewById(R.id.cargalista);
        strEstados= new String[] {"Nuevo Leon",
        "Aguascalientes",
        "Baja California Norte",
        "Baja California Sur",
        "Campeche",
        "Cohahuila",
        "Colima",
        "Tamaulipas",
        "CDMX",
        "Durango",
        "Veracruz",
        "Tamaulitas",
        "Hidalgo",
        "Querrtaroo",
        "Puebla",
        "Chiapas",
        "Yucatan",
        "Guadalajara",
        "Michoacan",
        "Chihuahua",
        "Oaxaca",
        "Jalisco",
        "Sonora",
        "Tlaxcala",
        "Estado de Mexico",
        "Sinaloa",
        "Nayarit",
        "Tabasco",
        "San Luis Potosi",
        "Morelos",
        "Zacatecas",
        "Guerrero"};
        listaEstados= new ArrayList<String>();
        Collections.addAll(listaEstados,strEstados);
        listEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,
                (List<String>) listEstados);
                objSpiner.setAdapter(listEstados);

    }
}
