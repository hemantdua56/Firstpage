package com.example.hemant.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }
    public void Qbtn86(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Kheer";
        String userMessage2="256";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn87(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Phirni";
        String userMessage2="256";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
}
