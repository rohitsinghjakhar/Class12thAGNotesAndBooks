package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class AgActivity extends AppCompatActivity {

    String[] items = {"शस्य विज्ञान, मृदा एवं बीज", "जैविक खेती परिभाषा एवं महत्व", "सिंचाई", "खरपतवार", "शुष्क कृषि", "फल उत्पादन", "फल उत्पादन का महत्व", "प्रवर्धन","फलोधान प्रबंधन", "फलोत्पादन", "फल परिरक्षण", "पशुपालन एवं दुग्ध उत्पादन में पशु प्रबंधन का महत्व",
                        "नस्लें", "पशु रोग", "दुग्ध विज्ञान "};
    String[] urls = {
            "https://drive.google.com/file/d/1fg3K3cheVzu_ShpBjJz-cOejSYnuwaVh/view?usp=drive_link",
            "https://drive.google.com/file/d/1cbDTjOkyZ12eacdFseqAjjXzanViTjl-/view?usp=drive_link",
            "https://drive.google.com/file/d/1kCflvrmu3g9o_i1TV3FnSDHcCOQDymhy/view?usp=drive_link",
            "https://drive.google.com/file/d/1NSVzka1Zh626CNtYfv-ntxdIzCsh9nJb/view?usp=drive_link",
            "https://drive.google.com/file/d/1DS-99vogTSHa51fPc-_LXWbiIZFenlkL/view?usp=drive_link",
            "https://drive.google.com/file/d/1KssiQcwI31dWzRbTTJdVC3tz6icbJhHB/view?usp=drive_link",
            "https://drive.google.com/file/d/1FVpCP2nlTt0CDeUWcweUU2d3QRAzXcvt/view?usp=drive_link",
            "https://drive.google.com/file/d/1DczyHOnOwold8eWdayut_m05nCGfhE7t/view?usp=drive_link",
            "https://drive.google.com/file/d/1n0VKByNIPPxW0easXBN9HXraEyolhurs/view?usp=drive_link",
            "https://drive.google.com/file/d/1zdy5EHMSn4Te3IorgqpITvdb9QbQhDBB/view?usp=drive_link",
            "https://drive.google.com/file/d/1iAIX9T02twHwO_Qmv65r1CP5jr6F9DXJ/view?usp=drive_link",
            "https://drive.google.com/file/d/1TY4c2V9XZ9wG_epSxE45NiYOtOu1GBAA/view?usp=drive_link",
            "https://drive.google.com/file/d/1OAMNh3hemXU6a39eW_d3bdEGMA9U8EPl/view?usp=drive_link",
            "https://drive.google.com/file/d/1mJR-TwxdreAvbiFmlGtxP0LwEgFiy9CG/view?usp=drive_link",
            "https://drive.google.com/file/d/19h90Q5wyrvnf_s48y1kQql9y_KSQEo5_/view?usp=drive_link"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ag);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
