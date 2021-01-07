package defpackage;

import com.spotify.mobile.android.skiplimitpivot.view.a;

/* renamed from: wo1  reason: default package */
public final class wo1 implements fjf<vo1> {
    private final wlf<a> a;
    private final wlf<hp1> b;

    public wo1(wlf<a> wlf, wlf<hp1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vo1(this.a.get(), this.b.get());
    }
}
