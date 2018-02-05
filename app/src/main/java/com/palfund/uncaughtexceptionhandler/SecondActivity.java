package com.palfund.uncaughtexceptionhandler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import static com.palfund.uncaughtexceptionhandler.App.regular;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("SecondActivity");
        setSupportActionBar(toolbar);
        Log.i("SecondActivity", "---onCreate()--->" +regular);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, 1, "Third");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(new Intent(this, ThirdActivity.class));
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SecondActivity", "---onStart()--->" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecondActivity", "---onResume()--->" + "");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecondActivity", "---onPause()--->" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecondActivity", "---onStop()--->" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecondActivity", "---onDestroy()--->" + "");
    }
}
