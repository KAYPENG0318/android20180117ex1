package com.wanna.android20180117ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.wanna.android20180117ex1.data.Student;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void clickAdd(View v)
    {
        EditText ed1 =(EditText)findViewById(R.id.editText);
        EditText ed2 =(EditText)findViewById(R.id.editText2);
        EditText ed3 =(EditText)findViewById(R.id.editText3);
        int id = Integer.valueOf(ed1.getText().toString());
        String name =ed2.getText().toString();
        int score = Integer.valueOf(ed3.getText().toString());
        MainActivity.dao.add(new Student(id,name,score));
        finish();//
    }
}
