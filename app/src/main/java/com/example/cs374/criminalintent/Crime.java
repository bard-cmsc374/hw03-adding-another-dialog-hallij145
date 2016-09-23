package com.example.cs374.criminalintent;

import java.util.UUID;

/**
 * Created by hallij145 on 9/19/16.
 */

public class Crime {
    private UUID mId;
    private String mTitle;


    public Crime(){
        //Generation of unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
