package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: hsc  reason: default package */
public final class hsc implements fjf<gsc> {
    private final wlf<Picasso> a;
    private final wlf<zrc> b;
    private final wlf<isc> c;

    public hsc(wlf<Picasso> wlf, wlf<zrc> wlf2, wlf<isc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gsc(this.a.get(), this.b.get(), this.c.get());
    }
}
