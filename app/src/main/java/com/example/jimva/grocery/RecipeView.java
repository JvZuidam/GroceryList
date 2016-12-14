package com.example.jimva.grocery;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/28/2016.
 */

public class RecipeView extends RelativeLayout {

    private String RecipeName;

    public RecipeView(Context context, String name) {
        super(context);
        RecipeName = name;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.recipe_layout, this);
        TextView Txt1 = (TextView) findViewById(R.id.RecNameVw);
        Txt1.setText(RecipeName);
    }
}
