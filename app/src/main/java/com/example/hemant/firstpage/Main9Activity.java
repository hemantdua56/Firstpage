package com.example.hemant.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void Qbtn36(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Mutton Seekh Kabab";
        String userMessage2="506";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn37(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Seekh Kabab";
        String userMessage2="556";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn38(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Kalmi Kabab";
        String userMessage2="606";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn39(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Reshmi Kabab";
        String userMessage2="606";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
}
