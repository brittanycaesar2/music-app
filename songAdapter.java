package com.example.android.music;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class songAdapter  extends ArrayAdapter<songs> {

    /**
     * Create a new {@link songAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songsArrayList is the list of {@link songs}s to be displayed.
     */
    public songAdapter(Context context, ArrayList<songs> songsArrayList) {
        super(context, 0, songsArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        songs currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID dookie_text_view.
        TextView dookieTextView = (TextView) listItemView.findViewById(R.id.dookie_text_view);
        // Get song title from the currentWord object and set this text on
        // the dookie TextView.
        dookieTextView.setText(currentSong.getSongTile());

        // Find the TextView in the list_item.xml layout with the ID GreenDay1_text_view.
        TextView GreenDay1TextView = (TextView) listItemView.findViewById(R.id.GreenDay1);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        GreenDay1TextView.setText(currentSong.getArtistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
