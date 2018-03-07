package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fabien Boismoreau on 19/02/2018.
 * <p/>
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundTextColorId;

    /**
     * Constructor
     *
     * @param context The current context.
     * @param objects The objects to represent in the ListView.
     */
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int backgroungColorId) {
        super(context, 0, objects);
        mBackgroundTextColorId = backgroungColorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getdefaultTranslation());

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        LinearLayout container = listItemView.findViewById(R.id.text_container);
        container.setBackgroundResource(mBackgroundTextColorId);

        return listItemView;
    }
}
