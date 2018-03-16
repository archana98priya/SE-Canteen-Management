package com.archanapsahoo.canteenmanagementclient;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Archana P Sahoo on 11-03-2018.
 */


public class Signup extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


    }

    public void onSignupClick(View view)
    {
        if(view.getId()== R.id.button)
        {
            EditText name = (EditText)findViewById(R.id.editText5);
            EditText email = (EditText)findViewById(R.id.editText8);
            EditText phone= (EditText)findViewById(R.id.editText9);
            EditText uname= (EditText)findViewById(R.id.editText11);
            EditText pass = (EditText)findViewById(R.id.editText13);
            EditText cpass = (EditText)findViewById(R.id.editText15);


            String namestr= name.getText().toString();
            String emailstr= email.getText().toString();
            String phonestr= phone.getText().toString();
            String unamestr= uname.getText().toString();
            String passstr = pass.getText().toString();
            String cpassstr = cpass.getText().toString();

            if(!passstr.equals(cpassstr))
            {
                //pop up message

                Toast pass1 = Toast.makeText(Signup.this, "passwords don't match",Toast.LENGTH_SHORT);
                pass1.show();

            }
            else
            {
                Contact c =new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setPhone(phonestr);
                c.setUname(unamestr);
                c.setPass(passstr);

                helper.insertContact(c);
            }



        }


    }

}
