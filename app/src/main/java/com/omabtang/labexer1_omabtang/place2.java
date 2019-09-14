package com.omabtang.labexer1_omabtang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class place2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place2);
    }
    public void onClick(View V) {
        Intent intent1 = new Intent(this, place2.class);
        startActivity(intent1);

    }
}