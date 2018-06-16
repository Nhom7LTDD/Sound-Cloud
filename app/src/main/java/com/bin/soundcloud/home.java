package com.bin.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class home extends AppCompatActivity {

    RelativeLayout mainBg;
    TextView signIn, create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainBg= (RelativeLayout) findViewById(R.id.main_background);
        mainBg.setBackgroundResource(R.drawable.aaa);

        signIn= (TextView) findViewById(R.id.bSignIn);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sInLayout= new Intent(home.this,signIn.class);
                startActivity(sInLayout);
            }
        });

        create=(TextView) findViewById(R.id.bCreate);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createL= new Intent(home.this,create_account.class);
                startActivity(createL);
            }
        });

    }
}
