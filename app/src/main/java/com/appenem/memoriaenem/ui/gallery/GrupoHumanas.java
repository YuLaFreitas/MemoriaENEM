package com.appenem.memoriaenem.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.appenem.memoriaenem.R;

public class GrupoHumanas extends Fragment {

    private ModeloFragmentos modeloFragmentos;
    private String grupo = "humanas";

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modeloFragmentos =
                ViewModelProviders.of(this).get(ModeloFragmentos.class);

        View root = inflater
                .inflate(R.layout.fragment_gallery, container, false);

        LinearLayout listaMaterias = root.findViewById(R.id.materias);

        listaMaterias.setGravity(LinearLayout.HORIZONTAL);

        listaMaterias.addView(modeloFragmentos.pegueView(root.getContext(),
                "filosofia", grupo ));
        listaMaterias.addView(modeloFragmentos.pegueView(root.getContext(),
                "geografia", grupo ));
        listaMaterias.addView(modeloFragmentos.pegueView(root.getContext(),
                "historia", grupo ));
        listaMaterias.addView(modeloFragmentos.pegueView(root.getContext(),
                "sociologia", grupo ));
        return root;
    }
}