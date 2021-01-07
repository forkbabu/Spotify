package defpackage;

import com.spotify.music.lyrics.core.experience.model.b;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: bdb  reason: default package */
public final class bdb implements fjf<xcb> {
    private final wlf<tcb> a;
    private final wlf<g<ContextTrack>> b;
    private final wlf<xn1<b>> c;

    public bdb(wlf<tcb> wlf, wlf<g<ContextTrack>> wlf2, wlf<xn1<b>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xcb(this.a.get(), this.b.get(), this.c.get());
    }
}
