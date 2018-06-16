package com.bin.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class after_create extends AppCompatActivity {
    RelativeLayout bg;
    TextView cancelB, contB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_create);
        bg= (RelativeLayout) findViewById(R.id.bg_aC);
        bg.setBackgroundResource(R.drawable.ccc);

        cancelB= (TextView) findViewById(R.id.cancel);
        contB= (TextView) findViewById(R.id.next);

        cancelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent swap= new Intent(after_create.this, home.class);
                startActivity(swap);
            }
        });
        contB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main= new Intent(after_create.this, signIn.class);
                startActivity(main);
            }
        });


    }
}
