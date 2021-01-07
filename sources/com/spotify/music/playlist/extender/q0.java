package com.spotify.music.playlist.extender;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class q0 implements fjf<SpotifyIconDrawable> {
    private final wlf<Context> a;

    public q0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new SpotifyIconDrawable(this.a.get(), SpotifyIcon.REFRESH_16);
    }
}
