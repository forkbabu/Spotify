package defpackage;

import com.spotify.android.flags.c;
import com.spotify.music.nowplaying.common.view.contextmenu.o;
import io.reactivex.g;

/* renamed from: u4c  reason: default package */
public final class u4c implements fjf<g<o>> {
    private final wlf<fm9> a;
    private final wlf<c> b;

    public u4c(wlf<fm9> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean z = !this.a.get().a(this.b.get());
        o.b.a a2 = o.b.a();
        a2.c(false);
        a2.d(true);
        a2.e(false);
        a2.g(true);
        a2.b(z);
        a2.f(z);
        o.b a3 = a2.a();
        o.a a4 = o.a();
        a4.b(a3);
        return g.N(a4.a());
    }
}
