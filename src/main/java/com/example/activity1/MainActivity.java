package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
    }

    public void myclick(View v)
    {
        tv.setText("Welcome");
        Toast.makeText(this,"welcome",Toast.LENGTH_LONG).show();
    }
}
