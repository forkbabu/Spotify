package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: mgc  reason: default package */
public final class mgc implements fjf<lgc> {
    private final wlf<Picasso> a;
    private final wlf<ngc> b;

    public mgc(wlf<Picasso> wlf, wlf<ngc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lgc(this.a.get(), this.b.get());
    }
}
