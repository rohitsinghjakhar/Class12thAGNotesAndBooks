package com.rohitchoudhary.a12thagriculturenotes;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class NotesActivity extends AppCompatActivity {

    GridLayout NotesGridLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        NotesGridLayout = (GridLayout) findViewById(R.id.NotesGridLayout);
        setSingleEvent(NotesGridLayout);
    }
    private void setSingleEvent(GridLayout mainGridLayout) {

        for (int i = 0; i < NotesGridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) NotesGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(NotesActivity.this, AgActivity.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(NotesActivity.this, AgChemistryActivity.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2) {
                        Intent intent = new Intent(NotesActivity.this, AgBioActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}
