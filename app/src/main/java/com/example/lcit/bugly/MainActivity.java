package com.example.lcit.bugly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclick(View view) {
//        int num = 1 / 0;
        Toast.makeText(this, "今天是四月二十二号，不过现在马上就要下班了", Toast.LENGTH_SHORT).show();
    }
}
