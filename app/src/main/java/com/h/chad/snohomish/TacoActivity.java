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
        //create a list of Taco businesses
        ArrayList<Business> taco = new ArrayList<>();
        taco.add(new Business(R.drawable.tacobell,
                getString(R.string.bellTacoName),
                getString(R.string.bellTacoWeb),
                getString(R.string.bellTacoPhone),
                3.0f));
        taco.add(new Business(R.drawable.taco,
                getString(R.string.elParaisoTacoName),
                getString(R.string.elParaisoTacoWeb),
                getString(R.string.elParaisoTacoPhone),
                4.5f));
        taco.add(new Business(R.drawable.taco,
                getString(R.string.tapatioTacoName),
                getString(R.string.tapatioTacoWeb),
                getString(R.string.tapatioTacoPhone),
                4.0f));
        taco.add(new Business(R.drawable.taco,
                getString(R.string.todoTacoName),
                getString(R.string.todoTacoWeb),
                getString(R.string.todoTacoPhone),
                4.0f));
        taco.add(new Business(R.drawable.taco,
                getString(R.string.ixtapaTacoName),
                getString(R.string.ixtapaTacoWeb),
                getString(R.string.ixtapaTacoPhone),
                4.5f));


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
