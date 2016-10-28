package com.example.jimva.grocery;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.LinearLayout;

/**
 * Created by jimva on 10/24/2016.
 */

public class AddRecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_recipe);

        FloatingActionButton next = (FloatingActionButton) findViewById(R.id.BtnActAddItem);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), NewRecipeActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
        LinearLayout Layout = (LinearLayout) findViewById(R.id.Scroller);
        for (int i = 1; i<20; i++) {
            RecipeView newView = new RecipeView(this, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
            Layout.addView(newView);
        }
    }
}