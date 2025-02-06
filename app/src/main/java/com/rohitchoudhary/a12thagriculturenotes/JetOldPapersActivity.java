package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetOldPapersActivity extends AppCompatActivity {

    String[] items = {
            "JET 2002 Paper",
            "JET 2003 Paper",
            "JET 2004 Paper",
            "JET 2005 Paper",
            "JET 2006 Paper",
            "JET 2007 Paper",
            "JET 2008 Paper",
            "JET 2009 Paper",
            "JET 2010 Paper",
            "JET 2011 Paper",
            "JET 2012 Paper",
            "JET 2013 Paper",
            "JET 2014 Paper",
            "JET 2015 Paper",
            "JET 2016 Paper",
            "JET 2019 Paper",
            "JET 2020 Paper",
            "JET 2021 Paper",
            "JET 2023 Paper",

    };
    String[] urls = {

            "https://drive.google.com/file/d/1sk69KEjMVFqjW4gWkGXMRSpfoM1Sq9r-/view?usp=sharing ",
            "https://drive.google.com/file/d/1T8VL8Ts46aXX6r1rXWDigKwDxA-JsdBn/view?usp=drive_link ",
            "https://drive.google.com/file/d/1RmYH4DmqTmVrFB6IiCZoi-fgv2LB_w58/view?usp=drive_link ",
            "https://drive.google.com/file/d/195qxNTIA7f9nahaviyM4yD_5t3mohLA_/view?usp=drive_link ",
            "https://drive.google.com/file/d/1k-I9LSzZrbBiOSUKLagfLL3cLVBfN1-r/view?usp=drive_link ",
            "https://drive.google.com/file/d/1Is_sJexSYcXJSo3TD6_98KvDU45IX1Op/view?usp=drive_link ",
            "https://drive.google.com/file/d/1aFkxM_s3NmBEdWRzRP99JvVakzd1iq6L/view?usp=drive_link ",
            "https://drive.google.com/file/d/1j2Y0mOSt75rM3ndjoYaHrKA-cdJfPq1O/view?usp=drive_link ",
            "https://drive.google.com/file/d/12kpJ1Gzr3d4Nevivnr2Gpj1yComYNXlf/view?usp=drive_link ",
            "https://drive.google.com/file/d/1Iw_oGiBw7nw6Sr5lobzFG2PCH1oV0dAM/view?usp=drive_link ",
            "https://drive.google.com/file/d/1OuumktL0ThIZB0p1OfXqve_qmTbnXeo-/view?usp=drive_link ",
            "https://drive.google.com/file/d/13plnZnpsXQeObML91kJ17EKXkmMoKUBX/view?usp=drive_link ",
            "https://drive.google.com/file/d/13p9M4bK0PmQbgSA26elrFlMjWuQE2h1c/view?usp=drive_link ",
            "https://drive.google.com/file/d/1ZIgPLig1Gqt09scQ3nJ2M5q08fjh6Y5H/view?usp=drive_link ",
            "https://drive.google.com/file/d/1cDH88zpsgbRv07Rody1kj6A9psdaccex/view?usp=drive_link ",
            "https://drive.google.com/file/d/1JWxqtqs-M-U3uxuGgLu6VlTw4qaF3K5C/view?usp=sharing ",
            "https://drive.google.com/file/d/16hRm9-7tiQ_iZiEtt28rtV32lZEmWjhD/view?usp=sharing ",
            "https://drive.google.com/file/d/1tdKlah7LuhiyBsuXSNKRmonxThQPwTZc/view?usp=sharing",
            "https://drive.google.com/file/d/179FfMdaXMFnb931GBvOduoVgDcYPNUdM/view?usp=sharing "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet_old_papers);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
