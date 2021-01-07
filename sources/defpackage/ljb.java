package defpackage;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.marquee.g;

/* renamed from: ljb  reason: default package */
public class ljb implements ahb {
    private final g a;

    public ljb(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.ahb
    public void a() {
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // defpackage.ahb
    public void e() {
        Logger.b("[MarqueeBackgroundStatePlugin] onUIHidden()", new Object[0]);
        this.a.b();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}
