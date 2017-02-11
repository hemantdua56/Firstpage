package com.example.hemant.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void Qbtn40(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Korma";
        String userMessage2="706";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn41(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Mutton Korma";
        String userMessage2="656";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
}
