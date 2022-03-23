package com.example.catalogfever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddRemoveProducts extends AppCompatActivity {

    String Item;
    String Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_products);
    }

    public void addproduct(View view)
    {
        Intent tent = getIntent();
        EditText item  = (EditText) findViewById(R.id.item);
        EditText number = (EditText) findViewById(R.id.number);
        Item = item.getText().toString();
        Number = number.getText().toString();
        Intent intent = new Intent(this, List_perform.class);
        intent.putExtra("Item", Item);
        intent.putExtra("Number", Number);
        startActivity(intent);
    }

    public void removeproduct(View view)
    {

    }
}