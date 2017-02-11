package com.example.hemant.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
    }
    public void Qbtn69(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Mutton Biryani";
        String userMessage2="576";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn70(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Veg.Pulao";
        String userMessage2="456";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn71(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Zeera Rice";
        String userMessage2="356";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn72(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Steamed Rice";
        String userMessage2="406";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn73(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Biryani";
        String userMessage2="456";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }}