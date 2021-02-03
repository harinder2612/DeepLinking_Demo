package com.harinder.a360_deeplinking_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = getIntent().getData();

        if(uri!= null)
        {
            List<String> par = uri.getPathSegments();
            String parValue = par.get(par.size()-1);
            Toast.makeText(this, "paramValue = "+parValue, Toast.LENGTH_LONG).show();
        }
    }
}
