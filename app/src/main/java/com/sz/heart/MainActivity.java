package com.sz.heart;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private int mThemeId = 0;

    private final String PREF_THEME = "theme";

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        mThemeId = sharedPreferences.getInt(PREF_THEME,0);
        if (mThemeId == 1) {
            this.setTheme(R.style.AppTheme_Dark);
            getWindow().getDecorView().setSystemUiVisibility(0);
        } else {
            this.setTheme(R.style.AppTheme_Light);
        }

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_dark) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            if (mThemeId == 1) {
                mThemeId = 0;
            } else {
                mThemeId = 1;
            }
            editor.putInt(PREF_THEME, mThemeId);
            editor.apply();
            this.recreate();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
