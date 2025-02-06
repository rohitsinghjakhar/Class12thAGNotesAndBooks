package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LinksActivity extends AppCompatActivity {
    String[] items = {

            "राजस्थान बोर्ड, अजमेर (BSER)",
            "कृषि और किसान कल्याण विभाग (DAFW) ",
            "कृषि अनुसंधान एवं शिक्षा विभाग (DARE) ",
            "भारतीय कृषि अनुसंधान परिषद (ICAR)",
            "भारतीय कृषि कौशल परिषद (ASCI)",

            "राष्ट्रीय मूल्यांकन एवं प्रत्यायन परिषद (NAAC)",
            "राष्ट्रीय कैडेट कोर (NCC)",
            "भारतीय सर्वोच्च न्यायालय (Supreme Court) ",
            "भारतीय निर्वाचन आयोग (Election Commission of INDIA ) ",
            "भारतीय रिजर्व बैंक (RBI)",
            "आधार कार्ड",
            "पैन कार्ड" ,
            "पासपोर्ट "
    };
    String[] urls = {

            "https://rajeduboard.rajasthan.gov.in/ ",
            "https://agriwelfare.gov.in/ ",
            "https://dare.gov.in/en ",
            "https://icar.org.in/ ",
            "https://asci-india.com/",

            "http://naac.gov.in/index.php/en/ ",
            "https://indiancc.nic.in/ ",
            "https://www.sci.gov.in/ ",
            "https://www.eci.gov.in/ ",
            "https://www.rbi.org.in/",
            "https://uidai.gov.in/en/ ",
            "https://www.pan.utiitsl.com/",
            "https://www.passportindia.gov.in/AppOnlineProject/welcomeLink# ",

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}