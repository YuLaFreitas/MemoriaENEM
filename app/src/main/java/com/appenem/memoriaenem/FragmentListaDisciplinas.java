package com.appenem.memoriaenem;
import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.appenem.memoriaenem.ui.gallery.ModeloFragmentos;

public class FragmentListaDisciplinas extends ListFragment {

    public FragmentListaDisciplinas() {}

    private ModeloFragmentos modeloFragmentos;
    private String grupo = "humanas";
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modeloFragmentos =
                ViewModelProviders.of(this).get(ModeloFragmentos.class);

        View root = inflater
                .inflate(R.layout.fragment_gallery, container, false);

        LinearLayout listaMaterias = root.findViewById(R.id.materias);
        LinearLayout list = new LinearLayout(listaMaterias.getContext());
        list.setGravity(LinearLayout.VERTICAL);

        LinearLayout web = new LinearLayout(listaMaterias.getContext());

        list.addView(modeloFragmentos.pegueView(root.getContext(),
                "filosofia", grupo ));
        list.addView(modeloFragmentos.pegueView(root.getContext(),
                "geografia", grupo ));
        list.addView(modeloFragmentos.pegueView(root.getContext(),
                "historia", grupo ));
        list.addView(modeloFragmentos.pegueView(root.getContext(),
                "sociologia", grupo ));
        WebView pag = new WebView(listaMaterias.getContext());

        web.addView(pag);

        return root;
    }

}

/*

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {


private String grupo = "linguagens";
    private String materia = "espanhol";
    private int ano = 2019;
    private int quest = 1;


* public  void setUrl(String grupo,
                        String  materia,
                        int ano, int quest){
        this.grupo = grupo;
        this.materia = materia;
        this.ano = ano;
        this.quest = quest;
    }
*
*
*
*  private String grupo = "linguagens";
    private String materia = "espanhol";
    private int ano = 2019;
    private int quest = 1;

    public  void setUrl(String grupo,
                        String  materia,
                        int ano, int quest){
        this.grupo = grupo;
        this.materia = materia;
        this.ano = ano;
        this.quest = quest;
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater
                .inflate(R.layout.fragment_gallery, container, false);

        WebView paginaWQ = new WebView(root.getContext());

                paginaWQ.getSettings().setJavaScriptEnabled(true);
                paginaWQ.getSettings().setDomStorageEnabled(true);
                paginaWQ.getSettings().setSupportMultipleWindows(true);
                paginaWQ.getSettings().getBlockNetworkLoads();

                paginaWQ.addJavascriptInterface(
                        new Resposta(root.getContext()), "Resposta");

               paginaWQ.loadUrl(
                       "file:///android_asset/"
                       +"/"+ grupo +"/"+ materia +"/"+
                       ano +"_q" +  quest +".html"
               );
        return root;
    }*/
