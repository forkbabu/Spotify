package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: ed6  reason: default package */
public final class ed6 implements fjf<dd6> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<gd6> c;
    private final wlf<ad6> d;

    public ed6(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<gd6> wlf3, wlf<ad6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dd6(this.a, this.b, this.c, this.d);
    }
}
