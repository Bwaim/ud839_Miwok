package com.example.android.miwok;

/**
 * Created by Fabien Boismoreau on 19/02/2018.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public Word(String defaukt, String miwok) {
        mMiwokTranslation = miwok;
        mDefaultTranslation = defaukt;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getdefaultTranslation() {
        return mDefaultTranslation;
    }
}
