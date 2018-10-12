package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.button1);
        btnTwo = (Button) findViewById(R.id.button2);
        t1 = (TextView)findViewById(R.id.textView3);
        t2 = (TextView)findViewById(R.id.editText);
        findViewById(R.id.button1).setOnClickListener(MainActivity.this);
        findViewById(R.id.button2).setOnClickListener(MainActivity.this);
    }
    @Override
    public void onClick(View v) {
        Log.i("Button", "abc"+v.getId());
        switch (v.getId())
        {
            case R.id.button1:
                //btnOne.setText("11");
                Log.i("Button",  t2.getText().toString());

                if(btnOne.getText().toString().equals("11")){
                    btnOne.setText("111");
                }else{
                    btnOne.setText("11");
                }
                break;
            case R.id.button2:
                Log.i("Button", "22");
                if(btnTwo.getText().toString().equals("22")){
                    btnTwo.setText("222");
                    t1.setText(t2.getText());
                }else{
                    btnTwo.setText("22");
                    t1.setText(t2.getText());
                }
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
