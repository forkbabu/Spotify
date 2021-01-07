package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.n;
import com.spotify.music.podcastentityrow.playback.b;

/* renamed from: kgc  reason: default package */
public final class kgc implements fjf<jgc> {
    private final wlf<c> a;
    private final wlf<b> b;
    private final wlf<t> c;
    private final wlf<tsc> d;
    private final wlf<j> e;
    private final wlf<qsc> f;
    private final wlf<n> g;
    private final wlf<d> h;

    public kgc(wlf<c> wlf, wlf<b> wlf2, wlf<t> wlf3, wlf<tsc> wlf4, wlf<j> wlf5, wlf<qsc> wlf6, wlf<n> wlf7, wlf<d> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static kgc a(wlf<c> wlf, wlf<b> wlf2, wlf<t> wlf3, wlf<tsc> wlf4, wlf<j> wlf5, wlf<qsc> wlf6, wlf<n> wlf7, wlf<d> wlf8) {
        return new kgc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jgc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
