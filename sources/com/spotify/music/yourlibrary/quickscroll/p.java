package com.spotify.music.yourlibrary.quickscroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* access modifiers changed from: package-private */
public class p {
    private final Context a;

    p(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public Drawable a(SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.a, spotifyIconV2, this.a.getResources().getDimension(i));
        spotifyIconDrawable.r(i2);
        return spotifyIconDrawable;
    }
}
