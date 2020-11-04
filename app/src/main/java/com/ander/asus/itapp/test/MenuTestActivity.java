package com.ander.asus.itapp.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ander.asus.itapp.R;

public class MenuTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_test);
    }

    public void ingresarPrincipal(View view) {
        Intent i = new Intent(this, PrincipalTestActivity.class );
        startActivity(i);
    }
}