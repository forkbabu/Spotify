package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: gnd  reason: default package */
public final class gnd implements fjf<fnd> {
    private final wlf<Picasso> a;
    private final wlf<i1d> b;

    public gnd(wlf<Picasso> wlf, wlf<i1d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fnd(this.a.get(), this.b.get());
    }
}
