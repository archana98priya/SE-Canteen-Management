package com.archanapsahoo.canteenmanagementclient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Archana P Sahoo on 11-03-2018.
 */

public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");
        TextView tv =(TextView)findViewById(R.id.editText);
        tv.setText(username);
    }
}
