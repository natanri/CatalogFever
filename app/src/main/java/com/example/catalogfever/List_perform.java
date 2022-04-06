package com.example.catalogfever;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class List_perform extends AppCompatActivity {

    private TextView tv_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_perform);


        tv_list = findViewById(R.id.tv_list);

        String item = getIntent().getStringExtra("item");
        String num = getIntent().getStringExtra("number");
        tv_list.setText("There are " + num + " " + item + " products listed");

        //SharedPreferences inventory = getSharedPreferences("Product", Context.MODE_PRIVATE);
        //tv_list.setText(inventory.getString("item", ""));

    }

    //method to save data
    public void save(View view){
        SharedPreferences Stock = getSharedPreferences("Product", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_edit = Stock.edit();
        Obj_edit.putString("item", tv_list.getText().toString());
        Obj_edit.commit();
        finish();
    }

    //This method going to return to the home page
    public void homePage(View view){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
}




