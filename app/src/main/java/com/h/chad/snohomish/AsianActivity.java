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

        ArrayList<Business> asianFood = new ArrayList<>();
        asianFood.add(new Business(R.drawable.asianfood, "Snohomih Teriyaki",
                "google.com", "(360)568-20000", 4.0f));
        asianFood.add(new Business(R.drawable.asianfood, "Thai Naan",
                "http://thainaansnohomish.com/", "(360)568-6426", 4.0f));
        asianFood.add(new Business(R.drawable.asianfood, "Niko Teriyaki",
                "http://yelp.com/", "(360)568-3190", 3.5f));
        asianFood.add(new Business(R.drawable.asianfood, "Kami Teriyaki",
                "http://yelp.com/", "(425)322-4921", 4.0f));
        asianFood.add(new Business(R.drawable.asianfood, "Peking Duck",
                "http://yelp.com/", "(360)568-7634", 3.5f));
        asianFood.add(new Business(R.drawable.asianfood, "Pho Mimosa",
                "http://chownow.com/", "(360)568-2910", 3.5f));

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

