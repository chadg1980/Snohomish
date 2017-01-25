package com.h.chad.snohomish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chad on 1/24/2017.
 */

public class OtherFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_list);

        ArrayList<Business> otherFood = new ArrayList<>();
        otherFood.add(new Business(R.drawable.otherfood, "Andy's Seafood",
                "google.com", "(360)862-0782", 4.0f));
        otherFood.add(new Business(R.drawable.otherfood, "Jake's Cafe",
                "https://www.facebook.com/JakesCafeSnohomish/?rf=1464704303763479",
                "(360)563-0896", 5.0f));
        otherFood.add(new Business(R.drawable.otherfood, "Cabbage Patch Restaurant",
                "http://www.cabbagepatchrestaurant.com/banquets.html", "(360)568-9091", 4.5f));
        otherFood.add(new Business(R.drawable.otherfood, "Collector's Choice Restaurant",
                "http://www.ccrsnohomish.com/", "(360)568-1277", 4.0f));
        otherFood.add(new Business(R.drawable.otherfood, "The Hungry Pelican",
                "http://www.yelp.com/", "(360)243-3278", 5.0f));

        //Create an adapter where the data source is the list of Businesses.
        //The adapter knows how to create list items for each item in the list
        businessAdapter adapter = new businessAdapter(this, otherFood, R.color.otherBackground);

        //Find the object in the view hierarchy
        //There should be a ListView with the view ID called list, which is declared in
        //the business_list.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the businessAdaper created above.
        listView.setAdapter(adapter);
    }
}

