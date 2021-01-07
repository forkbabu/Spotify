package defpackage;

import com.spotify.mobile.android.recentlyplayed.a;

/* renamed from: vi2  reason: default package */
public final class vi2 implements fjf<a> {
    private final wlf<fb1> a;
    private final wlf<lbb> b;
    private final wlf<Integer> c;

    public vi2(wlf<fb1> wlf, wlf<lbb> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a(this.a.get(), this.c.get().intValue(), true, true, true, true, this.b.get().d());
    }
}
