package defpackage;

import com.spotify.mobile.android.util.t;

/* renamed from: ji1  reason: default package */
public final class ji1 implements fjf<ii1> {
    private final wlf<cqe> a;
    private final wlf<t> b;

    public ji1(wlf<cqe> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ii1(this.a.get(), this.b.get());
    }
}
