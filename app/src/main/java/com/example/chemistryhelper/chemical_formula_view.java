package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class chemical_formula_view extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemical_formula_view);
        pdfView=(PDFView)findViewById(R.id.chemical_formula_view);
        pdfView.fromAsset("Compound.pdf").load();
    }
}
