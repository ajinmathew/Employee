package com.ajinmathew.project.cs.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText etEname,etEdesignation,etEsalary,etECname,etEphnno,etEUname,etEpass,etEcnfpass;
Button btnElogin,btnEReg;
String name,des,sal,c_name,phn,us_name,pass,cnf_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );
        etEname=(EditText)findViewById( R.id.empname );
        etEdesignation=(EditText)findViewById( R.id.empdesignation );
        etEsalary=(EditText)findViewById( R.id.empsalary );
        etECname=(EditText)findViewById( R.id.comapanyname );
        etEphnno=(EditText)findViewById( R.id.phoneno );
        etEUname=(EditText)findViewById( R.id.empusername );
        etEpass=(EditText)findViewById( R.id.emppassword );
        etEcnfpass=(EditText)findViewById( R.id.cnfpassword );
        btnElogin=(Button) findViewById( R.id.loginReg );
        btnEReg=(Button)findViewById( R.id.registerReg );
        btnEReg.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=etEname.getText().toString();
                des=etEdesignation.getText().toString();
                sal=etEsalary.getText().toString();
                c_name=etECname.getText().toString();
                phn=etEphnno.getText().toString();
                us_name=etEUname.getText().toString();
                pass=etEpass.getText().toString();
                cnf_pass=etEcnfpass.getText().toString();
                if(pass.equals( cnf_pass )){
                    Toast.makeText( getApplicationContext(),"Registeration Successful",Toast.LENGTH_LONG ).show();
                    startActivity( new Intent( getApplicationContext(),HomeActivity.class ) );
                }else {
                    Toast.makeText( getApplicationContext(),"Registeration Error",Toast.LENGTH_LONG ).show();

                }

            }
        } );
        btnElogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),MainActivity.class ) );
            }
        } );

    }
}
