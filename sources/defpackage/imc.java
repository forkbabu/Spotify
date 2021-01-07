package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: imc  reason: default package */
public final class imc implements fjf<hmc> {
    private final wlf<Picasso> a;
    private final wlf<w50> b;

    public imc(wlf<Picasso> wlf, wlf<w50> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hmc(this.a.get(), this.b.get());
    }
}
