package com.example.jimva.grocery;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by jimva on 10/24/2016.
 */

public class AddArticleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_article);

        FloatingActionButton showDialog = (FloatingActionButton) findViewById(R.id.showdialog);



        showDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                View view = (LayoutInflater.from(AddArticleActivity.this)).inflate(R.layout.user_input_article, null);

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(AddArticleActivity.this);
                alertBuilder.setView(view);
                final EditText userinputname = (EditText) view.findViewById(R.id.UserInputName);
                final EditText userinputamount = (EditText) view.findViewById(R.id.UserInputAmount);

                alertBuilder.setCancelable(true)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (userinputname.getText().toString().trim().length() > 0) {
                                    LinearLayout Layout = (LinearLayout) findViewById(R.id.Scroller);
                                    ArticleView newView = new ArticleView(AddArticleActivity.this, userinputamount.getText().toString(), userinputname.getText().toString());
                                    Layout.addView(newView);
                                }
                                else {
                                    Context context = getApplicationContext();
                                    CharSequence text = "Het veld mag niet leeg zijn!";
                                    int duration = Toast.LENGTH_SHORT;

                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            }
                        });
                Dialog dialog = alertBuilder.create();
                dialog.show();
                dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

            }
        });
    }
}
