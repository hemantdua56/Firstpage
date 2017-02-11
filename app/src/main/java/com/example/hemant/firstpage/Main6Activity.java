package com.example.hemant.firstpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }


    public void Qbtn12(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Tandoori Chicken";
        String userMessage2="372";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn13(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Afgani Chicken";
        String userMessage2="286";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn14(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Kalimirchi Tandoori Chicken ";
        String userMessage2="396";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn15(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Butter Tandoori Chicken";
        String userMessage2="372";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn16(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Barra";
        String userMessage2="409";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn17(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Tangri";
        String userMessage2="296";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn18(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Malai Tangri";
        String userMessage2="396";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn19(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Kalimirchi Tangri";
        String userMessage2="256";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn20(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Butter Chicken Tangri";
        String userMessage2="226";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn21(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Tikka";
        String userMessage2="396";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn22(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Malai Tikka ";
        String userMessage2="496";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn23(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Butter Chicken Tikka";
        String userMessage2="296";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn24(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Kalimirchi Chicken Tikka";
        String userMessage2="246";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn25(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Chicken Barra Tikka";
        String userMessage2="496";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn26(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Stuffed Chicken Tangri";
        String userMessage2="346";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }
    public void Qbtn27(View v){
        Intent i=new Intent(this,Main4Activity.class);
        final Button ed=(Button) findViewById(R.id.bt18);
        String userMessage1="Fish Tikka";
        String userMessage2="576";
        i.putExtra("message1",userMessage1);
        i.putExtra("message2",userMessage2);
        startActivity(i);
    }

}
