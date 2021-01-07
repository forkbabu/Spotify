package com.spotify.music.features.yourlibrary.musicpages.prefs;

import android.content.Context;
import androidx.lifecycle.n;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;
import io.reactivex.y;

public final class u implements fjf<MusicPagesPrefs> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<cqe> c;
    private final wlf<g> d;
    private final wlf<io.reactivex.g<SessionState>> e;
    private final wlf<y> f;
    private final wlf<y> g;
    private final wlf<n> h;

    public u(wlf<Context> wlf, wlf<i> wlf2, wlf<cqe> wlf3, wlf<g> wlf4, wlf<io.reactivex.g<SessionState>> wlf5, wlf<y> wlf6, wlf<y> wlf7, wlf<n> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static u a(wlf<Context> wlf, wlf<i> wlf2, wlf<cqe> wlf3, wlf<g> wlf4, wlf<io.reactivex.g<SessionState>> wlf5, wlf<y> wlf6, wlf<y> wlf7, wlf<n> wlf8) {
        return new u(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new MusicPagesPrefs(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
