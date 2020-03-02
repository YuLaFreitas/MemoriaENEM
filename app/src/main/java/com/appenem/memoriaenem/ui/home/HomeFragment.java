package com.appenem.memoriaenem.ui.home;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.appenem.memoriaenem.R;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    public View onCreateView(final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final HomeViewModel homeViewModel =
                ViewModelProviders.of(this)
                        .get(HomeViewModel.class);

        final View root = inflater.inflate(
                R.layout.fragment_home, container, false);

        final LinearLayout ll = root.findViewById(R.id.layoutHome);
        final TextView textView = root.findViewById(R.id.text_home);

        final CardView[] cardView = new CardView[4];

        for(int n = 0; n<4; n++){
            final int finalN = n;
            homeViewModel.getRes(n).observe(getViewLifecycleOwner(),
                    new Observer<Integer>() {
                        @Override
                        public void onChanged(Integer integer) {
                            LayoutParams lpCV = new LayoutParams(
                                    700,
                                    200
                            );
                            LayoutParams lpTX = new LayoutParams(
                                    600,
                                    200
                            );

                            final TextView tx = new TextView(root.getContext());

                            tx.setTextColor(Color.BLUE);
                            tx.setGravity(View.TEXT_ALIGNMENT_CENTER);
                            tx.setText(pegueNome(finalN));

                            tx.setTextSize(50);
                            tx.setY(50);
                            tx.setX(80);

                            cardView[finalN] = new CardView(root.getContext());
                            cardView[finalN].setX(50);
                            cardView[finalN].setY(10+(finalN*15));
                            cardView[finalN].setId(finalN);
                            cardView[finalN].setBackgroundColor(Color.WHITE);

                            cardView[finalN].addView(tx, lpTX);
                            cardView[finalN].setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    Snackbar snackbar
                                            = Snackbar.make(v, pegueNome(v.getId()), Snackbar.LENGTH_INDEFINITE);
                                    snackbar.show();
                                }
                            });

                            ll.setBackgroundColor(Color.BLACK);
                            ll.addView(cardView[finalN], lpCV);

                        }
                        private String pegueNome(int n){
                            String nome = null;
                            switch (n){
                                case 0:
                                    nome = getResources().getString(R.string.nome_mat);
                                    break;
                                case 1:
                                    nome = getResources().getString(R.string.nome_linguagens);
                                    break;
                                case 2:
                                    nome = getResources().getString(R.string.nome_humanas);
                                    break;
                                case 3:
                                    nome = getResources().getString(R.string.nome_natureza);
                                break;
                            }
                            return nome;//+"\n"+getResources().getString(R.string.nome_complementar);
                        }
                    });
        }

        homeViewModel.getText().observe(getViewLifecycleOwner(),
                new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setTextSize(30);
                textView.setText(s);

            }
        });

        return root;
    }
}