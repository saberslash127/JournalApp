package com.bustamante.journalapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class WritingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void backClick(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.mainView);

        switch (item.getItemId()) {
            case R.id.menu_red:
                if(item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                Intent i = new Intent (this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.menu_green:
                if(item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                main_view.setBackgroundColor(Color.GREEN);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
