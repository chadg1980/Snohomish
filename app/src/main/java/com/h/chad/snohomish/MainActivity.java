package com.h.chad.snohomish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;
import static com.h.chad.snohomish.R.id.mainPizza;
import static com.h.chad.snohomish.R.id.mainBurger;
import static com.h.chad.snohomish.R.id.titleDividerNoCustom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToPizza();
        goToBurgers();
        goToTacos();
        goToAsianFood();
        goToOtherFood();
    }

    private void goToPizza() {
        TextView pizza = (TextView) findViewById(R.id.mainPizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a new intent to open the PizzaActivity
                Intent pizzaIntent = new Intent(MainActivity.this, PizzaActivity.class);

                //Start the new activity
                startActivity(pizzaIntent);
            }
        });
    }
    private void goToBurgers(){
       TextView hamburger = (TextView) findViewById(R.id.mainBurger);
        hamburger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a new intent to open BurgersActivity
                Intent burgerIntent = new Intent(MainActivity.this, BurgersActivity.class);
                startActivity(burgerIntent);
            }
        });
    }
    private void goToTacos(){
        TextView tacos = (TextView) findViewById(R.id.mainTacos);
        tacos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a new intent to open BurgersActivity
                Intent tacosIntent = new Intent(MainActivity.this, TacoActivity.class);
                startActivity(tacosIntent);
            }
        });
    }
    private void goToAsianFood(){
        TextView asianFood = (TextView) findViewById(R.id.mainAsian);
        asianFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asianFoodIntent = new Intent(MainActivity.this, AsianActivity.class);
                startActivity(asianFoodIntent);
            }
        });
    }

    private void goToOtherFood(){
        TextView otherFood = (TextView) findViewById(R.id.mainOther);
        otherFood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent otherFoodIntent = new Intent(MainActivity.this, OtherFoodActivity.class);
                startActivity(otherFoodIntent);
            }
        });
    }
}
