package com.example.catalogfever;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class List_perform extends AppCompatActivity {

    private String number;
    private String product;
    private String IDnumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_perform);

        Intent intent = getIntent();
        number = intent.getStringExtra("number");
        product = intent.getStringExtra("product");
        IDnumber = intent.getStringExtra("ID");

        String inventory = number + product + IDnumber;
        Log.d(this.getLocalClassName(), "These are the current stocks " + inventory);
        TextView inventoryObject = findViewById(R.id.tvInventory);
        inventoryObject.setText(inventory);

    }




}