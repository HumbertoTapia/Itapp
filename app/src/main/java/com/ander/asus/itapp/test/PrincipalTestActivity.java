package com.ander.asus.itapp.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ander.asus.itapp.R;
import com.ander.asus.itapp.test.fragments.TestUnoFragment;

public class PrincipalTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_test);


        Fragment fragment = TestUnoFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .add(R.id.fl_test, fragment)
                .commit();
    }
}