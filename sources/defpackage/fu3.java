package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: fu3  reason: default package */
public final class fu3 implements fjf<eu3> {
    private final wlf<qt3> a;
    private final wlf<pt3> b;
    private final wlf<Picasso> c;

    public fu3(wlf<qt3> wlf, wlf<pt3> wlf2, wlf<Picasso> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new eu3(this.a.get(), this.b.get(), this.c.get());
    }
}
