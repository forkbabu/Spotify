package com.spotify.encore.consumer.elements.thumb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class ThumbButtonDrawables {
    public static final ThumbButtonDrawables INSTANCE = new ThumbButtonDrawables();

    private ThumbButtonDrawables() {
    }

    private final SpotifyIconV2 getIcon(ThumbButtonType thumbButtonType, ThumbButtonState thumbButtonState) {
        ThumbButtonType thumbButtonType2 = ThumbButtonType.UP;
        if (thumbButtonType == thumbButtonType2 && thumbButtonState == ThumbButtonState.NOT_ACTIVATED) {
            return ThumbButtonDrawablesKt.UP_ICON;
        }
        if (thumbButtonType == thumbButtonType2 && thumbButtonState == ThumbButtonState.ACTIVATED) {
            return ThumbButtonDrawablesKt.ACTIVATED_UP_ICON;
        }
        if (thumbButtonType == ThumbButtonType.DOWN && thumbButtonState == ThumbButtonState.NOT_ACTIVATED) {
            return ThumbButtonDrawablesKt.DOWN_ICON;
        }
        return ThumbButtonDrawablesKt.ACTIVATED_DOWN_ICON;
    }

    public final Drawable createDrawable(Context context, ThumbButtonType thumbButtonType, ThumbButtonState thumbButtonState, float f) {
        h.e(context, "context");
        h.e(thumbButtonType, "type");
        h.e(thumbButtonState, "state");
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, getIcon(thumbButtonType, thumbButtonState), f);
        spotifyIconDrawable.s(a.c(context, ThumbButtonDrawablesKt.COLOR_RES));
        return spotifyIconDrawable;
    }
}
