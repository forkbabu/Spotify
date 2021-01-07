package com.spotify.music.playlist.extender;

import android.animation.ObjectAnimator;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class p0 implements fjf<ObjectAnimator> {
    private final wlf<SpotifyIconDrawable> a;

    public p0(wlf<SpotifyIconDrawable> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a.get(), "rotation", 0.0f, 360.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new j0());
        return ofFloat;
    }
}
