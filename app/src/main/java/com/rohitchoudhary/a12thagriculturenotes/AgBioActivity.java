package com.rohitchoudhary.a12thagriculturenotes;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class AgBioActivity extends AppCompatActivity {

    String[] items = {"पादप प्रजनन",
            "जैव प्रौद्योगिकी एवं उतक संवर्धन",
            "फसलों व भंडारण के कीट",
            "कीट नियंत्रण की विधियां",
            "पादप रोग विज्ञान",
            "खरीफ की फसलों के रोग ",
            "रबी की फसलों के रोग ",
            "फलों के रोग",
            "सूत्रकृमि: घोंघा व श्लय",
            "केंचुए की संरचना एवं कृषि में महत्व",
            "टिड्डा  ",
            "मधुमक्खी पालन व कृषि में महत्व ",
            "पशु परजीवी ",
            "राजस्थान में खाद्य मछलियां"
    };
    String[] urls = {
            "https://drive.google.com/file/d/1lx3ObLPWiDKhQivJYh7PJ1UKvAKarXEi/view?usp=drive_link",
            "https://drive.google.com/file/d/15y_zNWMyY6qAISR6GbFT2bFo0NHuBSWF/view?usp=drive_link",
            "https://drive.google.com/file/d/19YF3-BO4iqChNyozH94dhPUbZaPcaqDU/view?usp=drive_link",
            "https://drive.google.com/file/d/1A8qhZDFb0wifSPPPD0_25qakzXfrlule/view?usp=drive_link",
            "https://drive.google.com/file/d/1P6l9DCqi69jntOnR2qXq80kYYqSedKpW/view?usp=drive_link",
            "https://drive.google.com/file/d/1db6IcSrkwJi1pPusniGaMERSJ5uUryTz/view?usp=drive_link",
            "https://drive.google.com/file/d/1lruUHMfale7B4OmT7Uw0AjKGXWKoaSxj/view?usp=drive_link",
            "https://drive.google.com/file/d/1BiEjkZJmVhfk8Iw920CVfBl1BFE1MfOf/view?usp=drive_link",
            "https://drive.google.com/file/d/1_z8GX2ir7NtXyYER-B4mSlXEB-sICF2u/view?usp=drive_link",
            "https://drive.google.com/file/d/1_z8GX2ir7NtXyYER-B4mSlXEB-sICF2u/view?usp=drive_link",
            "https://drive.google.com/file/d/1HozOp4SPZPfrJQsv2DzXz6FCxGKGfqs6/view?usp=drive_link",
            "https://drive.google.com/file/d/1HozOp4SPZPfrJQsv2DzXz6FCxGKGfqs6/view?usp=drive_link",
            "https://drive.google.com/file/d/1CWpyMZEtABGHzzLJb431Ip6Cz1amNDut/view?usp=drive_link",
            "https://drive.google.com/file/d/1CWpyMZEtABGHzzLJb431Ip6Cz1amNDut/view?usp=drive_link"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ag_bio);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
