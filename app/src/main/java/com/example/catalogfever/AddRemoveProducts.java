package com.example.catalogfever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class AddRemoveProducts extends AppCompatActivity {

    private EditText et_product, et_number;
    private RadioButton rb_add, rb_remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_products);

        et_product = (EditText) findViewById(R.id.et_item);
        et_number = (EditText) findViewById(R.id.et_number);
        rb_add = (RadioButton) findViewById(R.id.rb_add);
        rb_remove = (RadioButton) findViewById(R.id.rb_remove);
    }
    // This method would allows to get the data and put it in other layout, the trigger button.
    public void send(View view) {


        Intent s = new Intent(this, List_perform.class);
        s.putExtra("item", et_product.getText().toString());
        s.putExtra("number", et_number.getText().toString());

        startActivity(s);
    }
    //This suppose will star other activity
    public void sendToList (View view){
        Intent viewList = new Intent(this, List_perform.class);
        startActivity(viewList);

    }
}