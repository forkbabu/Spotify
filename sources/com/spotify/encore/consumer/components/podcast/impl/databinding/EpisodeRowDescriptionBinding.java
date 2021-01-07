package com.spotify.encore.consumer.components.podcast.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encore.consumer.components.podcast.impl.R;

public final class EpisodeRowDescriptionBinding {
    public final TextView description;
    public final ImageView icon;
    private final View rootView;
    public final TextView tagLine;

    private EpisodeRowDescriptionBinding(View view, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = view;
        this.description = textView;
        this.icon = imageView;
        this.tagLine = textView2;
    }

    public static EpisodeRowDescriptionBinding bind(View view) {
        int i = R.id.description;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.tag_line;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    return new EpisodeRowDescriptionBinding(view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EpisodeRowDescriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.episode_row_description, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
