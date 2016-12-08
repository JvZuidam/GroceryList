package com.example.jimva.grocery;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/26/2016.
 */

public class IngredientView extends RelativeLayout{

    private String Amount;
    private String Name;

    public IngredientView(Context context, String amount, String name) {
        super(context);
        Amount = amount;
        Name = name;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.article_ingredient_layout, this);
        TextView Txt1 = (TextView) findViewById(R.id.AmountVw);
        TextView Txt2 = (TextView) findViewById(R.id.NameVw);
        Txt1.setText(Amount);
        Txt2.setText(Name);
    }
}
