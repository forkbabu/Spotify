package com.spotify.encore.consumer.elements.quickactions;

import android.content.Context;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class ActionIconUtils {
    private ActionIconUtils() {
    }

    public static SpotifyIconDrawable getIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        return getIconDrawable(context, spotifyIconV2, i, context.getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size));
    }

    public static SpotifyIconDrawable getIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) i2);
        spotifyIconDrawable.s(a.c(context, i));
        return spotifyIconDrawable;
    }
}
