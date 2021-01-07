package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: xmc  reason: default package */
public final class xmc implements fjf<wmc> {
    private final wlf<Picasso> a;
    private final wlf<w50> b;

    public xmc(wlf<Picasso> wlf, wlf<w50> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wmc(this.a.get(), this.b.get());
    }
}
