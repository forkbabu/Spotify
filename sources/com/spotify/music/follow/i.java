package com.spotify.music.follow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.CheckableImageButton;

public final class i {
    private static c a(Context context, Drawable drawable) {
        c cVar = new c(drawable, 0.6f);
        cVar.e(a.c(context, C0707R.color.cat_button_border));
        cVar.f((float) nud.g(2.0f, context.getResources()));
        return cVar;
    }

    public static View b(Context context) {
        int g = nud.g(26.0f, context.getResources());
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIcon.ADDFOLLOW_32);
        spotifyIconDrawable.r(nud.h(context, C0707R.attr.pasteColorAccessory));
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIcon.CHECK_32);
        spotifyIconDrawable2.r(a.b(context, R.color.white));
        c a = a(context, spotifyIconDrawable);
        c a2 = a(context, spotifyIconDrawable2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, a);
        stateListDrawable.addState(new int[]{16842912}, a2);
        CheckableImageButton checkableImageButton = new CheckableImageButton(context);
        checkableImageButton.setLayoutParams(new LinearLayout.LayoutParams(g, g));
        checkableImageButton.setImageDrawable(stateListDrawable);
        checkableImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        checkableImageButton.setBackgroundResource(0);
        checkableImageButton.setPadding(0, 0, 0, 0);
        checkableImageButton.setFocusable(false);
        checkableImageButton.setId(C0707R.id.follow_button);
        return checkableImageButton;
    }
}
