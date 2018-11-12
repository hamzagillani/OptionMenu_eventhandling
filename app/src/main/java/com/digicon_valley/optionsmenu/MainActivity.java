package com.digicon_valley.optionsmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout relativeLayout;
        relativeLayout = findViewById(R.id.relative_layout);

        switch (item.getItemId()) {
            case R.id.red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));

            break;
            case R.id.blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));

            break;
            case R.id.purple_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));

            break;
            case R.id.green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));

            break;
        }
        return true;

    }
}
