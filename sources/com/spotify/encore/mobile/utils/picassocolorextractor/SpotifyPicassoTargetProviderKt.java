package com.spotify.encore.mobile.utils.picassocolorextractor;

import android.widget.ImageView;
import com.spotify.encore.mobile.utils.R;
import com.squareup.picasso.f0;
import kotlin.jvm.internal.h;

public final class SpotifyPicassoTargetProviderKt {
    public static final f0 providesTargetWithColor(ImageView imageView, ColorCallback colorCallback) {
        h.e(imageView, "imageView");
        int i = R.id.encore_spotify_picasso_target;
        SpotifyPicassoTarget spotifyPicassoTarget = (SpotifyPicassoTarget) imageView.getTag(i);
        if (spotifyPicassoTarget == null) {
            spotifyPicassoTarget = new SpotifyPicassoTarget(imageView, new SpotifyPicassoTargetProviderKt$providesTargetWithColor$1(imageView));
            imageView.setTag(i, spotifyPicassoTarget);
        }
        spotifyPicassoTarget.setCallback(colorCallback);
        return spotifyPicassoTarget;
    }
}
