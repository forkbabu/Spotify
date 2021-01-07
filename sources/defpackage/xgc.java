package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: xgc  reason: default package */
public final class xgc implements fjf<wgc> {
    private final wlf<Picasso> a;
    private final wlf<ygc> b;

    public xgc(wlf<Picasso> wlf, wlf<ygc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wgc(this.a.get(), this.b.get());
    }
}
