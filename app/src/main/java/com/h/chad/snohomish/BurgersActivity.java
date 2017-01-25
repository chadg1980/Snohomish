package com.h.chad.snohomish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by chad on 1/24/2017.
 */

public class BurgersActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_list);

        //Create a list of Burger businesses
        ArrayList<Business> burger = new ArrayList<>();

        burger.add(new Business(R.drawable.burgericon,
                getString(R.string.pilchuckBurgerName),
                getString(R.string.pilchuckBurgerWeb),
                getString(R.string.pilchuckBurgerPhone),
                4.0f));
        burger.add(new Business(R.drawable.burgericon,
                getString(R.string.kingBurgerName),
                getString(R.string.kingBurgerWeb),
                getString(R.string.kingBurgerPhone),
                2.5f));
        burger.add(new Business(R.drawable.buzzinn,
                getString(R.string.buzzBurgerName),
                getString(R.string.buzzBurgerWeb),
                getString(R.string.buzzBurgerPhone),
                3.5f));
        burger.add(new Business(R.drawable.burgericon,
                getString(R.string.charleyBurgerName),
                getString(R.string.charleyBurgerWeb),
                getString(R.string.charleyBurgerPhone),
                4.5f));

        //Create an adapter where the data source is the list of Businesses
        businessAdapter adapter = new businessAdapter(this, burger, R.color.burgerBackground);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
