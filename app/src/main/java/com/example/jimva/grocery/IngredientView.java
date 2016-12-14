package com.example.jimva.grocery;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/26/2016.
 */

public class IngredientView extends RelativeLayout{

    private String IngredientAmount;
    private String IngredientName;

    public IngredientView(Context context, String ingredientamount, String ingredientname) {
        super(context);
        IngredientAmount = ingredientamount;
        IngredientName = ingredientname;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.article_ingredient_layout, this);
        TextView Txt1 = (TextView) findViewById(R.id.AmountVw);
        TextView Txt2 = (TextView) findViewById(R.id.NameVw);
        Txt1.setText(IngredientAmount);
        Txt2.setText(IngredientName);
    }
}
