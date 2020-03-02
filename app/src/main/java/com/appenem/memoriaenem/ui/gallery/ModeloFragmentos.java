package com.appenem.memoriaenem.ui.gallery;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModel;

import com.appenem.memoriaenem.FragmentListaDisciplinas;
import com.google.android.gms.common.internal.Asserts;

import java.security.Policy;

public class ModeloFragmentos extends ViewModel {

    public View pegueView(
            final Context root,
            final String materia,
            final String grupo
    ){
        final CardView cv = new CardView(root);
        cv.setCardBackgroundColor(Color.BLUE);
        cv.setRadius(50);

        final TextView textView = new TextView(root);
        textView.setText(materia);
        textView.setAllCaps(true);
        textView.setTextSize(50);
        textView.setText(materia);
        textView.setTextColor(Color.WHITE);

        cv.setContentPadding(20,30,20,20);
        LayoutParams lp = new LinearLayout.LayoutParams(
                800,
                800
        );
        final WebView wb = new WebView(root);
        wb.setLayoutParams(lp);
        wb.loadUrl("file:///android_asset/" +
                grupo + "/" +
                materia +"/" +
                "2019_q1.html"
        );

        wb.getSettings().setDomStorageEnabled(true);
        wb.getSettings().setSupportMultipleWindows(true);
        wb.getSettings().setSupportMultipleWindows(true);
        wb.getSettings().setDefaultFontSize(20);

        /*textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
    });*/
        cv.setUseCompatPadding(true);
        LinearLayout ll = new LinearLayout(root);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.addView(textView);
        ll.addView(wb);

        cv.addView(ll);
        return cv;
    }
}