package com.bin.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class create_account extends AppCompatActivity {
    RelativeLayout bgC;
    TextView email_sUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        bgC= (RelativeLayout) findViewById(R.id.bg_create);
        bgC.setBackgroundResource(R.drawable.ccc);

        email_sUp=(TextView) findViewById(R.id.EsUp);
        email_sUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sInLayout= new Intent(create_account.this,create_by_email.class);
                startActivity(sInLayout);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
