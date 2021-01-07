package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: nhb  reason: default package */
public final class nhb implements fjf<jhb> {
    private final wlf<Boolean> a;
    private final wlf<hhb> b;
    private final wlf<Picasso> c;
    private final wlf<jzc> d;
    private final wlf<mhb> e;

    public nhb(wlf<Boolean> wlf, wlf<hhb> wlf2, wlf<Picasso> wlf3, wlf<jzc> wlf4, wlf<mhb> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jhb(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
