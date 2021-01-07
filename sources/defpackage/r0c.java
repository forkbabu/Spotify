package defpackage;

import com.spotify.music.navigation.t;
import com.spotify.music.nowplaying.common.view.header.c;
import kotlin.jvm.internal.h;

/* renamed from: r0c  reason: default package */
public final class r0c implements fjf<c> {
    private final wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.header.c> a;
    private final wlf<t> b;
    private final wlf<erd> c;
    private final wlf<asb> d;

    public r0c(wlf<com.spotify.music.nowplaying.podcast.mixedmedia.ui.header.c> wlf, wlf<t> wlf2, wlf<erd> wlf3, wlf<asb> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        com.spotify.music.nowplaying.podcast.mixedmedia.ui.header.c cVar = this.a.get();
        t tVar = this.b.get();
        erd erd = this.c.get();
        asb asb = this.d.get();
        h.e(cVar, "navigationContextFlowable");
        h.e(tVar, "navigator");
        h.e(erd, "logger");
        h.e(asb, "resourceBundle");
        return new c(cVar.a(), tVar, erd, asb);
    }
}
