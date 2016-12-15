package com.example.jimva.grocery;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/26/2016.
 */

public class MainView extends RelativeLayout{

    private String MainAmount;
    private String MainName;

    public MainView(Context context, String mainamount, String mainname) {
        super(context);
        MainAmount = mainamount;
        MainName = mainname;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.article_ingredient_layout, this);
        TextView Txt1 = (TextView) findViewById(R.id.AmountVw);
        TextView Txt2 = (TextView) findViewById(R.id.NameVw);
        Txt1.setText(MainAmount);
        Txt2.setText(MainName);
    }
}
