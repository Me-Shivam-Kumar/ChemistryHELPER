package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class periodic_view extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_view);
        pdfView=(PDFView)findViewById(R.id.periodic_view);
        pdfView.fromAsset("periodic_table.pdf").load();
    }
}
