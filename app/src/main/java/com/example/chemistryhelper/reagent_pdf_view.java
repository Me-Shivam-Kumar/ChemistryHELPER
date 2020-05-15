package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class reagent_pdf_view extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reagent_pdf_view);
     pdfView=(PDFView)findViewById(R.id.reagent_pdf);
     String type =getIntent().getStringExtra("reagent_type");
        if(type.equals("reducing")){
            pdfView.fromAsset("reduction_iitb_original.pdf").load();
        }
        if (type.equals("oxidising")){
            pdfView.fromAsset("oxidation_iitb_origin.pdf").load();
        }
    }
}
