package com.spotify.music.podcastentityrow.playback;

import androidx.lifecycle.n;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.s;

public final class a implements fjf<DefaultEpisodePlayButtonClickListener> {
    private final wlf<fnc> a;
    private final wlf<c> b;
    private final wlf<s> c;
    private final wlf<n> d;

    public a(wlf<fnc> wlf, wlf<c> wlf2, wlf<s> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultEpisodePlayButtonClickListener(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
