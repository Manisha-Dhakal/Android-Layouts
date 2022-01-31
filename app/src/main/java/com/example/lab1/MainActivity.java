package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button1;
    EditText editTextPhoneno, editTextpsw;
    String phoneno, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Gallery Login");

        button1=findViewById(R.id.btn2sup);
        button=findViewById(R.id.btnlogin);

        editTextPhoneno=findViewById(R.id.text1);
        editTextpsw=findViewById(R.id.text2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent ( MainActivity.this, ActivityMain2.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // gettng value
                phoneno = editTextPhoneno.getText().toString();
                password = editTextpsw.getText().toString();

                if(phoneno.equals("12345") &&password.equals("admin")){
                    Intent intent =  new Intent ( MainActivity.this,LinearLayout.class);
                    //adding flags to intent
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    //key ra value ko base maa kaam garcha
                    intent.putExtra("phone",phoneno);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Error Login", Toast.LENGTH_SHORT).show();}
            }
        });

    }
}