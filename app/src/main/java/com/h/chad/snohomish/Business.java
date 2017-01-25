package com.h.chad.snohomish;

import android.telephony.PhoneNumberUtils;
import android.widget.RatingBar;

import static com.h.chad.snohomish.R.id.businessName;

/**
 * Created by chad on 1/23/2017.
 */

public class Business {

    private String mBusinessName;
    private String mWebSite;
    private String mBusinessPhone;
    private float mRating;
    private int mImageResource = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Business(int imageResource, String businessName, String webSite, String phoneNumber, float ratings){
        mBusinessName = businessName;
        mWebSite = webSite;
        mBusinessPhone = phoneNumber;
        mRating = ratings;
        mImageResource = imageResource;
    }
    public Business(String businessName, String webSite, String phoneNumber, float ratings){
        mBusinessName = businessName;
        mWebSite = webSite;
        mBusinessPhone = phoneNumber;
        mRating = ratings;

    }
    public Business(int imageResource, String businessName, String webSite, String phoneNumber){
        mBusinessName = businessName;
        mWebSite = webSite;
        mBusinessPhone = phoneNumber;
        mImageResource = imageResource;
        mRating = 0;

    }
    public Business(String businessName, String webSite, String phoneNumber){
        mBusinessName = businessName;
        mWebSite = webSite;
        mBusinessPhone = phoneNumber;
        mRating = 0;


    }

    public String getBusinesName(){
     return mBusinessName;
    }

    public String getWebSite() {
        return mWebSite;
    }

    public Float getRating() {
        return mRating;
    }

    public String getBusinessPhone() { return mBusinessPhone; }

    public int getImageResource() { return  mImageResource; }

    public boolean hasImgage() {
        return mImageResource != NO_IMAGE;
    }
}
