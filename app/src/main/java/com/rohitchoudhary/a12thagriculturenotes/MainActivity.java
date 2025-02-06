package com.rohitchoudhary.a12thagriculturenotes;


import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {



    GridLayout MainGridLayout;
    ImageView rateus;
    ImageView shareapp;

    TextView feedback;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // Other Code
        rateus = findViewById(R.id.rateus);
        shareapp = findViewById(R.id.shareapp);
        feedback = findViewById(R.id.feedback);

        shareapp.setOnClickListener(v -> shareAppLink());

        rateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://play.google.com/store/apps/details?id=com.rohitchoudhary.a12thagriculturenotes");

            }
        });

//        shareapp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent shareapp = new Intent(Intent.ACTION_SEND);
//                shareapp.setType("text/plain");
//                startActivity(Intent.createChooser(shareapp, "Share via"));
//                shareapp.putExtra(Intent.EXTRA_TEXT, "I really enjoyed Class 12th AG Notes app. Thank you. Download this Amazing App for 12th AG Notes, Notes, JET Papers and more important information. https://play.google.com/store/apps/details?id=com.rohitchoudhary.a12thagriculturenotes");
//            }
//        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://forms.gle/mncqk9hd8MfJ4Lrt8");

            }
        });



        MainGridLayout = (GridLayout) findViewById(R.id.MainGridLayout);
        setSingleEvent(MainGridLayout);

        TextView printout = findViewById(R.id.printout);

        printout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup();
            }
        });
    }

    private void setSingleEvent(GridLayout mainGridLayout) {

        for (int i = 0; i < MainGridLayout.getChildCount(); i++) {
            CardView cardView = (CardView) MainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {
                        Intent intent = new Intent(MainActivity.this, NotesActivity.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(MainActivity.this, BooksActivity.class);
                        startActivity(intent);
                    }

                    else if (finalI == 2) {
                        Intent intent = new Intent(MainActivity.this, JetTaiyariActivity.class);
                        startActivity(intent);
                    }

                    else if (finalI == 3) {
                        Intent intent = new Intent(MainActivity.this, JetInfoActivity.class);
                        startActivity(intent);
                    }

                    else if (finalI == 4) {
                        Intent intent = new Intent(MainActivity.this, LinksActivity.class);
                        startActivity(intent);
                    }



                }
            });

        }


    }

    private void showPopup() {
        // Inflate the custom layout
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_alert_dialog, null);

        // Create the AlertDialog
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .setCancelable(true)
                .create();

        // Find buttons in the custom layout
        Button waitingButton = dialogView.findViewById(R.id.waitingButton);
        Button whatsappButton = dialogView.findViewById(R.id.whatsappButton);

        // Set button actions
        waitingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://linktr.ee/rohitsinghjakhar"; // linktr URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        dialog.show();

        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://wa.me/919352968264?text=Hello, I want to recieve these notes, Please Help me.\n" +
                        "\n"+
                        "My Name is : " +
                        "\n"+
                        "Address :"; // WhatsApp URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        // Show the dialog
        dialog.show();



    }

    private void shareAppLink() {
        String appPackageName = getPackageName();
        String shareText = "12th Agriculture Notes app is Really Helpful for me. *Thank you- Rohit Bhaiya.* Download this Amazing App for 12th AG Notes, Notes, JET Papers and more important information.  https://play.google.com/store/apps/details?id=" + appPackageName;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My App");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

        // Show the share dialog
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }






    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }

}