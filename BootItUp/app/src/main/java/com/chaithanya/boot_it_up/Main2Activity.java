package com.chaithanya.boot_it_up;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    TextView a = (TextView) findViewById(R.id.l1status);
    TextView b = (TextView) findViewById(R.id.l2status);
    TextView c = (TextView) findViewById(R.id.l3status);
    TextView d = (TextView) findViewById(R.id.l4status);
    TextView e = (TextView) findViewById(R.id.l5status);
    TextView f = (TextView) findViewById(R.id.f1status);
    TextView g = (TextView) findViewById(R.id.f2status);
    TextView h = (TextView) findViewById(R.id.sstatus);


    public void light1(View view) {
        a.setText("On");
    }

    public Void light2(View view) {
        b.setText("On");
    }


    public Void light3(View view) {
        c.setText("On");
    }

    public Void light4(View view) {
        d.setText("On");
    }

    public Void light5(View view) {
        e.setText("On");
    }

    public Void fan1(View view) {
        f.setText("On");
    }

    public Void fan2(View view) {
        g.setText("On");
    }

    public Void socket(View view) {
        h.setText("On");
    }


}



