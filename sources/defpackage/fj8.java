package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: fj8  reason: default package */
public final class fj8 implements fjf<ej8> {
    private final wlf<th8> a;
    private final wlf<Picasso> b;

    public fj8(wlf<th8> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ej8(this.a.get(), this.b.get());
    }
}
