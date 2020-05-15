package com.example.chemistryhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;




public class reaction_list_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_list_activity);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> reaction_list, View view, int position, long id) {
                if(position==0)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","aldol");
                    startActivity(intent);}
                if(position==1)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","balz");
                    startActivity(intent);}
                if(position==2)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","benzoin");
                    startActivity(intent);}
                if(position==3)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","cannizzaro");
                    startActivity(intent);}
                if(position==4)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","carbylamine");
                    startActivity(intent);}
                if(position==5)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","claisen");
                    startActivity(intent);}
                if(position==6)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","clemmensen");
                    startActivity(intent);}
                if(position==7)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","coupling");
                    startActivity(intent);}
                if(position==8)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","decarboxylation");
                    startActivity(intent);}
                if(position==9)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","diazotization");
                    startActivity(intent);}
                if(position==10)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","etard");
                    startActivity(intent);}
                if(position==11)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","finklestein");
                    startActivity(intent);}
                if(position==12)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","fischer");
                    startActivity(intent);}
                if(position==13)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","friedel");
                    startActivity(intent);}
                if(position==14)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","gabriel");
                    startActivity(intent);}
                if(position==15)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","gattermann");
                    startActivity(intent);}
                if(position==16)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","haloform");
                    startActivity(intent);}
                if(position==17)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","hell");
                    startActivity(intent);}
                if(position==18)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","hofmannbromo");
                    startActivity(intent);}
                if(position==19)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","hofmannelimina");
                    startActivity(intent);}
                if(position==20)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","hunsd");
                    startActivity(intent);}
                if(position==21)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","hydroboration");
                    startActivity(intent);}
                if(position==22)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","kolbe");
                    startActivity(intent);}
                if(position==23)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","perkin");
                    startActivity(intent);}
                if(position==24)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","reimer");
                    startActivity(intent);}
                if(position==25)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","rose");
                    startActivity(intent);}
                if(position==26)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","sandmeyer");
                    startActivity(intent);}
                if(position==27)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","schmidth");
                    startActivity(intent);}
                if(position==28)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","stephen");
                    startActivity(intent);}
                if(position==29)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","swarts");
                    startActivity(intent);}
                if(position==30)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","willamson");
                    startActivity(intent);}
                if(position==31)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","wolff");
                    startActivity(intent);}
                if(position==32)
                {Intent intent = new Intent(reaction_list_activity.this,reactionviwer.class);
                    intent.putExtra("pdfname","wurtz");
                    startActivity(intent);}
            }
        };
        ListView listView=(ListView)findViewById(R.id.reacton_list);
        listView.setOnItemClickListener(itemClickListener);

}}










