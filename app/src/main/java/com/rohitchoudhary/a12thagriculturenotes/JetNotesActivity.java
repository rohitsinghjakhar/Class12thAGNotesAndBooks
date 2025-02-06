package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetNotesActivity extends AppCompatActivity {

        String[] items = {

                "उद्यान विज्ञान",
                "सस्य विज्ञान",
                "वनस्पति विज्ञान",
                "प्राणीशास्त्र",
                "पशुपालन",
                "गणित",
                "भौतिकी",
                "रसायन विज्ञान",

                "Botany",
                "Chemistry",
                "Mathematics",
                "Physics"

        };
        String[] urls = {

                "https://drive.google.com/file/d/1_ycdMj2b77s7SUri1vjELaHQIRWUrHgc/view?usp=sharing",
                "https://drive.google.com/file/d/1OrIcpkIV-xs6sOu0PPnE4xMZ5eNMRVBe/view?usp=sharing",
                "https://drive.google.com/file/d/1BderBqXK0ARBYfZx73WWbp81NSQ5oVAm/view?usp=drive_link",
                "https://drive.google.com/file/d/1VUq_aXvbJcYmVW8e4u0TB4PzXw9KgWK7/view?usp=drive_link",
                "https://drive.google.com/file/d/1BmmGhXcFOamCqXu8suLR_vHolnFeLGdS/view?usp=sharing",
                "https://drive.google.com/file/d/1bKoMeScdXLlnwY6294JcAShNPPwsIAp7/view?usp=drive_link",
                "https://drive.google.com/file/d/1zI19z-hzPPJADWBCklmdNjpEI9SKF3a-/view?usp=drive_link",
                "https://drive.google.com/file/d/1BKEpoAiiJ_1slq2KEiG0hYaCYbpFMKTi/view?usp=drive_link",

                "https://drive.google.com/file/d/1Sb6z1p3jHL3x-Y--5DgA7cUUxa-JCTOo/view?usp=drive_link",
                "https://drive.google.com/file/d/1tFRGzf0dR34H8J_n9jmZa97eQwXy0-U_/view?usp=drive_link",
                "https://drive.google.com/file/d/1zW3wYFLq3pHcYu8DKyRortfseePa6FKp/view?usp=drive_link",
                "https://drive.google.com/file/d/1sQP5E2oka8voxTXIlmRcvXXBEccNsnRj/view?usp=drive_link"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_jet_notes);

            ListView listView = findViewById(R.id.listView);
            CustomAdapter adapter = new CustomAdapter(this, items, urls);
            listView.setAdapter(adapter);
        }
    }
