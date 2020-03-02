package com.appenem.memoriaenem;

public class ListaDisplinas {

    private String disciplina;

    public static final ListaDisplinas[] humanas = {
            new ListaDisplinas("FOLOSOFIA"),
            new ListaDisplinas("GOGRÁFIA"),
            new ListaDisplinas("HISTÓRIA"),
            new ListaDisplinas("SOCIOLOGIA")
    };
    public static final ListaDisplinas[] linguagens = {
            new ListaDisplinas("PORTUGUÊS"),
            new ListaDisplinas("INGLÊS"),
            new ListaDisplinas("ESPANHOL"),
            new ListaDisplinas("REDAÇÃO")
    };
    public static final ListaDisplinas[] naturais = {
            new ListaDisplinas("BIOLOGIA"),
            new ListaDisplinas("FÍSICA"),
            new ListaDisplinas("QUÍMICA")
    };
    public static final ListaDisplinas[] numeros = {
            new ListaDisplinas("MATEMÁTCA"),
            };


   public String toString() {
        return disciplina;
    }

    public ListaDisplinas(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }




}
