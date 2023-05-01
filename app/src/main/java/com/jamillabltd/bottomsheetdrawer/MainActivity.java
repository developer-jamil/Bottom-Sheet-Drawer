package com.jamillabltd.bottomsheetdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {
    BottomSheetDialog sheetDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button showBottomSheet = findViewById(R.id.show_bottom_sheet_button_Id);
        showBottomSheet.setOnClickListener(v -> {
            //show bottom sheet
            View sheetView = LayoutInflater.from(this).inflate(R.layout.bottom_sheet_drawer, findViewById(R.id.dialog_container));
            sheetDialog = new BottomSheetDialog(this, com.google.android.material.R.style.Theme_Design_BottomSheetDialog);
            sheetDialog.setContentView(sheetView);
            sheetDialog.show();

            //onclick to action item
            //home
            TextView home = sheetView.findViewById(R.id.home);
            home.setOnClickListener(v1 -> {
                String msg = "Home";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            });
            //about
            TextView about = sheetView.findViewById(R.id.about);
            about.setOnClickListener(v1 -> {
                String msg = "About";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            });
            //gallery
            TextView gallery = sheetView.findViewById(R.id.gallery);
            gallery.setOnClickListener(v1 -> {
                String msg = "Gallery";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            });
            //projects
            TextView projects = sheetView.findViewById(R.id.projects);
            projects.setOnClickListener(v1 -> {
                String msg = "Projects";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            });
            //Contact
            TextView Contact = sheetView.findViewById(R.id.contact);
            Contact.setOnClickListener(v1 -> {
                String msg = "Contact";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            });



        });


    }


}