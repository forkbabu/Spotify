package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.podcastentityrow.j;
import com.spotify.music.podcastentityrow.playback.b;

/* renamed from: hhc  reason: default package */
public final class hhc implements fjf<ghc> {
    private final wlf<b> a;
    private final wlf<t> b;
    private final wlf<qsc> c;
    private final wlf<chc> d;
    private final wlf<d> e;
    private final wlf<j> f;
    private final wlf<tsc> g;
    private final wlf<c> h;

    public hhc(wlf<b> wlf, wlf<t> wlf2, wlf<qsc> wlf3, wlf<chc> wlf4, wlf<d> wlf5, wlf<j> wlf6, wlf<tsc> wlf7, wlf<c> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static hhc a(wlf<b> wlf, wlf<t> wlf2, wlf<qsc> wlf3, wlf<chc> wlf4, wlf<d> wlf5, wlf<j> wlf6, wlf<tsc> wlf7, wlf<c> wlf8) {
        return new hhc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ghc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
