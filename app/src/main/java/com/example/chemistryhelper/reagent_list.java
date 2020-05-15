package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class reagent_list extends AppCompatActivity implements View.OnClickListener {
    private CardView cardreducing, cardroxidising;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reagent_list);
        cardreducing = (CardView) findViewById(R.id.reducing);
        cardroxidising = (CardView) findViewById(R.id.oxidising);
        cardreducing.setOnClickListener(reagent_list.this);
        cardroxidising.setOnClickListener(reagent_list.this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.reducing:
                i = new Intent(reagent_list.this, reagent_pdf_view.class);
                i.putExtra("reagent_type","reducing");
                startActivity(i);
                break;
            case R.id.oxidising:
                i = new Intent(reagent_list.this, reagent_pdf_view.class);
                i.putExtra("reagent_type","oxidising");
                startActivity(i);
                break;
            default:
                break;

        }
    }
}