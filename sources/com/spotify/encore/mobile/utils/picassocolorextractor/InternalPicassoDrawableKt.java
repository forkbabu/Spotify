package com.spotify.encore.mobile.utils.picassocolorextractor;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class InternalPicassoDrawableKt {
    public static final void setPlaceholder(ImageView imageView, int i, Drawable drawable) {
        h.e(imageView, "$this$setPlaceholder");
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageDrawable(drawable);
        }
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                ((AnimationDrawable) drawable2).start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        }
    }

    public static final void withDrawable(ImageView imageView, Drawable drawable, Picasso.LoadedFrom loadedFrom) {
        h.e(imageView, "$this$withDrawable");
        h.e(drawable, "innerDrawable");
        h.e(loadedFrom, "loadedFrom");
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable2).stop();
        }
        imageView.setImageDrawable(new InternalPicassoDrawable(drawable, drawable2, loadedFrom));
    }
}
