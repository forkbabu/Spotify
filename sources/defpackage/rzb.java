package defpackage;

import com.spotify.music.nowplaying.common.view.logging.a;
import com.spotify.music.nowplaying.common.view.logging.c;

/* renamed from: rzb  reason: default package */
public final class rzb implements fjf<qzb> {
    private final wlf<c> a;
    private final wlf<ozb> b;
    private final wlf<a> c;

    public rzb(wlf<c> wlf, wlf<ozb> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qzb(this.a.get(), this.b.get(), this.c.get());
    }
}
