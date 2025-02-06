package com.rohitchoudhary.a12thagriculturenotes;


import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class AgChemistryActivity extends AppCompatActivity {

    String[] items = {"मृदा, खनिज, चट्टानों का अपक्षय और मृदा निर्माण",
            "मृदा जीवांश पदार्थ",
            "मृदा कोलाइड्स",
            "आयन विनिमय",
            "मृदा अभिक्रिया",
            "अम्लीय एवं लवण प्रभावित मृदा",
            "पादपों में आवश्यक पोषक",
            "उर्वरकों की मृदा में अभिक्रिया एवं फसलों में प्रभाव",
            "कृषि रसायन एवं पर्यावरण प्रदूषण",
            "जैव रसायन",
            "जैविक खाद एवं जैव उर्वरक",
            "दुग्ध रसायन"
    };
    String[] urls = {
            "https://drive.google.com/file/d/1-rKtn9GcPV6i4vIIoPb09QtJa2ZXQtF6/view?usp=drive_link",
            "https://drive.google.com/file/d/1QaVWJE8wECZDqVikFpacDYsjKqmboa4B/view?usp=drive_link",
            "https://drive.google.com/file/d/1yboimbkPIb4pNktzh3txNlgMGMwn012K/view?usp=drive_link",
            "https://drive.google.com/file/d/1-2oNBqs5bqoXxE2iIIgu23GyvLkigv_y/view?usp=drive_link",
            "https://drive.google.com/file/d/1p8u07cFc-vKLVrHwR8Snb7sx-2w2II6i/view?usp=drive_link",
            "https://drive.google.com/file/d/1g3-kC3lkNqwdB1Za7J7XW0i9u9JOCsRH/view?usp=drive_link",
            "https://drive.google.com/file/d/1Jq0ApXxv1HxdiKeqkgCYfhPkj1d3XbP2/view?usp=drive_link",
            "https://drive.google.com/file/d/1CJp4fHKcw9Tcy4AVaJRN3n9k_u6gzERG/view?usp=drive_link",
            "https://drive.google.com/file/d/1W2M72zOGOZS6b1ui-H96L1qwnbqTaOwr/view?usp=drive_link",
            "https://drive.google.com/file/d/12KdYI9PGGwpa1P1DWfs0glBR21GrgJPq/view?usp=drive_link",
            "https://drive.google.com/file/d/1Nly2q0_q07gcUTheuSBD88_Qjm4-I8uy/view?usp=drive_link",
            "https://drive.google.com/file/d/1P6RlCNeg9xIABbhK693bz6mGSI7qXwmr/view?usp=drive_link"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ag_chemistry);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
