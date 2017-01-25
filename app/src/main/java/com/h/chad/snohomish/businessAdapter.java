package com.h.chad.snohomish;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Set;

import static android.R.attr.id;
import static android.support.v4.content.ContextCompat.getColor;

import static com.h.chad.snohomish.R.color.link;
import static com.h.chad.snohomish.R.id.businessName;
import static com.h.chad.snohomish.R.id.textContainer;

/**
 * Created by chad on 1/23/2017.
 */

/**
 * businessAdapter that can provide the layout for each list item
 * based on data source, which is a list of Business objects
 */
public class businessAdapter extends ArrayAdapter<Business>{

    private int mColorID;

    /**
     * Create a new business object
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in
     * @param business is the list of Businesses to be displayed
     *
     */
    public  businessAdapter(Context context, ArrayList<Business> business, int colorID){
        super(context, 0, business);
        mColorID = colorID;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //get the business object located at this position in the list
        Business currentBusiness = getItem(position);

        //Find the ImageView for the businesslogo
        ImageView logo = (ImageView)listItemView.findViewById(R.id.businessLogo);
        //Logo is displayed or a no logo provided image is displayed
        if(currentBusiness.hasImgage()) {
            logo.setImageResource(currentBusiness.getImageResource());
            logo.setVisibility(View.VISIBLE);
        }else{
            logo.setVisibility(View.GONE);
        }

        //Find the TextView in the list_item.xml layout with the ID businessName
        TextView bName = (TextView) listItemView.findViewById(businessName);

        //Get the current business name from the currentBusiness object and set this text on
        //current businessName textview
        bName.setText(currentBusiness.getBusinesName());

        //find the TextView in the list_item.xml with the ID of businessWebsite
        TextView businessWebsite = (TextView)listItemView.findViewById(R.id.businessWebsite);
        //get the website from the currentBusiness object and set the text on it.
        businessWebsite.setText(currentBusiness.getWebSite());

        //Make the link clickable
        Linkify.addLinks(businessWebsite, Linkify.WEB_URLS);
        businessWebsite.setLinksClickable(true);
        //Set the link color to blue
        int linkText = ContextCompat.getColor(getContext(), link);
        businessWebsite.setShadowLayer(1, 1, 1, Color.WHITE);
        businessWebsite.setLinkTextColor(linkText);



        //Get the TextView for the phone number
        TextView businessPhone = (TextView) listItemView.findViewById(R.id.phoneNumber);
        businessPhone.setText(currentBusiness.getBusinessPhone());
        int phoneColor = ContextCompat.getColor(getContext(), R.color.appBackground);
        Linkify.addLinks(businessPhone, Linkify.PHONE_NUMBERS);
        businessPhone.setLinkTextColor(phoneColor);

        //Get the rating bar
        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.ratingBar);

        //Change the rating bar colors
        LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
        stars.getDrawable(0).setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_ATOP);
        ratingBar.setRating(currentBusiness.getRating());

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = getColor(getContext(), mColorID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
