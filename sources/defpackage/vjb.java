package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: vjb  reason: default package */
public final class vjb implements fjf<ujb> {
    private final wlf<Picasso> a;
    private final wlf<qjb> b;

    public vjb(wlf<Picasso> wlf, wlf<qjb> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ujb(ejf.a(this.a), this.b.get());
    }
}
