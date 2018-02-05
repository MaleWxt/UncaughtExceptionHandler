package com.palfund.uncaughtexceptionhandler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import static com.palfund.uncaughtexceptionhandler.App.regular;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MainActivity");
        setSupportActionBar(toolbar);
        Log.i("MainActivity", "---onCreate()--->" + regular);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "---onStart()--->" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "---onResume()--->" + "");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "---onPause()--->" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "---onStop()--->" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "---onDestroy()--->" + "");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, 1, "Second");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(new Intent(this, SecondActivity.class));
        return super.onOptionsItemSelected(item);
    }
}
