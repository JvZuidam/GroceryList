package com.example.jimva.grocery;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    GroceryDatabase Db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Goodnight World!");
        Db = new GroceryDatabase(this);
        Db.DbHandler();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        LinearLayout Layout = (LinearLayout) findViewById(R.id.Scroller);
        for (int i = 1; i<20; i++) {
            MainView newview = new MainView(this, i + "", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae");
            Layout.addView(newview);
        }
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
        switch(item.getItemId()) {
            case R.id.nieuw_artikel:
                Intent intent = new Intent(this, AddArticleActivity.class);
                this.startActivity(intent);
                break;
            case R.id.nieuw_recept:
                Intent intent1 = new Intent(this, AddRecipeActivity.class);
                this.startActivity(intent1);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }
}
