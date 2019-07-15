package com.example.bmscanteen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);

        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
    }
    public void signUp(View view) {
        Intent i=new Intent(this,SignUpPage.class);
        startActivity(i);

    }
    public void Login(View view) {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
}
