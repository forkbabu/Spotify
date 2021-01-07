package com.spotify.music.newplaying.scroll;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import com.spotify.music.newplaying.scroll.view.j;
import com.spotify.nowplaying.core.immersive.ImmersiveMode;
import com.spotify.nowplaying.core.immersive.c;
import com.spotify.nowplaying.ui.components.overlay.OverlayHidingFrameLayout;
import com.spotify.nowplaying.ui.components.overlay.k;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class e {
    private nmb a;
    private imb b;
    private final omb c;
    private final c d;
    private final c e;
    private final g f;
    private final jmb g;

    public e(omb omb, c cVar, c cVar2, g gVar, jmb jmb) {
        h.e(omb, "scrollOverlayControllerFactory");
        h.e(cVar, "immersiveController");
        h.e(cVar2, "scrollToTopController");
        h.e(gVar, "tapToScrollController");
        h.e(jmb, "scrollInteractionLogControllerFactory");
        this.c = omb;
        this.d = cVar;
        this.e = cVar2;
        this.f = gVar;
        this.g = jmb;
    }

    public final void a(k kVar, j jVar) {
        h.e(kVar, "overlayHidingViewBinder");
        h.e(jVar, "peekScrollViewBinder");
        g<Boolean> t = ((OverlayHidingFrameLayout) kVar).t();
        PeekScrollView peekScrollView = (PeekScrollView) jVar;
        g<Boolean> d2 = peekScrollView.d();
        g<ImmersiveMode> s = g.i(t, d2, bmb.a).s();
        this.a = this.c.b(d2);
        this.b = this.g.b(peekScrollView.g());
        this.e.a(jVar);
        this.f.a(jVar);
        nmb nmb = this.a;
        if (nmb != null) {
            nmb.a(kVar);
        }
        imb imb = this.b;
        if (imb != null) {
            imb.c();
        }
        this.d.b(s);
    }

    public final void b() {
        this.e.b();
        this.f.b();
        nmb nmb = this.a;
        if (nmb != null) {
            nmb.b();
        }
        imb imb = this.b;
        if (imb != null) {
            imb.d();
        }
        this.d.c();
    }
}
