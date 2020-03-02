package com.appenem.memoriaenem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Entrada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        animar(0);
    }

    CardView card;
    int a;

    public Runnable runnableEnd(){

        return new Runnable(){
            @Override
            public void run() {
                animar(a+1);
                a += 1;
            }
        };
    }

    public void animar(int n) {


        switch (n) {
            case 0:card = findViewById(R.id.cardBaixoEsquerda);break;
            case 1:card = findViewById(R.id.cardBaixoDireita);break;
            case 2:card = findViewById(R.id.cardTopEsquerda);break;
            case 3:card = findViewById(R.id.cardTopoDireita);break;
            case 4:card = findViewById(R.id.cardMat);break;
            case 5:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }

        card.setVisibility(View.VISIBLE);

        card.animate()
                .setDuration(20000)
                .rotationY(360)
                .rotationX(360)
                .setDuration(500)
                .withEndAction(runnableEnd())
        ;

    }
}