package com.example.taller41.Fragmentos;

import android.content.Context;
import android.net.LinkAddress;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.taller41.Adapters.Persona;
import com.example.taller41.Adapters.PersonaAdapter;
import com.example.taller41.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Taller extends Fragment {


    private List<String> list;
    private ArrayAdapter mAdapter;
    private ListView mList;
    private List<Persona> mPersonasList;
    private PersonaAdapter mPersonaAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       // getSupportFragmentManager().beginTransaction().add(android.R.id.content, new Fragment_Taller()).commit();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_, container, false);

        setupUI(view);

        return view;
        }

    private void setupUI(View view) {


        //firstList(view);
        SecondList(view);
    }

    /*private void firstList(View view){

    list = new ArrayList<String>();

        for(int i=1; i<=10;i++){
            list.add("Items: " + i);
        }

        int layoutId = android.R.layout.simple_list_item_1;

        mAdapter= new ArrayAdapter<String>(getContext(),layoutId,list);
        mList = view.findViewById(R.id.listTest);
        mList.setAdapter(mAdapter);
    }*/


    private void SecondList(View view){

         mPersonasList = new ArrayList<Persona>();


        for(int i=1; i<=10;i++){
            String name = ("User: " + i);
            String LastName = ("Last: " + i);
            String email = ("email_" + i + "_email.com" );
            mPersonasList.add(new Persona(name, LastName, email));

        }

        int layoutId = R.layout.persona_listform;

        mPersonaAdapter= new PersonaAdapter(getContext(),layoutId,mPersonasList);
        mList = view.findViewById(R.id.listTest2);
        mList.setAdapter(mPersonaAdapter); // sending the new adapter
    }

}
