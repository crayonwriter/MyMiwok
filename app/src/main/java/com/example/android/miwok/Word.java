package com.example.android.miwok;

import android.support.annotation.Nullable;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Two constructors for a new Word Object
     *
     * @param defaultTranslation is the word translated into the user's native language
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Two constructors for a new Word Object
     *
     * @param defaultTranslation is the word translated into the user's native language
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the drawable resource id for the image associated with the word
     **/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get the default translation of the word.

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //Get the Miwok translation of the word.
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get the resourceId


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
