package com.bin.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class signIn extends AppCompatActivity {
    DatabaseHelper helper= new DatabaseHelper(this);
    RelativeLayout bg;
    TextView backto, forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        bg= (RelativeLayout) findViewById(R.id.background2);
        bg.setBackgroundResource(R.drawable.ccc);

        forgot=(TextView) findViewById(R.id.textForgot);
        backto=(TextView) findViewById(R.id.back);
        backto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backTo= new Intent(signIn.this,home.class);
                startActivity(backTo);
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent swap= new Intent(signIn.this, forgot_layout.class);
                startActivity(swap);
            }
        });
    }
    public void onSignInClick(View v){
        if(v.getId()== R.id.done){
            EditText a= (EditText) findViewById(R.id.emailSin);
            String astr= a.getText().toString();
            EditText b= (EditText) findViewById(R.id.passSin);
            String pass= b.getText().toString();

            String password = helper.searchPass(astr);
            if(pass.equals(password)){

                Intent i= new Intent(signIn.this, MainActivity.class);
                i.putExtra("Username",astr);
                startActivity(i);
            }
            else {
                Toast temp= Toast.makeText(signIn.this, "Email or Password don't match!", Toast.LENGTH_SHORT);
                temp.show();
            }

        }

    }
}
