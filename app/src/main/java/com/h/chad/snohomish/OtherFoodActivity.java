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

        //create a list of Other Food businesses
        ArrayList<Business> otherFood = new ArrayList<>();
        otherFood.add(new Business(R.drawable.otherfood,
                getString(R.string.andyOtherFoodName),
                getString(R.string.andyOtherFoodWeb),
                getString(R.string.andyOtherFoodPhone),
                4.0f));
        otherFood.add(new Business(R.drawable.otherfood,
                getString(R.string.jakeOtherFoodName),
                getString(R.string.jakeOtherFoodWeb),
                getString(R.string.jakeOtherFoodPhone),
                5.0f));
        otherFood.add(new Business(R.drawable.otherfood,
                getString(R.string.patchOtherFoodName),
                getString(R.string.patchOtherFoodWeb),
                getString(R.string.patchOtherFoodPhone),
                4.5f));
        otherFood.add(new Business(R.drawable.otherfood,
                getString(R.string.choiceOtherFoodName),
                getString(R.string.choiceOtherFoodWeb),
                getString(R.string.choiceOtherFoodPhone),
                4.0f));

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

