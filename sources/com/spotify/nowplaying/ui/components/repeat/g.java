package com.spotify.nowplaying.ui.components.repeat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.player.options.RepeatMode;

public final class g {
    public static Drawable a(Context context, RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return gqd.w(context);
        }
        if (ordinal == 1) {
            return gqd.v(context);
        }
        if (ordinal == 2) {
            return gqd.x(context);
        }
        throw new IllegalArgumentException("Unsupported RepeatMode " + repeatMode);
    }
}
