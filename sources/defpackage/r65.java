package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: r65  reason: default package */
public final class r65 implements fjf<q65> {
    private final wlf<Picasso> a;

    public r65(wlf<Picasso> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q65(this.a.get());
    }
}
