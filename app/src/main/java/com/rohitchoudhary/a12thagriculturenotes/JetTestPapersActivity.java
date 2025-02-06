package com.rohitchoudhary.a12thagriculturenotes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JetTestPapersActivity extends AppCompatActivity {
    String[] items = {
            "Mock Test 1 (With Answer Key)",
            "Mock Test 2 (With Answer Key)",
            "Mock Test 3 (With Answer Key)",
            "Mock Test 4 (With Answer Key)",
            "Mock Test 5 (With Answer Key)",
            "Mock Test 6 (With Answer Key)",
            "Mock Test 7 (With Answer Key)",
            "Mock Test 8 (With Answer Key)",
            "Mock Test 9 (With Answer Key)",
            "Mock Test 11 (With Answer Key)",
            "Mock Test 12 (With Answer Key)",
            "Mock Test 13 (With Answer Key)"
    };
    String[] urls = {

            "https://drive.google.com/file/d/1-FMb5HpvkEjw5bE7xRdAlWignk27TQOv/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-tpCciK2SP2mv44r7kk7dWXmBHnxWnKd/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-cuaFUWpxc-5dYfDAv-fLnuQSFYCBhvM/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-P96FoGLvu06a0y4_c0OucmHUkyNll4e/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-i4_Nq0ld9XxyGi69wZctFMlctbjclFk/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-C4ed1bVKgaA3pAg9zWmqnTjOXdyvsOV/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-xnNOTFW-ViD3hm5KQR59nk2EO2birOF/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-DxlFVHojHlkG_z6xo7t1dxu0VHcCkkH/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-zVc1nlH_1xYAkFp_U3rEqcJLvTZTMwg/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-lv15q0s1VqCQgc8TQBW_jWW1SemaCKa/view?usp=drive_link ",
            "https://drive.google.com/file/d/1-wNA9M_Y-dx3F4k6wMbifFZemdCg4ucr/view?usp=drive_link ",
            "https://drive.google.com/file/d/10-FtyWcqRE8zhVb2sJTPXs-tY1tjsgkb/view?usp=drive_link "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jet_test_papers);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, items, urls);
        listView.setAdapter(adapter);
    }
}
