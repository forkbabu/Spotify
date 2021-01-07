package com.spotify.nowplaying.ui.components.coverart;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.squareup.picasso.Picasso;

public class CoverArtView extends AppCompatImageView {
    public CoverArtView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setPicasso(Picasso picasso) {
    }

    public CoverArtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
