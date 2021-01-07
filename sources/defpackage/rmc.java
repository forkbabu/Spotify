package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: rmc  reason: default package */
public final class rmc implements fjf<qmc> {
    private final wlf<Picasso> a;
    private final wlf<cmc> b;
    private final wlf<w50> c;

    public rmc(wlf<Picasso> wlf, wlf<cmc> wlf2, wlf<w50> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qmc(this.a.get(), this.b.get(), this.c.get());
    }
}
