package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

/* renamed from: pgc  reason: default package */
public final class pgc implements fjf<ogc> {
    private final wlf<b4<msc>> a;
    private final wlf<Boolean> b;
    private final wlf<Boolean> c;
    private final wlf<htc> d;
    private final wlf<etc> e;
    private final wlf<jtc> f;
    private final wlf<igc> g;
    private final wlf<c> h;
    private final wlf<j42> i;

    public pgc(wlf<b4<msc>> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<htc> wlf4, wlf<etc> wlf5, wlf<jtc> wlf6, wlf<igc> wlf7, wlf<c> wlf8, wlf<j42> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    public static pgc a(wlf<b4<msc>> wlf, wlf<Boolean> wlf2, wlf<Boolean> wlf3, wlf<htc> wlf4, wlf<etc> wlf5, wlf<jtc> wlf6, wlf<igc> wlf7, wlf<c> wlf8, wlf<j42> wlf9) {
        return new pgc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ogc(this.a.get(), this.b.get().booleanValue(), this.c.get().booleanValue(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
