package com.appenem.memoriaenem.ui.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.appenem.memoriaenem.R;
import com.appenem.memoriaenem.Resposta;

public class GrupoMatematica extends Fragment {

    private ModeloFragmentos modeloFragmentos;
    private String grupo = "numeros";

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modeloFragmentos =
                ViewModelProviders.of(this).get(ModeloFragmentos.class);

        View root = inflater
                .inflate(R.layout.fragment_gallery, container, false);

        LinearLayout listaMaterias = root.findViewById(R.id.materias);


        listaMaterias.addView(modeloFragmentos.pegueView(root.getContext(), "matematica", grupo ));

        return root;
    }
}