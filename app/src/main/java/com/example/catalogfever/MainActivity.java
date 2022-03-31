package com.example.catalogfever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method to go Add and remove product page
    public void removeAdd(View view){
        Intent remove_add = new Intent(this, AddRemoveProducts.class);
        startActivity(remove_add);
    }

    //method to go to inventory page
    public void listPerform(View view){
        Intent listInventory = new Intent(this, List_perform.class);
        startActivity(listInventory);
    }

}
