package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: fhb  reason: default package */
public final class fhb implements fjf<ehb> {
    private final wlf<Picasso> a;

    public fhb(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ehb(this.a.get());
    }
}
