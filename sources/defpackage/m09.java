package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: m09  reason: default package */
public final class m09 implements fjf<l09> {
    private final wlf<Picasso> a;
    private final wlf<ngc> b;
    private final wlf<etc> c;

    public m09(wlf<Picasso> wlf, wlf<ngc> wlf2, wlf<etc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l09(this.a.get(), this.b.get(), this.c.get());
    }
}
