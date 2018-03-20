package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Fabien Boismoreau on 11/03/2018.
 * <p>
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[];
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);

        this.context = context;

        tabTitles = new String[]{
                this.context.getString(R.string.category_numbers),
                this.context.getString(R.string.category_family),
                this.context.getString(R.string.category_colors),
                this.context.getString(R.string.category_phrases)};
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhraseFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}