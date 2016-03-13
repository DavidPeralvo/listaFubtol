package com.example.davidperalvogomez.listafutbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Equipo equipo;
    private ArrayList equipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView) findViewById(R.id.gridview);
        equipos = new ArrayList<>();
        nuevosEquipos();

        MyListAdapter adapter= new MyListAdapter(this,equipos);
        listView.setAdapter(adapter);


    }
    private void nuevosEquipos(){
        equipos.add(new Equipo(R.drawable.cordoba, "Córdoba C.F","Estadio: Nuevo Arcangel","El Córdoba Club de Fútbol es un club de fútbol de España, de la ciudad de Córdoba, Andalucía. Fue fundado en 1954 y desde entonces ha disputado nueve temporadas en la Primera División, donde ocupa la 39 posición en su clasificación histórica. Actualmente juega en la Segunda División de España."));
        equipos.add(new Equipo(R.drawable.realmadrid,"Real Madrid","Estadio: Santiago Bernabeu","El Real Madrid Club de Fútbol, mejor conocido como Real Madrid, es una entidad polideportiva con sede en Madrid, España. Fue declarada oficialmente registrada por sus socios el 6 de marzo de 1902 con el único objeto de la práctica del fútbol."));
        equipos.add(new Equipo(R.drawable.barsa,"Barcelona FC","Estadio: Nou Camp","El Fútbol Club Barcelona (en catalán Futbol Club Barcelona) es una entidad polideportiva de Barcelona (España). Fue fundado como club de fútbol el 29 de noviembre de 1899."));
        equipos.add(new Equipo(R.drawable.valencia,"Valencia FC","Estadio: Mestalla","El Valencia Club de Fútbol es una Sociedad Anónima Deportiva con sede en la ciudad de Valencia, España. El club de fútbol fue fundado el 18 de marzo de 1919. Su primera plantilla juega actualmente en la Primera División de España y disputa los encuentros como local en el Estadio de Mestalla, con una capacidad para 55.000 espectadores."));
        equipos.add(new Equipo(R.drawable.villareal,"Villareal","Estadio: El Madrigal","El Villarreal Club de Fútbol, S. A. D., es un club profesional de fútbol de la Primera División de España, organizado como sociedad anónima deportiva, perteneciente al municipio valenciano de Villarreal en la provincia de Castellón (España)."));
        equipos.add(new Equipo(R.drawable.malaga,"Malaga","Estadio: El Madrigal","El Málaga Club de Fútbol es un club de fútbol profesional de la ciudad española de Málaga. Milita en la Primera División de España, denominada oficialmente Liga BBVA. Su propietario es el sheik catarí Abdullah ben Nasser Al Thani, siendo el primer jeque en convertirse en máximo accionista de un club de fútbol español."));

    }
}
