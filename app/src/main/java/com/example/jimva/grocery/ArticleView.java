package com.example.jimva.grocery;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jimva on 10/26/2016.
 */

public class ArticleView extends RelativeLayout {

    private String Name;

    public ArticleView(Context context, String name) {
        super(context);
        Name = name;
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.article_layout, this);
        TextView Txt2 = (TextView) findViewById(R.id.NameVw);
        Txt2.setText(Name);
    }
}
