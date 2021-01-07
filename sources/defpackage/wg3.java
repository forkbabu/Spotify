package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: wg3  reason: default package */
public final class wg3 implements fjf<vg3> {
    private final wlf<t> a;
    private final wlf<xg3> b;
    private final wlf<tg3> c;

    public wg3(wlf<t> wlf, wlf<xg3> wlf2, wlf<tg3> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static vg3 a(t tVar, Object obj, Object obj2) {
        return new vg3(tVar, (xg3) obj, (tg3) obj2);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get());
    }
}
