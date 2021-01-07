package defpackage;

import com.spotify.android.glue.patterns.prettylist.u;
import com.squareup.picasso.Picasso;

/* renamed from: i74  reason: default package */
public final class i74 implements fjf<h74> {
    private final wlf<Picasso> a;
    private final wlf<u> b;
    private final wlf<Boolean> c;

    public i74(wlf<Picasso> wlf, wlf<u> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h74(this.a.get(), this.b, this.c.get().booleanValue());
    }
}
