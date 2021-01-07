package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: doa  reason: default package */
public final class doa implements fjf<coa> {
    private final wlf<Picasso> a;
    private final wlf<Context> b;

    public doa(wlf<Picasso> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new coa(this.a.get(), this.b.get());
    }
}
