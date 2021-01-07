package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: bj2  reason: default package */
public final class bj2 implements fjf<aj2> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;

    public bj2(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aj2(this.a, this.b);
    }
}
