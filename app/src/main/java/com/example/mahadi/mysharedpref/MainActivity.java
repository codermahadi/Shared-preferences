package com.example.mahadi.mysharedpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText uname,password;
    private Button sava,load;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname = (EditText) findViewById(R.id.uname);
        password = (EditText) findViewById(R.id.password);
        sava = (Button) findViewById(R.id.save);
        load = (Button) findViewById(R.id.load);
        result = (TextView) findViewById(R.id.result);


    }
}
