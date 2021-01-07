package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: bna  reason: default package */
public final class bna implements fjf<ana> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;

    public bna(wlf<Context> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ana(this.a.get(), this.b.get());
    }
}
