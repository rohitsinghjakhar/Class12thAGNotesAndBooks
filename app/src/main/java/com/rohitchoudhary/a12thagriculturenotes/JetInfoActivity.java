package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetInfoActivity extends AppCompatActivity {
    String[] items = {

            "Official Website 2024",
            "Syllabus",
            "Important Instructions",
            "General GuideLines ",
            "College Wise Cut Off 2024",
            "Answer Key 2024",
            "Seat Matrix Final Spot 2024",
    };
    String[] urls = {

            "https://www.jetauj2024.com/",
            "https://www.jetauj2024.com/PDF/JET-2024%20General%20Guidelines.pdf",
            "https://www.jetauj2024.com/PDF/Important_Instructions_JET_PrePG_PhDEntrance_Examinations_2024.pdf",
            "https://www.jetauj2024.com/PDF/JET-2024%20General%20Guidelines.pdf",
            "https://www.jetauj2024.com/PDF/College%20wise%20Cut-off%20Final%20(Spot)%20Online%20Counselling%20JET-2024%20(23-10-2024).pdf",
            "https://www.jetauj2024.com/PDF/REVISED%20ANSWER%20KEY%20OF%20JET-2024.jpg",
            "https://www.jetauj2024.com/PDF/SEAT%20MATRIX%20FOR%20FINAL%20SPOT%20ONLINE%20COUNSELLING%20(JET-2024)%20(18-10-2024).pdf",
            "https://drive.google.com/file/d/1BKEpoAiiJ_1slq2KEiG0hYaCYbpFMKTi/view?usp=drive_link",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet_info);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}