package defpackage;

import com.spotify.mobile.android.quotesharing.e;
import com.squareup.picasso.Picasso;

/* renamed from: gic  reason: default package */
public final class gic implements fjf<fic> {
    private final wlf<Picasso> a;
    private final wlf<jic> b;
    private final wlf<e> c;
    private final wlf<cic> d;
    private final wlf<cb1> e;

    public gic(wlf<Picasso> wlf, wlf<jic> wlf2, wlf<e> wlf3, wlf<cic> wlf4, wlf<cb1> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fic(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
