package com.rohitchoudhary.a12thagriculturenotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BooksActivity extends AppCompatActivity {

    CardView agBook, agBioBook, agChemitryBook, hindiBook, englishBook;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        agBook = findViewById(R.id.agBook);
        agBioBook = findViewById(R.id.agBioBook);
        agChemitryBook = findViewById(R.id.agChemistryBook);
        hindiBook = findViewById(R.id.hindiBook);
        englishBook = findViewById(R.id.engBook);

        agBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1IMhQDBW2ICPFXD0yZNHPBSf2NwbefAAD/view?usp=drive_link");

            }
        });

        agBioBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1AK34fCEZUc87pMPUn-KFOF1wfnCjK8tJ/view?usp=drive_link");
            }
        });

        agChemitryBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1l8HCvVdU6984dDZaX-alKFsoXFlyyUWl/view?usp=drive_link");
            }
        });

        hindiBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1ureKNmDnK4dj7NMpqGYXfIYDdIEJsAyo?usp=drive_link");
            }
        });

        englishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1pkwmFBcBrlT3od8CzMnONEfz2vkkqv-p?usp=sharing");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}