package edu.tbui1trinity.gymschedule;

import android.text.util.Linkify;
import android.util.TypedValue;
import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import edu.tbui1trinity.gymschedule.*;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;


public class JavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SetEx shPr = new SetEx(3, 12);
        WhenToEx t = WhenToEx.LIFT;
        Exercise sample = new Exercise(t, "Shoulder Press", "Shoulder", "google.com", shPr);
        testTextBox(sample);

        LinearLayout llayout = findViewById(R.id.ExList);
        testAddExLayout(llayout);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    private void testTextBox(Exercise ex)
    {
        TextView name = findViewById(R.id.ExName);
        name.setText(ex.getName());

        TextView mus = findViewById(R.id.ExMuscle);
        mus.setText(ex.getMuscle());

        TextView set = findViewById(R.id.ExSets);
        set.setText("Sets : ");

        EditText setNum = findViewById(R.id.ExSetNum);
        setNum.setText(String.valueOf(ex.getSets()));
        setNum.setFocusable(false);

        TextView rep = findViewById(R.id.ExReps);
        rep.setText("Reps : ");

        EditText repNum = findViewById(R.id.ExRepNum);
        repNum.setText(String.valueOf(ex.getIntensity()));
        repNum.setFocusable(false);

        TextView dem = findViewById(R.id.ExDem);
        dem.setText(ex.getLink());
    }

    private void testAddExLayout(LinearLayout llayout)
    {
        LinearLayout LL = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, getDP(40));
        LL.setLayoutParams(params);

        //Name TextBox

        TextView ExNameT = new TextView(this);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        llp.setMargins(getDP(5),0,0,0);
        ExNameT.setLayoutParams(llp);
        ExNameT.setText("Shoulder Press");


        //Muscle TextBox
        TextView ExMusT = new TextView(this);
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        llp2.setMargins(0,0,getDP(10),0);
        ExMusT.setLayoutParams(llp2);
        ExMusT.setText("Shoulder");
        ExMusT.setGravity(Gravity.RIGHT);


        //Type of Exercise
        TextView ExSetT = new TextView(this);
        LinearLayout.LayoutParams llp3 = new LinearLayout.LayoutParams(getDP(35), LinearLayout.LayoutParams.WRAP_CONTENT);
        llp3.setMargins(getDP(50),0,getDP(10),0);
        ExSetT.setLayoutParams(llp3);
        ExSetT.setText("Sets : ");

        //Set Nums
        EditText ExSetNumT = new EditText(this);
        LinearLayout.LayoutParams llp4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ExSetNumT.setLayoutParams(llp4);
        ExSetNumT.setText("3");
        ExSetNumT.setHint("#");
        ExSetNumT.setFocusable(false);

        //Reps / duration
        TextView ExRepT = new TextView(this);
        ExRepT.setLayoutParams(llp3);
        ExRepT.setText("Reps : ");

        //Length
        EditText ExDurNumT = new EditText(this);
        ExDurNumT.setLayoutParams(llp4);
        ExDurNumT.setText("12");
        ExDurNumT.setHint("#");
        ExDurNumT.setFocusable(false);

        TextView ExLinkT = new TextView(this);
        llp2.setMargins(0,0,getDP(10),0);
        ExLinkT.setLayoutParams(llp2);
        ExLinkT.setGravity(Gravity.RIGHT);
        ExLinkT.setClickable(true);
        ExLinkT.setLinksClickable(true);
        ExLinkT.setAutoLinkMask(Linkify.WEB_URLS);
        ExLinkT.setText("google.com");

        //2nd layout
        LinearLayout LL2 = new LinearLayout(this);
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, getDP(45));
        LL.setLayoutParams(params2);

        LL.addView(ExNameT);
        LL.addView(ExMusT);
        LL.setBackgroundColor(Color.parseColor("#ff33b5e5"));

        LL2.addView(ExSetT);
        LL2.addView(ExSetNumT);
        LL2.addView(ExRepT);
        LL2.addView(ExDurNumT);
        LL2.addView(ExLinkT);
        LL2.setBackgroundColor(Color.parseColor("#ff33b5e5"));

        llayout.addView(LL);
        llayout.addView(LL2);
        //todo
    }

    private int getDP(int size)
    {
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, size, getResources().getDisplayMetrics());
        return (int) pixels;
    }

}
