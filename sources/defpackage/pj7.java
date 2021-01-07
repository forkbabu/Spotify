package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: pj7  reason: default package */
public final class pj7 implements fjf<oj7> {
    private final wlf<Picasso> a;
    private final wlf<uj7> b;
    private final wlf<ij7> c;

    public pj7(wlf<Picasso> wlf, wlf<uj7> wlf2, wlf<ij7> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new oj7(this.a.get(), this.b.get(), this.c.get());
    }
}
