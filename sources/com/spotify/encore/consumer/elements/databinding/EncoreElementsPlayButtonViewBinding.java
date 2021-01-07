package com.spotify.encore.consumer.elements.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.encore.consumer.elements.R;

public final class EncoreElementsPlayButtonViewBinding {
    public final ImageButton buttonPlay;
    public final ImageButton imageShuffle;
    private final View rootView;

    private EncoreElementsPlayButtonViewBinding(View view, ImageButton imageButton, ImageButton imageButton2) {
        this.rootView = view;
        this.buttonPlay = imageButton;
        this.imageShuffle = imageButton2;
    }

    public static EncoreElementsPlayButtonViewBinding bind(View view) {
        int i = R.id.button_play;
        ImageButton imageButton = (ImageButton) view.findViewById(i);
        if (imageButton != null) {
            i = R.id.image_shuffle;
            ImageButton imageButton2 = (ImageButton) view.findViewById(i);
            if (imageButton2 != null) {
                return new EncoreElementsPlayButtonViewBinding(view, imageButton, imageButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EncoreElementsPlayButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.encore_elements_play_button_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
