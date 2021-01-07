package defpackage;

import com.squareup.picasso.Picasso;

/* renamed from: v3d  reason: default package */
public final class v3d implements fjf<u3d> {
    private final wlf<Picasso> a;
    private final wlf<Runnable> b;
    private final wlf<l3d> c;

    public v3d(wlf<Picasso> wlf, wlf<Runnable> wlf2, wlf<l3d> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u3d(this.a, this.b, this.c);
    }
}
