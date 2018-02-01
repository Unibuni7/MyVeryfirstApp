package com.example.slmns.myveryfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            int age = data.getIntExtra(SecondActivity.AGE,0);
            Log.d("MINE","age:" + age);
        }
    }

    public void buttonClicked(View view) {
        Log.d("MINE","Button clicked");
        TextView textView = findViewById(R.id.mainMessageTextView);
        counter++;
        EditText nameView = findViewById(R.id.mainNameEditText);
        String name = nameView.getText().toString();
        textView.setText("Hello " + name);
    }


    public void goButtonClicked(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(SecondActivity.PERSONNAME, "TizuHizu");
        startActivityForResult(intent,14468);
    }
}
