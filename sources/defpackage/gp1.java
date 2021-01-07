package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: gp1  reason: default package */
public final class gp1 implements fjf<fp1> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;

    public gp1(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fp1(this.a.get(), this.b.get());
    }
}
