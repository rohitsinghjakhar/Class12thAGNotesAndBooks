package com.rohitchoudhary.a12thagriculturenotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetTaiyariActivity extends AppCompatActivity {

    GridLayout MainGridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_jet_taiyari);

        MainGridLayout = (GridLayout) findViewById(R.id.JetTaiyariGridLayout);
        setSingleEvent(MainGridLayout);
    }

    private void setSingleEvent(GridLayout mainGridLayout) {


        for (int i = 0; i < MainGridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) MainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(JetTaiyariActivity.this, JetNotesActivity.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(JetTaiyariActivity.this, JetOldPapersActivity.class);
                        startActivity(intent);
                    }

                    else if (finalI == 2) {
                        Intent intent = new Intent(JetTaiyariActivity.this, JetTestPapersActivity.class);
                        startActivity(intent);
                    }

                    else if (finalI == 3) {
                        Intent intent = new Intent(JetTaiyariActivity.this, JetQuizActivity.class);
                        startActivity(intent);
                    }


                }
            });

        }

    }
}