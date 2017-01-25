package com.h.chad.snohomish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chad on 1/24/2017.
 */

public class AsianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_list);

        //create a list of Asian Food businesses
        ArrayList<Business> asianFood = new ArrayList<>();
        asianFood.add(new Business(R.drawable.asianfood,
                getString(R.string.snoTeriyakiAsianFoodName),
                getString(R.string.snoTeriyakiAsainFoodWeb),
                getString(R.string.snoTeriyakiAsianPhone),
                4.0f));
        asianFood.add(new Business(R.drawable.asianfood,
                getString(R.string.thaiNaanAsianFoodName),
                getString(R.string.thaiNaanAsainFoodWeb),
                getString(R.string.thaiNaanAsianPhone),
                4.0f));
        asianFood.add(new Business(R.drawable.asianfood,
                getString(R.string.nikoAsianFoodName),
                getString(R.string.nikoAsainFoodWeb),
                getString(R.string.nikoAsianPhone),
                3.5f));
        asianFood.add(new Business(R.drawable.asianfood,
                getString(R.string.pekingAsianFoodName),
                getString(R.string.pekingAsainFoodWeb),
                getString(R.string.pekingAsianPhone),
                3.5f));
        asianFood.add(new Business(R.drawable.asianfood,
                getString(R.string.mimosaAsianFoodName),
                getString(R.string.mimosaAsainFoodWeb),
                getString(R.string.mimosaAsianFoodPhone),
                3.5f));

        //Create an adapter where the data source is the list of Businesses.
        //The adapter knows how to create list items for each item in the list
        businessAdapter adapter = new businessAdapter(this, asianFood, R.color.asianBackground);

        //Find the object in the view hierarchy
        //There should be a ListView with the view ID called list, which is declared in
        //the business_list.xml file
        ListView listView = (ListView) findViewById(R.id.list);

        //Make the ListView use the businessAdaper created above.
        listView.setAdapter(adapter);
    }
}

