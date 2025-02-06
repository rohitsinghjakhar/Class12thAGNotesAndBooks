package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetQuizActivity extends AppCompatActivity {

    String[] items = {

            "कृषि विज्ञान 1 (20 प्रश्न 24 मिनट)",
            "कृषि विज्ञान 2 (20 प्रश्न 24 मिनट)",
            "कृषि विज्ञान 3 (20 प्रश्न 24 मिनट)",
            "कृषि विज्ञान 4 (20 प्रश्न 24 मिनट)",
            "कृषि विज्ञान 5 (20 प्रश्न 24 मिनट)",


            "कृषि जीव विज्ञान 1 (20 प्रश्न 24 मिनट)",
            "कृषि जीव विज्ञान 2 (20 प्रश्न 24 मिनट)",
            "कृषि जीव विज्ञान 3 (20 प्रश्न 24 मिनट)",
            "कृषि जीव विज्ञान 4 (20 प्रश्न 24 मिनट)",
            "कृषि जीव विज्ञान 5 (20 प्रश्न 24 मिनट)",


            "कृषि रसायन विज्ञान 1 (20 प्रश्न 24 मिनट)",
            "कृषि रसायन विज्ञान 2 (20 प्रश्न 24 मिनट)",
            "कृषि रसायन विज्ञान 3 (20 प्रश्न 24 मिनट)",
            "कृषि रसायन विज्ञान 4 (20 प्रश्न 24 मिनट)",
            "कृषि रसायन विज्ञान 5 (20 प्रश्न 24 मिनट)",


            "गणित 1 (20 प्रश्न 24 मिनट)",
            "गणित 2 (20 प्रश्न 24 मिनट)",
            "गणित 3 (20 प्रश्न 24 मिनट)",
            "गणित 4 (20 प्रश्न 24 मिनट)",
            "गणित 5 (20 प्रश्न 24 मिनट)",


            "भौतिकी 1 (20 प्रश्न 24 मिनट)",
            "भौतिकी 2 (20 प्रश्न 24 मिनट)",
            "भौतिकी 3 (20 प्रश्न 24 मिनट)",
            "भौतिकी 4 (20 प्रश्न 24 मिनट)",
            "भौतिकी 5 (20 प्रश्न 24 मिनट)",


            "JET परीक्षा 1 (200 प्रश्न 120 मिनट)",
            "JET परीक्षा 2 (200 प्रश्न 120 मिनट)",
            "JET परीक्षा 3 (200 प्रश्न 120 मिनट)",
            "JET परीक्षा 4 (200 प्रश्न 120 मिनट)",
            "JET परीक्षा 5 (200 प्रश्न 120 मिनट)"

    };
    String[] urls = {

            // AG
            "https://forms.gle/76EMhyeCLxJmy29u5",
            "https://forms.gle/4BbEkwxetZSUwzsF6",
            "https://forms.gle/2qqqV2Vb5wwf29bR7",
            "https://forms.gle/Noh9vpc3HGncGURi8",
            "https://forms.gle/Xj6NvvnAdz1oo8f8A",


            // AG Biology
            "https://forms.gle/ySedK9vdTYX7DS6k7",
            "https://forms.gle/A9RFki6szpFaQF1k9",
            "https://forms.gle/iCodeWtUd96uDTLa7",
            "https://forms.gle/1karmMdYTwC4wY5H7",
            "https://forms.gle/AqeLLquEEXw9Xv726",


            // AG Chemistry
            "https://forms.gle/ud3AQoBaB8jLMQZX8",
            "https://forms.gle/XVrebgnqR5YskneeA",
            "https://forms.gle/o1S9fLrdkKFDADFP8",
            "https://forms.gle/NNAS4a3642FpCRn47",
            "https://forms.gle/TuqK29nhr4ZJyeXS6",


            // Maths
            "https://forms.gle/mTzmVtMhDwUeLL4A7",
            "https://forms.gle/yG2X7LznEZXYCrcn9 ",
            "https://forms.gle/Gv8HuqjzGYaFXku3A ",
            "https://forms.gle/Z6MEvgkCYDdvpW5j9 ",
            "https://forms.gle/e22iyw2RoR1gLWzG7 ",


            //Physics
            "https://forms.gle/WeZt6egsrRRgfuxG7",
            "https://forms.gle/ba3cTMjzvETTtg6g8",
            "https://forms.gle/Dk7YCbwiQ6QnG2s38 ",
            "https://forms.gle/pxDzx3mPwx2Jgqjr5 ",
            "https://forms.gle/bYQuuRv8RFNZx1oD6 ",


            // JET Exam
            "https://forms.gle/M7QoxrrLgAvTbX8h7",
            "https://forms.gle/kc8HBXgNSqodrNYe8",
            "https://forms.gle/Bf5tXHrCU9dieygd8",
            "https://forms.gle/qSbgBuTk7TrzzZ5f8",
            "https://forms.gle/Nvps4nnkqy5cpKy86"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet_quiz);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
