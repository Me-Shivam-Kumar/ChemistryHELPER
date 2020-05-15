package com.example.chemistryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class reactionviwer extends AppCompatActivity {
     PDFView book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactionviwer);
        String name= getIntent().getStringExtra("pdfname");
        book=(PDFView)findViewById(R.id.pdfviwer);
        if(name.equals("aldol")){
            book.fromAsset("AldolCondensation.pdf").load();
        }
        if (name.equals("balz")){
            book.fromAsset("BalzSchiemann.pdf").load();
        }  if (name.equals("benzoin")){
            book.fromAsset("BenzoinCondensation.pdf").load();
        }  if (name.equals("cannizzaro")){
            book.fromAsset("CannizzaroReaction.pdf").load();
        }  if (name.equals("carbylamine")){
            book.fromAsset("CarbylamineReaction.pdf").load();
        }  if (name.equals("claisen")){
            book.fromAsset("ClaisenCondensation.pdf").load();
        }  if (name.equals("clemmensen")){
            book.fromAsset("ClemmensenReduction.pdf").load();
        }  if (name.equals("coupling")){
            book.fromAsset("CouplingReaction.pdf").load();
        }  if (name.equals("decarboxylation")){
            book.fromAsset("Decarboxylation.pdf").load();
        }  if (name.equals("diazotization")){
            book.fromAsset("Diazotization.pdf").load();
        }  if (name.equals("etard")){
            book.fromAsset("EtardReaction .pdf").load();
        }  if (name.equals("finklestein")){
            book.fromAsset("Finkelstein.pdf").load();
        }  if (name.equals("fischer")){
            book.fromAsset("FischerEsterification.pdf").load();
        }  if (name.equals("friedel")){
            book.fromAsset("friedelcrafts.pdf").load();
        }  if (name.equals("gabriel")){
            book.fromAsset("GabrielPhthalimide.pdf").load();
        }  if (name.equals("gattermann")){
            book.fromAsset("Gattermann.pdf").load();
        }  if (name.equals("haloform")){
            book.fromAsset("HaloformReaction.pdf").load();
        }  if (name.equals("hell")){
            book.fromAsset("HellVolhardZelinsky.pdf").load();
        }  if (name.equals("hofmannbromo")){
            book.fromAsset("HoffmannBromamide .pdf").load();
        }  if (name.equals("hofmannelimina")){
            book.fromAsset("Hofmann Elimination.pdf").load();
        }  if (name.equals("hunsd")){
            book.fromAsset("Hunsdiecker.pdf").load();
        }  if (name.equals("hydroboration")){
            book.fromAsset("HydroborationOxidation.pdf").load();
        }  if (name.equals("kolbe")){
            book.fromAsset("KolbeReaction.pdf").load();
        }  if (name.equals("perkin")){
            book.fromAsset("PerkinReaction .pdf").load();
        }  if (name.equals("reimer")){
            book.fromAsset("ReimerTiemannReaction .pdf").load();
        }  if (name.equals("rose")){
            book.fromAsset("RosenmundReduction .pdf").load();
        }  if (name.equals("sandmeyer")){
            book.fromAsset("SandmeyerReaction.pdf").load();
        }  if (name.equals("schmidth")){
            book.fromAsset("Schmidt.pdf").load();
        }  if (name.equals("stephen")){
            book.fromAsset("StephenReduction.pdf").load();
        }  if (name.equals("swarts")){
            book.fromAsset("Swarts.pdf").load();
        }  if (name.equals("willamson")){
            book.fromAsset("WilliamsonEther .pdf").load();
        }  if (name.equals("wolff")){
            book.fromAsset("WolffKishnerReduction.pdf").load();
        }  if (name.equals("wurtz")){
            book.fromAsset("Wurtz .pdf").load();
        }




    }
}
