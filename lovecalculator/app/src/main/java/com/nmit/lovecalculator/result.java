package com.nmit.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle b=getIntent().getExtras();
        String message =b.getString("info");
        TextView tv=(TextView)findViewById(R.id.result);

        tv.setText(message);
    }
}
