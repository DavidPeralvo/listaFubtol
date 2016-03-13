package com.example.davidperalvogomez.listafutbol;

/**
 * Created by DavidPeralvoGomez on 11/3/16.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class MyListAdapter extends BaseAdapter {

    Intent intent;
    private Activity activity;
    private ArrayList<Equipo> equipos;

    public MyListAdapter(Activity activity, ArrayList<Equipo> sitios) {
        this.activity = activity;
        this.equipos = sitios;
    }


    @Override
    public int getCount() {
        return equipos.size();
    }

    @Override
    public Object getItem(int position) {
        return equipos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View converView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_view, null, true);

        final Equipo currentEquipo = equipos.get(position);

        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(currentEquipo.getImagen());

        TextView tvSitio = (TextView) view.findViewById(R.id.tvSitio);
        tvSitio.setText(currentEquipo.getNombre());

        TextView tvDescripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        tvDescripcion.setText(currentEquipo.getDescripcion());

        final LinearLayout linearElement = (LinearLayout) view.findViewById(R.id.linearElement);
        linearElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(activity, MostrarEquipo.class);
                intent.putExtra("EQUIPO", currentEquipo);
                activity.startActivity(intent);
            }
        });

        return view;
    }

}