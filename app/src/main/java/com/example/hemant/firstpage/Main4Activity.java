package com.example.hemant.firstpage;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private static TextView tvr, tvq, tvt;
    private static Button b1, b2, btninsert, btnload;

    private TextView tvname;
    private TextView tvrate;
    private TextView tvqunatity;
    private TextView tvvalue;
    private TextView tvnam;
    private TextView tvrat;
    private TextView tvqunatit;
    private TextView tvvalu;
    private TextView tvt1;
    private TextView tvt2;
    private TextView tvt3;
    private TextView tvt4;



    Helper myhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        onClickButtonListener();
        Bundle mainData = getIntent().getExtras();
        if (mainData == null) {
            return;
        }
        String Message1 = mainData.getString("message1");
        String Message2 = mainData.getString("message2");
        final TextView tvname = (TextView) findViewById(R.id.tvn);
        assert tvname != null;
        tvname.setText(Message1);
        final TextView tvrate = (TextView) findViewById(R.id.tvr);
        assert tvrate != null;
        tvrate.setText(Message2);


        init();
        myhelper = new Helper(Main4Activity.this);
    }


    public void init() {
        tvnam = (TextView) findViewById(R.id.tvn);
        tvrat = (TextView) findViewById(R.id.tvr);


        tvqunatit = (TextView) findViewById(R.id.tvq);
        tvvalu = (TextView) findViewById(R.id.tvt);
        tvt1=(TextView)findViewById(R.id.textView12);
        tvt2=(TextView)findViewById(R.id.textView14);
        tvt3=(TextView)findViewById(R.id.textView16);
        tvt4=(TextView)findViewById(R.id.textView18);



        btninsert = (Button) findViewById(R.id.button2);
        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long result = myhelper.insert(getValue(tvnam), Integer.parseInt(getValue(tvrat)), Integer.parseInt(getValue(tvqunatit))
                        , Integer.parseInt(getValue(tvvalu)));
                if (result == -1) {
                    Toast.makeText(Main4Activity.this, "some Insertion error", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Main4Activity.this, "Dish has been inserted to cart", Toast.LENGTH_LONG).show();
                }
            }


        });
        btnload = (Button) findViewById(R.id.btnload);
        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvname = (TextView) findViewById(R.id.tv1);
                tvrate = (TextView) findViewById(R.id.tv2);
                tvqunatity = (TextView) findViewById(R.id.tv3);
                tvvalue = (TextView) findViewById(R.id.tv4);


                StringBuffer data = new StringBuffer();
                StringBuffer data1 = new StringBuffer();
                StringBuffer data2 = new StringBuffer();
                StringBuffer data3 = new StringBuffer();


                Cursor cursor = myhelper.getAllRecords();
                Cursor cursor1 = myhelper.getAllRecords();
                Cursor cursor2 = myhelper.getAllRecords();
                Cursor cursor3 = myhelper.getAllRecords();


                for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext())

                {
                    data.append(cursor.getString(cursor.getColumnIndex(myhelper.Dish)));


                    data.append("\n");
                }
                tvt1.setText(data);

                for (cursor1.moveToFirst(); !cursor1.isAfterLast(); cursor1.moveToNext())

                {
                    data1.append(cursor1.getString(cursor1.getColumnIndex(myhelper.Rate)));
                    data1.append("\n");
                }
                tvt2.setText(data1);

                for (cursor2.moveToFirst(); !cursor2.isAfterLast(); cursor2.moveToNext())

                {
                    data2.append(cursor2.getString(cursor2.getColumnIndex(myhelper.Quantity)));
                    data2.append("\n");
                }
                tvt3.setText(data2);


                for (cursor3.moveToFirst(); !cursor3.isAfterLast(); cursor3.moveToNext()) {
                    data3.append(cursor3.getString(cursor3.getColumnIndex(myhelper.Value)));
                    data3.append("\n");
                }

                tvt4.setText(data3);


            }
        });


        Button btd=(Button)findViewById(R.id.button4);

        btd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long result1=myhelper.delete(getValue(tvname));
                if(result1==-1)
                {
                    Toast.makeText(Main4Activity.this,"some Deletion error",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(Main4Activity.this, "Row has been Deleted at ID:" + result1, Toast.LENGTH_LONG).show();

                }}
        });

        }

    public void onClickButtonListener() {
        tvr = (TextView) findViewById(R.id.tvr);
        tvq = (TextView) findViewById(R.id.tvq);
        tvt = (TextView) findViewById(R.id.tvt);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);


        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      int nr = Integer.parseInt(tvr.getText().toString());
                                      int nq = Integer.parseInt(tvq.getText().toString());

                                      if (nq > 0) {
                                          int nq2 = nq - 1;
                                          int nt = nr * nq2;


                                          tvq.setText(Integer.toString(nq2));
                                          tvt.setText(Integer.toString(nt));
                                      }
                                  }


                              }
        );

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nr = Integer.parseInt(tvr.getText().toString());
                int nq = Integer.parseInt(tvq.getText().toString());

                int nq2 = nq + 1;
                int nt = nr * nq2;


                tvq.setText(Integer.toString(nq2));
                tvt.setText(Integer.toString(nt));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        myhelper.openDb();
    }
    @Override
    protected void onStop() {
        super.onStop();
        myhelper.closeDb();
    }


    private String getValue(TextView textView) {
        return textView.getText().toString().trim();
    }





}