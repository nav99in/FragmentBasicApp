package com.example.fragmentbasicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button activitybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activitybutton=findViewById(R.id.activity_button);
        activitybutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Activity Button",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {

            case R.id.action_toggle:
                Intent intent1 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent1);
                Toast.makeText(MainActivity.this, "Toggle Button Clicked", Toast.LENGTH_SHORT).show();

                break;
            case R.id.action_logout:

                Toast.makeText(MainActivity.this, "Logout Clicked", Toast.LENGTH_SHORT).show();

                break;
            case R.id.action_newfragment:

                Toast.makeText(MainActivity.this, "New Fragment Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
