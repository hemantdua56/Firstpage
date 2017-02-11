package com.example.hemant.firstpage;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main17Activity extends AppCompatActivity {
    private TextView tvname;
    private TextView tvrate;
    private TextView tvqunatity;
    private TextView tvvalue;






    Helper myhelper;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);



            init();
            myhelper=new Helper(Main17Activity.this);
        }
    private void init() {
        tvname = (TextView)findViewById(R.id.tv1);
        tvrate = (TextView)findViewById(R.id.tv2);
        tvqunatity = (TextView)findViewById(R.id.tv3);
        tvvalue = (TextView)findViewById(R.id.tv4);



        StringBuffer data = new StringBuffer();

        StringBuffer data1 = new StringBuffer();
        StringBuffer data2 = new StringBuffer();
        StringBuffer data3 = new StringBuffer();

        Cursor cursor = myhelper.getAllRecords();
        Cursor cursor1 = myhelper.getAllRecords();
        Cursor cursor2 = myhelper.getAllRecords();
        Cursor cursor3 = myhelper.getAllRecords();


        for (cursor.moveToFirst();!cursor.isAfterLast();cursor.moveToNext())

        {
            data.append(cursor.getString(cursor.getColumnIndex(myhelper.Dish)));


            data.append("/n");
        }
        tvname.setText(data);

        for (cursor1.moveToFirst();!cursor1.isAfterLast(); cursor1.moveToNext())

        {
            data1.append(cursor1.getString(cursor1.getColumnIndex(myhelper.Rate)));
            data1.append("/n");
        } tvrate.setText(data1);

        for (cursor2.moveToFirst(); !cursor2.isAfterLast(); cursor2.moveToNext())

        {
            data2.append(cursor2.getString(cursor2.getColumnIndex(myhelper.Quantity)));
            data2.append("/n");
        }
        tvqunatity.setText(data2);


        for (cursor3.moveToFirst(); !cursor3.isAfterLast(); cursor3.moveToNext()) {
            data3.append(cursor3.getString(cursor3.getColumnIndex(myhelper.Value)));
            data3.append("/n");
        }

        tvvalue.setText(data3);


    }


    @Override
    protected void onStart(){
        super.onStart();
        myhelper.openDb();
    }
    @Override
    protected void onStop(){
        super.onStop();
        myhelper.closeDb();
    }




}




