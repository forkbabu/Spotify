package defpackage;

import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import com.spotify.nowplaying.ui.components.overlay.k;
import com.spotify.rxjava2.q;
import io.reactivex.g;

/* renamed from: wrb  reason: default package */
public class wrb {
    private final g<OverlayDisplayMode> a;
    private final g<String> b;
    private final esb c;
    private final esb d;
    private final q e = new q();
    private k f;

    public wrb(g<j> gVar, g<String> gVar2, wlf<esb> wlf) {
        this.a = gVar.O(vrb.a);
        this.b = gVar2;
        this.c = wlf.get();
        this.d = wlf.get();
    }

    public static void a(wrb wrb, OverlayDisplayMode overlayDisplayMode) {
        wrb.getClass();
        int ordinal = overlayDisplayMode.ordinal();
        if (ordinal == 0) {
            wrb.f.setHidingEnabled(true);
            wrb.f.setAutoHide(true);
            wrb.f.a(true);
        } else if (ordinal == 1) {
            wrb.f.setHidingEnabled(false);
            wrb.f.a(true);
        } else if (ordinal == 2) {
            wrb.f.setHidingEnabled(true);
            wrb.f.setAutoHide(false);
            if (!wrb.d.a()) {
                wrb.f.a(true);
            }
        } else {
            throw new IllegalArgumentException("Invalid display mode: " + overlayDisplayMode);
        }
    }

    public void b(String str) {
        if (!this.c.a()) {
            this.f.a(true);
        }
    }

    public void c(k kVar) {
        kVar.getClass();
        this.f = kVar;
        this.e.a(this.a.subscribe(new trb(this)));
        this.e.a(this.b.subscribe(new urb(this)));
    }

    public void d() {
        this.e.c();
    }
}
