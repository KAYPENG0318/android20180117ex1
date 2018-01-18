package com.wanna.android20180117ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.wanna.android20180117ex1.data.Student;

public class EditActivity extends AppCompatActivity {
    Student s;
    TextView tv4;
    EditText ed4,ed5;
    int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        id = getIntent().getIntExtra("id",0);
        s = MainActivity.dao.getStudent(id);
        tv4=(TextView)findViewById(R.id.textView4);
        ed4=(EditText)findViewById(R.id.editText4);
        ed5=(EditText)findViewById(R.id.editText5);

        tv4.setText(String.valueOf(s.id));
        ed4.setText(s.name);
        ed5.setText(String.valueOf(s.score));

    }



    public void clickUpdata(View v)
    {
        Student s= new Student(id,ed4.getText().toString(),Integer.valueOf(ed5.getText().toString()));
        MainActivity.dao.updata(s);

        finish();
    }
    public void clickBack(View v)
    {
        finish();
    }
}
