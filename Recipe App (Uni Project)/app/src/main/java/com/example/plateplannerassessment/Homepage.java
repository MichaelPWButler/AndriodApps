package com.example.plateplannerassessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Homepage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        TextView dateField =findViewById(R.id.date);
        SimpleDateFormat DisplayDate = new SimpleDateFormat("EEEE dd MMMM");
        String currentDateAndTime = DisplayDate.format(new Date());
        dateField.setText(currentDateAndTime);
        dateField.setTypeface(null, Typeface.BOLD);

        CardView recipes = (CardView) findViewById(R.id.recipeCard);
        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecipesHomepage.class));

            }
        });
    }
}



