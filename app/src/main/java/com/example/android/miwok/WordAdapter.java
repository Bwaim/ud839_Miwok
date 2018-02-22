package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fabien Boismoreau on 19/02/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Constructor
     *
     * @param context The current context.
     * @param objects The objects to represent in the ListView.
     */
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
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

        TextView defaultTranslation = listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getdefaultTranslation());

        TextView miwokTranslation = listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}
