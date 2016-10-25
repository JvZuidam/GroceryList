package com.example.jimva.grocery;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jimva on 10/24/2016.
 */

public class AddArticleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);

        FloatingActionButton next = (FloatingActionButton) findViewById(R.id.BtnActAddItem);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AddArticleActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
