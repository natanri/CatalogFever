package com.example.catalogfever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class List_perform extends AppCompatActivity {

    /*private String number;
    private String item;
    //private String ID_number;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_perform);
        /*
        Intent intent = getIntent();
        number = intent.getStringExtra("Number");
        item = intent.getStringExtra("Item");
        //ID_number = intent.getStringExtra("Id_number");
        */

        /*
        String inventory = number + item;
        Log.d(this.getLocalClassName(), "These are the current stocks " + inventory);
        TextView inventoryObject = findViewById(R.id.tvInventory);
        inventoryObject.setText(inventory);
        */

    }

    /*
    public void saveProduct(View view){
        SharedPreferences sharedPref = getSharedPreferences("Inventory.txt", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("number", number);
        editor.putString("product", item);
        //editor.putString("Id_number", ID_number);
        editor.apply();

        Toast.makeText(this, "Product Saved", Toast.LENGTH_SHORT).show();

     */

    //method to return to main page
    public void mainPage(View view){
        Intent back_home = new Intent(this, MainActivity.class);
    }
    }




