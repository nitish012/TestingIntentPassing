package com.test;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button addFragment;
FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment = findViewById(R.id.button_add);
        addFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckFragment checkFragment = new CheckFragment();
                Bundle bundle = new Bundle();
                bundle.putString("value","sunny");
                checkFragment.setArguments(bundle);

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.add(R.id.checkFragment,new CheckFragment()).commit();
            }
        });


    }
}
