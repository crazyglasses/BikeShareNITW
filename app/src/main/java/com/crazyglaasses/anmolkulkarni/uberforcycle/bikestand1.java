package com.crazyglaasses.anmolkulkarni.uberforcycle;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

/**
 * Created by Anmol Kulkarni on 23-08-2015.
 */
public class bikestand1 extends ActionBarActivity{
    String a,Sid;
    JSONObject jsonObj,p;
    JSONArray arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        TextView b = (TextView) findViewById(R.id.textView8);
        String x = null,y = null,z = null,w = null,q = null;
        try {
           a= new BikeStand().execute("http://192.168.43.77:3000/stations").get();

    } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }}

