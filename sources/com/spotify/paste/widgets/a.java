package com.spotify.paste.widgets;

import android.view.View;
import android.widget.ImageView;

public interface a {
    View getHeaderView();

    ImageView getImageView();

    void setContentView(View view);

    void setImageOverlay(View view);

    void setTitle(CharSequence charSequence);
}
