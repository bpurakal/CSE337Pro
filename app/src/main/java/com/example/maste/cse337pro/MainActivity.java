package com.example.maste.cse337pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;




public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button button10 = (Button) findViewById(R.id.button10);
        //button10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id) {
            case R.id.button1:
                // buttonX clicked
                break;
            case R.id.button2:
                // buttonX clicked
                break;
            case R.id.button3:
                // buttonX clicked
                break;
            case R.id.button4:
                // buttonX clicked
                break;
            case R.id.button5:
                // buttonX clicked
                break;
            case R.id.button6:
                // buttonX clicked
                break;
            case R.id.button7:
                // buttonX clicked
                break;
            case R.id.button8:
                // buttonX clicked
                break;
            case R.id.button9:
                // buttonX clicked
                break;
            case R.id.button10:
                // buttonX clicked
                break;
        }
    }

}
