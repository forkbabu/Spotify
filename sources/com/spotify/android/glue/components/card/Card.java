package com.spotify.android.glue.components.card;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;

public interface Card extends g90, f90 {

    public enum TextLayout {
        DEFAULT,
        DOUBLE_LINE_TITLE,
        DOUBLE_LINE_SUBTITLE;

        static {
            values();
        }
    }

    ImageView getImageView();

    void m0(CharSequence charSequence, Drawable drawable);

    void setAccessoryDrawable(CardAccessoryDrawable cardAccessoryDrawable);

    void setTextLayout(TextLayout textLayout);

    void setTitle(CharSequence charSequence);
}
