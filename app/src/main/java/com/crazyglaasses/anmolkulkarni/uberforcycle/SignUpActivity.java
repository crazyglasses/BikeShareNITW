package com.crazyglaasses.anmolkulkarni.uberforcycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpActivity extends Activity implements View.OnClickListener{
    Button signup;
    EditText name,username,password,cpassword;
    String Name,Username,Password,Cpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = (Button)findViewById(R.id.signup2);
        name = (EditText) findViewById(R.id.name1);
        username = (EditText) findViewById(R.id.username2);
        password = (EditText) findViewById(R.id.password2);
        cpassword = (EditText) findViewById(R.id.cpass);
        signup.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.signup2:
                Name = name.getText().toString();
                Username = username.getText().toString();
                Password = password.getText().toString();
                Cpassword = cpassword.getText().toString();
                if(Password.equals(Cpassword))
                {
                    // send data to cloud and Register the user
                    startActivity(new Intent(SignUpActivity.this,MainActivity.class));
                    Context context = getApplicationContext();
                    CharSequence text = "Sign Up Successful...";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Passwords do not match.Try again";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
        }

    }
}
