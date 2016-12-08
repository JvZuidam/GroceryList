package com.example.jimva.grocery;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/28/2016.
 */

public class RecipeView extends RelativeLayout {

    private String RecipeName;
    private String IngredientAmount;
    private String IngredientName;

    public RecipeView(Context context, String name, String ingredientamount, String ingredientname) {
        super(context);
        RecipeName = name;
        IngredientAmount = ingredientamount;
        IngredientName = ingredientname;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.recipe_layout, this);
        TextView Txt1 = (TextView) findViewById(R.id.RecNameVw);
        TextView Txt2 = (TextView) findViewById(R.id.NameVw);
        TextView Txt3 = (TextView) findViewById(R.id.AmountVw);
        Txt1.setText(RecipeName);
        Txt2.setText(IngredientName);
        Txt3.setText(IngredientAmount);

    }
}
