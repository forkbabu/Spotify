package defpackage;

import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: n27  reason: default package */
public final class n27 implements fjf<m27> {
    private final wlf<i61> a;
    private final wlf<j27> b;
    private final wlf<m> c;

    public n27(wlf<i61> wlf, wlf<j27> wlf2, wlf<m> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m27(this.a.get(), this.b.get(), this.c.get());
    }
}
