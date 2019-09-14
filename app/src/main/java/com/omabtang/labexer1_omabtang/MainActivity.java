package com.omabtang.labexer1_omabtang;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itB","onCreate success");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itB","onStart success");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itB","onResume success");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itB","onPause success");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itB","onStop success");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itB","onDestroy success");
    }
    public void  display(View v){
        Toast.makeText(this, "this is toast", Toast.LENGTH_LONG).show();
    }


    public void onClick(View V) {

        switch (V.getId()) {
            case R.id.button:
                Intent intent1 = new Intent(this, SecondActivity.class);
                startActivity(intent1);
                Log.d("4itB","screen 2 success");
                break;
            case R.id.button2:
                Toast.makeText(this, "service started", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, place2.class);
                startActivity(intent2);
                Log.d("4itB","place 2 success");
                break;
            case R.id.button4:
                Intent intent3 = new Intent(this, place1.class);
                startActivity(intent3);
                Log.d("4itB","place 1 success");
                break;
            case R.id.button5:
                Intent intent4 = new Intent(this, place3.class);
                startActivity(intent4);
                Log.d("4itB","place 3 success");
                break;
            case R.id.button6:
                Intent intent5 = new Intent(this, SecondActivity.class);
                startActivity(intent5);
                Log.d("4itB","back success");
                break;
            case R.id.button7:
                Intent intent6 = new Intent(this, SecondActivity.class);
                startActivity(intent6);
                Log.d("4itB","back success");
                break;
            case R.id.button8:
                Intent intent7 = new Intent(this, SecondActivity.class);
                startActivity(intent7);
                Log.d("4itB","back success");
                break;
            case R.id.button9:
                Intent intent8 = new Intent(this, SecondActivity.class);
                startActivity(intent8);
                Log.d("4itB","back success");
                break;

            default:
                break;
        }
    }//end on click


}

