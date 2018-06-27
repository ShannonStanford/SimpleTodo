package com.example.shannonyan.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.example.shannonyan.simpletodo.MainActivity.ITEM_POSITION;
import static com.example.shannonyan.simpletodo.MainActivity.ITEM_TEXT;

public class EditIteActivity extends AppCompatActivity {

    //track edit text
    EditText etItemText;
    //position of edited item in list
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ite);
        //relative edit text from layout
        etItemText = (EditText) findViewById(R.id.itItemText);
        //set edot text value from intent extra
        etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        getSupportActionBar().setTitle("Edit Item");

    }

    //header for save button
    public void onSaveItem(View v) {
        Intent i = new Intent();
        i.putExtra(ITEM_TEXT, etItemText.getText().toString());
        i.putExtra(ITEM_POSITION, position);
        setResult(RESULT_OK, i);
        finish();
    }
}
