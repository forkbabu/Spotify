package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: kmc  reason: default package */
public final class kmc implements fjf<jmc> {
    private final wlf<Picasso> a;
    private final wlf<w50> b;

    public kmc(wlf<Picasso> wlf, wlf<w50> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jmc(this.a.get(), this.b.get());
    }
}
