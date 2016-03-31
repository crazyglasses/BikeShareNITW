package com.crazyglaasses.anmolkulkarni.uberforcycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignInActivity extends Activity implements View.OnClickListener {
    Button Signin,Signup;
    EditText username,password;
    int authval = 0;
    String Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Signin = (Button) findViewById(R.id.button);
        Signup = (Button) findViewById(R.id.button2);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        this.Signin.setOnClickListener(this);
       this.Signup.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Username = username.getText().toString();
                Password = password.getText().toString();
                //Auth Process if true
                authval = 1;
                if (authval == 1) {

                    Context context = getApplicationContext();
                    CharSequence text = "Sign In Successful...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    startActivity(new Intent(SignInActivity.this, MainActivity.class));
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Sign In Unsuccessful...Try again";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                break;
            case R.id.button2:
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                break;
        }
    }
}
