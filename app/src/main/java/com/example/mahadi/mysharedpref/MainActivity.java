package com.example.mahadi.mysharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText uname, password;
    private Button sava, load;
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


        sava.setOnClickListener(this);
        load.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.save) {

            String username = uname.getText().toString();
            String Upass = password.getText().toString();


            if (username.equals("") && Upass.equals("")) {

                Toast.makeText(this, "Please Input Username and Password", Toast.LENGTH_LONG).show();
            } else {
                SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("UsernameKey", username);
                editor.putString("PasswordKey", Upass);
                editor.commit();
                Toast.makeText(this, "Data Stored successfully", Toast.LENGTH_LONG).show();

            }

        } else if (view.getId() == R.id.load) {
            SharedPreferences sharedPreferences = getSharedPreferences("userDetails", Context.MODE_PRIVATE);

            if (sharedPreferences.contains("UsernameKey") && sharedPreferences.contains("UsernameKey")) {

                String username = sharedPreferences.getString("UsernameKey", "Username Not found!!");
                String Upass = sharedPreferences.getString("PasswordKey", "Password Not found!!");
                result.setText(username + "\n" + Upass);

            }

        } else {

        }
    }
}
