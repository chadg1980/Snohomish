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
        pizza.add(new Business(R.drawable.cathouse,  "Cathouse Pizza",
                "http://cathousepizza.com/", "(425)9316050", 4.4f));
        pizza.add(new Business(R.drawable.pizzaicon, "Alfy's Pizza",
                "http://www.alfyspizza.com/", "(360)568-0804", 3.5f));
        pizza.add(new Business(R.drawable.pizzaicon, "#1 N.Y. Pizza",
                "https://www.facebook.com/1NewYorkPizzeriaSnohomishWa/", "(360)668-7282", 4.5f));
        pizza.add(new Business(R.drawable.pizzaicon, "Brava's Pizza",
                "bravaspizza.com", "(360)862-0900", 4.0f));
        pizza.add(new Business(R.drawable.pizzaicon, "Domino's Pizza",
                "http://www.dominos.com", "(425) 379-8000", 4.0f));
        pizza.add(new Business(R.drawable.pizzaicon, "Little Ceasars Pizza",
                "https://littlecaesars.com/en-us/", "(555)555-1212", 2.0f));
        pizza.add(new Business(R.drawable.pizzaicon, "Jet City Pizza",
                "http://www.jetcitypizza.com/", "(555)555-1212", 4.5f));
        pizza.add(new Business(R.drawable.pizzaicon, "Maltby Pizza & Pasta",
                "http://www.maltbypizza.com/", "(360)668-5757", 4.0f));


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
