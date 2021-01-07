package defpackage;

import com.spotify.music.nowplaying.common.view.logging.a;
import com.spotify.music.nowplaying.common.view.logging.c;

/* renamed from: nwb  reason: default package */
public final class nwb implements fjf<mwb> {
    private final wlf<c> a;
    private final wlf<a> b;
    private final wlf<ere> c;
    private final wlf<com.spotify.instrumentation.a> d;
    private final wlf<com.spotify.music.libs.viewuri.c> e;

    public nwb(wlf<c> wlf, wlf<a> wlf2, wlf<ere> wlf3, wlf<com.spotify.instrumentation.a> wlf4, wlf<com.spotify.music.libs.viewuri.c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mwb(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
