package defpackage;

import com.spotify.mobile.android.recentlyplayed.a;

/* renamed from: wj5  reason: default package */
public final class wj5 implements fjf<a> {
    private final wlf<fb1> a;
    private final wlf<lbb> b;
    private final wlf<Boolean> c;

    public wj5(wlf<fb1> wlf, wlf<lbb> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean z = !this.c.get().booleanValue();
        return new a(this.a.get(), 12, true, z, z, true, this.b.get().d());
    }
}
