package com.chaithanya.boot_it_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



import static com.chaithanya.boot_it_up.R.layout.activity_main2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void login(View view){

        EditText username =(EditText)findViewById(R.id.user);
        EditText password =(EditText)findViewById(R.id.key);




        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }



}

