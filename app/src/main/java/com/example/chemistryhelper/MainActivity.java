
package com.example.chemistryhelper;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.cardview.widget.CardView;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardreagent, cardreaction,cardformula,cardperiodic,cardnotes,cardchemical_formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardreagent=(CardView)findViewById(R.id.card_reagents);
        cardreaction=(CardView)findViewById(R.id.reaction);
        cardformula=(CardView)findViewById(R.id.formula) ;
        cardperiodic=(CardView) findViewById(R.id.periodic_table);
        cardnotes=(CardView) findViewById(R.id.notes);
        cardchemical_formula=(CardView) findViewById(R.id.compond_formula);
        //ADDING LISTNER
        cardreagent.setOnClickListener(this);
        cardreaction.setOnClickListener(this);
        cardformula.setOnClickListener(this);
        cardperiodic.setOnClickListener(this);
        cardnotes.setOnClickListener(this);
        cardchemical_formula.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()) {
            case R.id.card_reagents:i = new Intent(this,reagent_list.class);startActivity(i); break;
            case R.id.reaction:i=new Intent(this,reaction_list_activity.class);startActivity(i);break;
            case R.id.formula:i=new Intent(this,formula_sheet_view.class);startActivity(i);break;
            case R.id.periodic_table:i=new Intent(this,periodic_view.class);startActivity(i);break;
            case R.id.notes:i=new Intent(this,notes_list.class);startActivity(i);break;
            case R.id.compond_formula:i=new Intent(this,chemical_formula_view.class);startActivity(i);break;


            default:break;
        }
    }


}
