package com.example.fragmentbasicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main5Activity extends AppCompatActivity {
    ToggleButton mode,choice;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
   initiate();

    }

    private void initiate() {
    mode=findViewById(R.id.togglebtn1);
    choice=findViewById(R.id.togglebtn2);
    submit=findViewById(R.id.btn1);
    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String status="";
            status="Mood"+mode.getText();
            Toast.makeText(Main5Activity.this, ""+status, Toast.LENGTH_SHORT).show();
        }
    });
    }


}
