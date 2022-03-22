package com.example.catalogfever;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class List_perform extends AppCompatActivity {

    private String number;
    private String product;
    private String ID_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_perform);

        Intent intent = getIntent();
        number = intent.getStringExtra("number");
        product = intent.getStringExtra("product");
        ID_number = intent.getStringExtra("Id_number");

        String inventory = number + product + ID_number;
        Log.d(this.getLocalClassName(), "These are the current stocks " + inventory);
        TextView inventoryObject = findViewById(R.id.tvInventory);
        inventoryObject.setText(inventory);

    }

    public void saveProduct(View view){
        SharedPreferences sharedPref = getSharedPreferences("Inventory.txt", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("number", number);
        editor.putString("product", product);
        editor.putString("Id_number", ID_number);
        editor.apply();

        Toast.makeText(this, "Product Saved", Toast.LENGTH_SHORT).show();
    }




}