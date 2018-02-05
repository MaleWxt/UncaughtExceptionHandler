package com.palfund.uncaughtexceptionhandler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import static com.palfund.uncaughtexceptionhandler.App.regular;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Third");
        setSupportActionBar(toolbar);
        Log.i("ThirdActivity", "---onCreate()--->" +regular);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, 1, "bug");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String[] arr = new String[0];
        Log.i("ThirdActivity", "---onOptionsItemSelected()--->" + arr[3]);
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ThirdActivity", "---onStart()--->" + "");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ThirdActivity", "---onResume()--->" + "");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ThirdActivity", "---onPause()--->" + "");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ThirdActivity", "---onStop()--->" + "");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ThirdActivity", "---onDestroy()--->" + "");
    }
}
