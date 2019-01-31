package com.nmit.lovecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendme(View view) {
        EditText myedit = (EditText) findViewById(R.id.editText);
        EditText myedit2 = (EditText) findViewById(R.id.editText2);
        String bf = myedit.getText().toString();
        String gf = myedit2.getText().toString();
        int k = ((bf.length() + gf.length())%10) * 100;


        Intent intent = new Intent(this, result.class);
        intent.putExtra("info", Integer.toString(k));
        startActivity(intent);
    }
}
