package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.podcast.impl.R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class IconUtilsKt {
    private static final float CHECK_FILL_ICON_SIZE_DP = 16.0f;
    private static final float HALF_SCALE = 0.5f;
    private static final float PLAY_PAUSE_ICON_SIZE_DP = 16.0f;

    public static final SpotifyIconDrawable createCheckFillIcon(Context context) {
        h.e(context, "context");
        return createIconDrawable(context, SpotifyIconV2.CHECK_ALT_FILL, 16.0f, R.color.bg_icon_white);
    }

    private static final c createCircleDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f, int i) {
        return makeCircleDrawable(context, createIconDrawable(context, spotifyIconV2, f, i));
    }

    private static final SpotifyIconDrawable createIconDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) nud.g(f, context.getResources()));
        spotifyIconDrawable.s(a.c(context, i));
        return spotifyIconDrawable;
    }

    public static final c createPauseIcon(Context context) {
        h.e(context, "context");
        return createCircleDrawable(context, SpotifyIconV2.PAUSE, 16.0f, R.color.bg_play_pause_icon);
    }

    public static final c createPlayIcon(Context context) {
        h.e(context, "context");
        return createCircleDrawable(context, SpotifyIconV2.PLAY, 16.0f, R.color.bg_play_pause_icon);
    }

    private static final c makeCircleDrawable(Context context, Drawable drawable) {
        c cVar = new c(drawable, HALF_SCALE);
        cVar.f(0.0f);
        cVar.c(a.c(context, R.color.bg_icon_white));
        return cVar;
    }
}
