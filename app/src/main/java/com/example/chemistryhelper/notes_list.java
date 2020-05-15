package com.example.chemistryhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;
import java.util.List;

public class notes_list extends AppCompatActivity {
PDFView mind_map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
        mind_map=(PDFView)findViewById(R.id.mind_map_pdf);
        mind_map.fromAsset("ORGANIC_ CHEMISTRY_SCHEMES.pdf").load();


}

}
