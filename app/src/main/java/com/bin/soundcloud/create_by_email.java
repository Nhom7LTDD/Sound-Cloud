package com.bin.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bin.soundcloud.Data.Contact;

import java.util.ArrayList;
import java.util.List;
public class create_by_email extends AppCompatActivity {
    Spinner gd;
    RelativeLayout bg_E;
    TextView b1, d1;
    DatabaseHelper helper= new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_by_email);
        bg_E =  findViewById(R.id.bg_cBEmail);
        bg_E.setBackgroundResource(R.drawable.ccc);


        gd =  findViewById(R.id.gender_sp);
        List<String> list = new ArrayList<>();
        list.add("Male");
        list.add("Female");
        list.add("Other");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        gd.setAdapter(adapter);

        b1 =  findViewById(R.id.back1);
       /* d1=(TextView) findViewById(R.id.done1);



        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next= new Intent(create_by_email.this, after_create.class);
                startActivity(next);
            }
        });*/




        b1.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        Intent back = new Intent(create_by_email.this, home.class);
        startActivity(back);
    }
    });

    }
    public void onDoneClick(View v){
        if(v.getId()==R.id.done1){
            EditText email=  findViewById(R.id.emailAddr);
            EditText pass= findViewById(R.id.passAddr);
            EditText confpass=  findViewById(R.id.confAddr);
            EditText age= findViewById(R.id.ageAddr);
            Spinner gender=  findViewById(R.id.gender_sp);

            String emailstr= email.getText().toString();
            String passstr= pass.getText().toString();
            String confpassstr= confpass.getText().toString();
            String ageint=(age.getText().toString());
            String genderstr= gender.getSelectedItem().toString();

            if(emailstr.equals("")|| passstr.equals("")|| confpassstr.equals("")|| ageint.equals(""))
                Toast.makeText(this,"Please complite the form",Toast.LENGTH_SHORT).show();
            else {
                if (!passstr.equals(confpassstr)) {
                    Toast popup = Toast.makeText(create_by_email.this, "Password don't match!", Toast.LENGTH_SHORT);
                    popup.show();
                } else {
                    int cvAge = Integer.parseInt(ageint.toString());
                    Contact c = new Contact();
                    c.setEmail(emailstr);
                    c.setPass(passstr);
                    c.setAge(cvAge);
                    c.setSex(genderstr);

                    helper.insertContact(c);

                    Intent next = new Intent(create_by_email.this, after_create.class);
                    startActivity(next);
                }
            }
            }

    }
}
