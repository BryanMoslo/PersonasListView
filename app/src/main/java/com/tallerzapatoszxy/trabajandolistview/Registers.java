package com.tallerzapatoszxy.trabajandolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registers extends AppCompatActivity {
    private EditText DNI, firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registers);

        DNI = findViewById(R.id.DNI);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
    }

    public void savePerson(View v){
        String DNIValue, firstNameValue, lastNameValue;

        DNIValue = DNI.getText().toString();
        firstNameValue = firstName.getText().toString();
        lastNameValue = lastName.getText().toString();

        Person person = new Person(DNIValue, firstNameValue, lastNameValue);
        person.save();
        Toast.makeText(this, getResources().getString(R.string.person_saved), Toast.LENGTH_SHORT).show();

        delete();
    }

    public void delete(){
        DNI.setText("");
        firstName.setText("");
        lastName.setText("");
    }

    public void clear(View v){
        delete();
    }
}
