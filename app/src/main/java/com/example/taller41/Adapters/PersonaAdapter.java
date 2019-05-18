package com.example.taller41.Adapters;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.taller41.R;

import java.util.List;

public class PersonaAdapter extends ArrayAdapter<Persona> {

    int mlayoudId;

    public PersonaAdapter(Context context, int layoudId, List<Persona> personaList) {
        super(context, layoudId,personaList);
        mlayoudId=layoudId;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {


        Persona persona = getItem(position);
        String name = persona.getName();
        String lastName = persona.getLastName();
        String email = persona.getEmail();

        if(view == null){

            LayoutInflater inflater =(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(mlayoudId,parent,false );
        }

        TextView nameView =(TextView)view.findViewById(R.id.txtName);
        TextView lastNameView =(TextView)view.findViewById(R.id.txtLastName);
        TextView emailView =(TextView)view.findViewById(R.id.txtEmail);

        nameView.setText(name);
        lastNameView.setText(lastName);
        emailView.setText(email);

        return view;
    }
}
