package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: ou3  reason: default package */
public final class ou3 implements fjf<nu3> {
    private final wlf<Picasso> a;
    private final wlf<Integer> b;

    public ou3(wlf<Picasso> wlf, wlf<Integer> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nu3(this.a.get(), this.b.get().intValue());
    }
}
