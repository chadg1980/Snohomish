package com.h.chad.snohomish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chad on 1/24/2017.
 */

public class TacoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_list);

        ArrayList<Business> taco = new ArrayList<>();
        taco.add(new Business(R.drawable.tacobell, "Taco Bell",
                "http://tacobell.com", "(360)563-5503", 3.0f));
        taco.add(new Business(R.drawable.taco, "El Paraiso Mexican Grill",
                "locu.com", "(360)568-5406", 4.5f));
        taco.add(new Business(R.drawable.taco, "Tapatio Mexican Restaurant",
                "yelp.com", "(360)862-9530", 4.0f));
        taco.add(new Business(R.drawable.taco, "Todo Mexico",
                "http://www.todomexicorestaurants.com/", "(360)862-0210", 4.0f));
        taco.add(new Business(R.drawable.taco, "Ixtapa Restaurant",
                "www.google.com", "(360)568-4522", 4.5f));
        taco.add(new Business(R.drawable.taco, "Taqueria La Botana",
                "www.google.com", "(360)568-6578", 4.0f));

        //Create an adapter where the data source is the list of Businesses.
        //The adapter knows how to create list items for each item in the list
        businessAdapter adapter = new businessAdapter(this, taco, R.color.tacoBackground);

        //Find the object in the view hierarchy
        //There should be a ListView with the view ID called list, which is declared in
        //the business_list.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the businessAdaper created above.
        listView.setAdapter(adapter);
    }
}
