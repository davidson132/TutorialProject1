package com.example.tutorialproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //This button has an onClick attribute in the xml, no need to call the method in the onCreate method.
    public void btnRegister(View v){
        EditText firstName = findViewById(R.id.edttxtFirstName);
        EditText lastName = findViewById(R.id.edttxtLastName);
        EditText email = findViewById(R.id.edttxtEmail);

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        if(firstName.getText().toString().isEmpty() && lastName.getText().toString().isEmpty() && email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your credentials before registering", Toast.LENGTH_SHORT).show();
        }else if(firstName.getText().toString().isEmpty() && lastName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your first and last name before registering", Toast.LENGTH_SHORT).show();
        }else if(firstName.getText().toString().isEmpty() && email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your first name and email before registering", Toast.LENGTH_SHORT).show();
        }else if(lastName.getText().toString().isEmpty() && email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your last name and email before registering", Toast.LENGTH_SHORT).show();
        }else if(email.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your email before registering", Toast.LENGTH_SHORT).show();
        }else if(lastName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your last name before registering", Toast.LENGTH_SHORT).show();
        }else if(firstName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter in your first name before registering", Toast.LENGTH_SHORT).show();
        }else {
            txtFirstName.setText("First Name: " + firstName.getText().toString());
            txtLastName.setText("Last Name: " + lastName.getText().toString());
            txtEmail.setText("Email: " + email.getText().toString());
        }
    }
}