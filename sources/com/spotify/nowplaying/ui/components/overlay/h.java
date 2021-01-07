package com.spotify.nowplaying.ui.components.overlay;

import com.spotify.music.C0707R;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class h {
    private final g<Boolean> a;
    private final p b = new p();
    private k c;

    public h(g<j> gVar) {
        this.a = gVar.O(e.a);
    }

    public static void a(h hVar, Boolean bool) {
        hVar.getClass();
        if (bool.booleanValue()) {
            hVar.c.setOverlayBackground(C0707R.drawable.nowplaying_overlay_gradient);
        } else {
            hVar.c.b();
        }
    }

    public void b(k kVar) {
        kVar.getClass();
        this.c = kVar;
        this.b.b(this.a.subscribe(new c(this)));
    }

    public void c() {
        this.b.a();
    }
}
