package com.example.fragmentbasicapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleFragment extends Fragment {
    Button firstbutton;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.activity_simple_fragment,container,false);
        firstbutton=view.findViewById(R.id.first_button);
        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "HI,Fragment is here!!!!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

    }

