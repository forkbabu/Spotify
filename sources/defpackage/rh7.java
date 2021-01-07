package defpackage;

import com.spotify.mobile.android.quotesharing.e;
import com.squareup.picasso.Picasso;

/* renamed from: rh7  reason: default package */
public final class rh7 implements fjf<qh7> {
    private final wlf<Picasso> a;
    private final wlf<e> b;
    private final wlf<cb1> c;

    public rh7(wlf<Picasso> wlf, wlf<e> wlf2, wlf<cb1> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qh7(this.a.get(), this.b.get(), this.c.get());
    }
}
