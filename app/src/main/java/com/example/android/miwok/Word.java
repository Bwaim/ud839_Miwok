package com.example.android.miwok;

/**
 * Created by Fabien Boismoreau on 19/02/2018.
 * <p/>
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaukt, String miwok) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = defaukt;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getdefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
