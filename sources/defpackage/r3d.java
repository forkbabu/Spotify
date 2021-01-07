package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: r3d  reason: default package */
public final class r3d implements fjf<q3d> {
    private final wlf<Picasso> a;
    private final wlf<Runnable> b;

    public r3d(wlf<Picasso> wlf, wlf<Runnable> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q3d(this.a, this.b);
    }
}
