package com.h.chad.snohomish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chad on 1/23/2017.
 */

public class PizzaActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_list);

        //create a list of Pizza businesses
        ArrayList<Business> pizza = new ArrayList<Business>();
        pizza.add(new Business(R.drawable.cathouse,
                getString(R.string.cathousePizzaName),
                getString(R.string.cathousePizzaWebsite),
                getString(R.string.cathousePizzaPhone),
                4.4f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.alfysPizzaName),
                getString(R.string.alfysPizzaWebsite),
                getString(R.string.alfysPizzaPhone),
                3.5f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.nyPizzaName),
                getString(R.string.nyPizzaWebsite),
                getString(R.string.nyPizzaPhone),
                4.5f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.bravaPizzaName),
                getString(R.string.bravaPizzaWebsite),
                getString(R.string.bravaPizzaPhone),
                4.0f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.dominoPizzaName),
                getString(R.string.dominoPizzaWebsite),
                getString(R.string.dominoPizzaPhone),
                4.0f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.littlePizzaName),
                getString(R.string.dominoPizzaWebsite),
                getString(R.string.littlePizzaPhone),
                2.0f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.jetcityPizzaName),
                getString(R.string.jetcityPizzaWebsite),
                getString(R.string.jetcityPizzaPhone),
                4.5f));
        pizza.add(new Business(R.drawable.pizzaicon,
                getString(R.string.maltbyPizzaName),
                getString(R.string.maltbyPizzaWebsite),
                getString(R.string.maltbyPizzaPhone),
                4.0f));

        //Create an adapter where the data source is the list of Businesses.
        //The adapter knows how to create list items for each item in the list
        businessAdapter adapter = new businessAdapter(this, pizza, R.color.pizzaBackground);

        //Find the object in the view hierarchy
        //There should be a ListView with the view ID called list, which is declared in
        //the business_list.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the businessAdaper created above.
        listView.setAdapter(adapter);
    }
}
