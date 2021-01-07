package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.container.h0;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: amb  reason: default package */
public final class amb implements fjf<g<ImmutableList<NowPlayingWidget>>> {
    private final wlf<h0> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public amb(wlf<h0> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        h0 h0Var = this.a.get();
        y yVar = this.b.get();
        y yVar2 = this.c.get();
        h.e(h0Var, "widgetsProvider");
        h.e(yVar, "computationThread");
        h.e(yVar2, "mainThread");
        g<ImmutableList<NowPlayingWidget>> r0 = h0Var.e().e0(yVar).Q(yVar2).V(1).r0();
        h.d(r0, "widgetsProvider\n        …ay(1)\n        .refCount()");
        return r0;
    }
}
