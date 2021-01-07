package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ae6  reason: default package */
public final class ae6 implements fjf<zd6> {
    private final wlf<Picasso> a;
    private final wlf<me6> b;
    private final wlf<String> c;

    public ae6(wlf<Picasso> wlf, wlf<me6> wlf2, wlf<String> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zd6(this.a, this.b, this.c);
    }
}
