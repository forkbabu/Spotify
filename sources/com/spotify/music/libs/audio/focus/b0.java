package com.spotify.music.libs.audio.focus;

import android.content.Context;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public final class b0 implements fjf<a0> {
    private final wlf<Context> a;
    private final wlf<d> b;
    private final wlf<MediaFocusManager> c;
    private final wlf<s<LocalPlaybackStatus>> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<y> f;

    public b0(wlf<Context> wlf, wlf<d> wlf2, wlf<MediaFocusManager> wlf3, wlf<s<LocalPlaybackStatus>> wlf4, wlf<g<PlayerState>> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a0(this.a.get(), this.b, this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
