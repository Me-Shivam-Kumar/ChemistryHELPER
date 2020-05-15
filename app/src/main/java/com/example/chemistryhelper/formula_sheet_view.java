package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class formula_sheet_view extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_sheet_view);
        pdfView=(PDFView)findViewById(R.id.formulasheet);
        pdfView.fromAsset("chemistryFormulaBook.pdf").load();
    }
}
