package com.example.signin;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class LogIn extends AppCompatActivity
{
    EditText username,password;
    Button signin;
    int attempts=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        username=findViewById(R.id.uid);
        password=findViewById(R.id.pwd);
        signin=findViewById(R.id.signin);
    }
    public void signin(View v)
    {
        Bundle b=getIntent().getExtras();
        String uname=b.getString("uid");
        String passwd=b.getString("password");
        if(username.getText().toString().equals(uname) &&
                password.getText().toString().equals(passwd)) {
            password.getText().toString().equals(passwd);
            {
                Toast.makeText(this, "SIGN IN SUCCESSFUL", Toast.LENGTH_LONG).show();
                attempts = 0;
                Intent i = new
                        Intent(this, Success.class);
                startActivity(i);
            }
        }
else
            {
                attempts++;
                Toast.makeText(this, "SIGN IN UNSUCCESSFUL. Number ofAttempts="+attempts, Toast.LENGTH_LONG).show();
                if(attempts==3)
                    signin.setEnabled(false);
            }
        }
    }
