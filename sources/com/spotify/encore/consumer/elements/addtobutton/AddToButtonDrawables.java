package com.spotify.encore.consumer.elements.addtobutton;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.jvm.internal.h;

public final class AddToButtonDrawables {
    public static final AddToButtonDrawables INSTANCE = new AddToButtonDrawables();

    private AddToButtonDrawables() {
    }

    public final Drawable createDrawable(Context context, AddToButtonState addToButtonState, float f) {
        h.e(context, "context");
        h.e(addToButtonState, "state");
        AddToButtonState addToButtonState2 = AddToButtonState.ADD;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, addToButtonState == addToButtonState2 ? AddToButtonDrawablesKt.ADD_ICON : AddToButtonDrawablesKt.ADDED_ICON, f);
        if (addToButtonState == addToButtonState2) {
            spotifyIconDrawable.r(a.b(context, AddToButtonDrawablesKt.ADD_COLOR_RES));
        } else {
            spotifyIconDrawable.s(a.c(context, AddToButtonDrawablesKt.ADDED_COLOR_RES));
        }
        return spotifyIconDrawable;
    }
}
