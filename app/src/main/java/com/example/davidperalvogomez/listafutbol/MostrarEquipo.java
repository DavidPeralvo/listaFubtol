package com.example.davidperalvogomez.listafutbol;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarEquipo  extends AppCompatActivity{
     TextView title;
     ImageView image;
     TextView history;
     Equipo equipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar);

        title = (TextView)findViewById(R.id.tvTitle);
        image = (ImageView) findViewById(R.id.imgView);
        history = (TextView)findViewById(R.id.tvHistory);

    equipo = (Equipo)getIntent().getExtras().getSerializable("EQUIPO");
        title.setText(equipo.getNombre());
        image.setImageResource(equipo.getImagen());
      history.setText(equipo.getHistoria());
    }
}
