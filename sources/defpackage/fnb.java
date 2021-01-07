package defpackage;

import com.spotify.music.lyrics.core.experience.model.b;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: fnb  reason: default package */
public final class fnb implements fjf<enb> {
    private final wlf<g<Long>> a;
    private final wlf<s<uqd>> b;
    private final wlf<y> c;
    private final wlf<s<b>> d;
    private final wlf<zmb> e;
    private final wlf<udb> f;
    private final wlf<edb> g;
    private final wlf<com.spotify.music.lyrics.share.common.sharebutton.b> h;

    public fnb(wlf<g<Long>> wlf, wlf<s<uqd>> wlf2, wlf<y> wlf3, wlf<s<b>> wlf4, wlf<zmb> wlf5, wlf<udb> wlf6, wlf<edb> wlf7, wlf<com.spotify.music.lyrics.share.common.sharebutton.b> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    public static fnb a(wlf<g<Long>> wlf, wlf<s<uqd>> wlf2, wlf<y> wlf3, wlf<s<b>> wlf4, wlf<zmb> wlf5, wlf<udb> wlf6, wlf<edb> wlf7, wlf<com.spotify.music.lyrics.share.common.sharebutton.b> wlf8) {
        return new fnb(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new enb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
