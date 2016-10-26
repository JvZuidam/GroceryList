package com.example.jimva.grocery;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;

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
    }
}