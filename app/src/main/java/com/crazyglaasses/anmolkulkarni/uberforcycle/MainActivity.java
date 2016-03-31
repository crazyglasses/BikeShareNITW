package com.crazyglaasses.anmolkulkarni.uberforcycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
 ImageButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(ImageButton) findViewById(R.id.imageButton2);
        b2=(ImageButton) findViewById(R.id.imageButton3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
          case R.id.imageButton2:
                                startActivity(new Intent(MainActivity.this,MapsActivity.class));
                                break;
            case R.id.imageButton3:
                startActivity(new Intent(MainActivity.this,ConnectActivity.class));
        }
    }
}
