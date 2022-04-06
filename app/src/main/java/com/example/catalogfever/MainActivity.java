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
    public void catalog(View view){
        Intent listview= new Intent(this, List_perform.class);
        startActivity(listview);
    }

    //method to go to inventory page
    public void add_remove(View view){
        Intent add_rmv = new Intent(this, AddRemoveProducts.class);
        startActivity(add_rmv);
    }

}
