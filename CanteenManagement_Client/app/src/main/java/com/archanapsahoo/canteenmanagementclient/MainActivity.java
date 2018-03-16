package com.archanapsahoo.canteenmanagementclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onButtonClick(View view) {



        if(view.getId() == R.id.button2) {
            EditText a = (EditText)findViewById(R.id.editText);
            String str = a.getText().toString();

            EditText b = (EditText)findViewById(R.id.editText2);
            String pass = b.getText().toString();

            String Password = helper.searchPass(str);

            if(pass.equals(Password))
            {

                Intent i = new Intent(MainActivity.this, Display.class);
                i.putExtra("Username",str);
                startActivity(i);
            }
            else
            {
                Toast pass1 = Toast.makeText(MainActivity.this, "username and passwords don't match",Toast.LENGTH_SHORT);
                pass1.show();
            }


        }
        if(view.getId() == R.id.button3) {
            Intent i = new Intent(MainActivity.this, Signup.class);

            startActivity(i);
        }


    }
}
