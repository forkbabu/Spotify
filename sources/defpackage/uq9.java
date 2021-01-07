package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: uq9  reason: default package */
public final class uq9 implements fjf<tq9> {
    private final wlf<Picasso> a;

    public uq9(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tq9(this.a.get());
    }
}
