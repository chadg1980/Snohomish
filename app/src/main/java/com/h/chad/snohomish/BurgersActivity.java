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

        burger.add(new Business(R.drawable.burgericon, "Pilchuck Drive In",
                "www.google.com", "(360)568-4413", 4.0f));
        burger.add(new Business(R.drawable.burgericon, "Burger King",
                "www.burgerking.com", "(360)568-1578", 2.5f));
        burger.add(new Business(R.drawable.buzzinn, "Buzz Inn Steakhouse",
                "http://www.buzzinnsteakhouse.com/", "(360)568-1578", 3.5f));
        burger.add(new Business(R.drawable.burgericon, "Jack in the Box",
                "www.jackinthebox.com", "(360)568-6644", 3.0f));
        burger.add(new Business(R.drawable.burgericon, "King Charley's Drive-In",
                "www.google.com", "(360)568-2963", 4.5f));

        //Create an adapter where the data source is the list of Businesses
        businessAdapter adapter = new businessAdapter(this, burger, R.color.burgerBackground);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }


}
