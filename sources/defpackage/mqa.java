package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: mqa  reason: default package */
public final class mqa implements fjf<lqa> {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<jqa> c;

    public mqa(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<jqa> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lqa(this.a.get(), this.b.get(), this.c.get());
    }
}
