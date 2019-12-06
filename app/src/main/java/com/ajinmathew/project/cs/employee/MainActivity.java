package com.ajinmathew.project.cs.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etUsername,etPassword;
Button btnLogin,btnREgister;
String userName,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        etUsername=(EditText)findViewById( R.id.username );
        etPassword=(EditText)findViewById( R.id.password );
        btnLogin=(Button)findViewById( R.id.login );
        btnREgister=(Button)findViewById( R.id.register );
        btnREgister.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),RegisterActivity.class ) );
            }
        } );
        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName=etUsername.getText().toString();
                password=etPassword.getText().toString();
                if(userName.equals( "abcd" )&&password.equals( "123" )){
                    Toast.makeText( getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT ).show();
                    startActivity( new Intent( getApplicationContext(),HomeActivity.class ) );
                }else {
                    Toast.makeText( getApplicationContext(),"Login Error",Toast.LENGTH_LONG ).show();
                }
            }
        } );
    }
}
