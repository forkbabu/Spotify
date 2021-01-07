package com.spotify.music.features.yourepisodes;

import androidx.lifecycle.n;
import com.spotify.music.podcastentityrow.playback.DefaultEpisodePlayButtonClickListener;
import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.music.podcastentityrow.s;
import kotlin.jvm.internal.h;

public final class c implements fjf<b> {
    private final wlf<com.spotify.music.libs.viewuri.c> a;
    private final wlf<fnc> b;
    private final wlf<s> c;
    private final wlf<n> d;

    public c(wlf<com.spotify.music.libs.viewuri.c> wlf, wlf<fnc> wlf2, wlf<s> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        com.spotify.music.libs.viewuri.c cVar = this.a.get();
        fnc fnc = this.b.get();
        s sVar = this.c.get();
        n nVar = this.d.get();
        h.e(cVar, "viewUri");
        h.e(fnc, "podcastPlayer");
        h.e(sVar, "podcastItemConfig");
        h.e(nVar, "lifeCycleOwner");
        return new DefaultEpisodePlayButtonClickListener(fnc, cVar, sVar, nVar);
    }
}
