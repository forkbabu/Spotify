package com.spotify.music.preview;

import android.media.AudioManager;
import androidx.lifecycle.n;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.rx.w;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class x implements fjf<w> {
    private final wlf<n> a;
    private final wlf<d> b;
    private final wlf<y> c;
    private final wlf<k.a> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<w> f;
    private final wlf<io.reactivex.y> g;
    private final wlf<AudioManager> h;
    private final wlf<cqe> i;
    private final wlf<qxc> j;

    public x(wlf<n> wlf, wlf<d> wlf2, wlf<y> wlf3, wlf<k.a> wlf4, wlf<g<PlayerState>> wlf5, wlf<w> wlf6, wlf<io.reactivex.y> wlf7, wlf<AudioManager> wlf8, wlf<cqe> wlf9, wlf<qxc> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static x a(wlf<n> wlf, wlf<d> wlf2, wlf<y> wlf3, wlf<k.a> wlf4, wlf<g<PlayerState>> wlf5, wlf<w> wlf6, wlf<io.reactivex.y> wlf7, wlf<AudioManager> wlf8, wlf<cqe> wlf9, wlf<qxc> wlf10) {
        return new x(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
