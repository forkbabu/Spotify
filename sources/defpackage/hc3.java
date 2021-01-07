package defpackage;

import com.squareup.picasso.l;

/* renamed from: hc3  reason: default package */
public final class hc3 implements fjf<mwd> {
    private final wlf<lwd> a;
    private final wlf<l> b;

    public hc3(wlf<lwd> wlf, wlf<l> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mwd(this.a.get(), this.b.get());
    }
}
