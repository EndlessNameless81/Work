package com.example.w42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View view)
    {
    Fragment1 f1 = new Fragment1();
        androidx.fragment.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.conteiner,f1);
        ft.commit();
    }
    public void onClick2(View view)
    {
        Fragment2 f2 = new Fragment2();
        androidx.fragment.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.conteiner,f2);
        ft.commit();
    }
    public void onClick3(View view)
    {
        Fragment3 f3 = new Fragment3();
        androidx.fragment.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.conteiner,f3);
        ft.commit();
    }
}