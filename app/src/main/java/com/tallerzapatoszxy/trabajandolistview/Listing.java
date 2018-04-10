package com.tallerzapatoszxy.trabajandolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listing extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        table = findViewById(R.id.table);
        people = Data.getPeople();

        for (int i = 0; i < people.size(); i++) {
            TableRow row = new TableRow(this);

            TextView personID = new TextView(this);
            TextView DNI = new TextView(this);
            TextView firstName = new TextView(this);
            TextView lastName = new TextView(this);

            personID.setText(""+(i + 1));
            DNI.setText(people.get(i).getDNI());
            firstName.setText(people.get(i).getFirstName());
            lastName.setText(people.get(i).getLastName());

            row.addView(personID);
            row.addView(DNI);
            row.addView(firstName);
            row.addView(lastName);

            table.addView(row);
        }
    }
}
