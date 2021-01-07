package defpackage;

import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: hd7  reason: default package */
public final class hd7 implements fjf<gd7> {
    private final wlf<i61> a;
    private final wlf<m> b;
    private final wlf<ad7> c;

    public hd7(wlf<i61> wlf, wlf<m> wlf2, wlf<ad7> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gd7(this.a.get(), this.b.get(), this.c.get());
    }
}
