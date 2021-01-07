package defpackage;

import com.spotify.glue.dialogs.g;
import com.squareup.picasso.Picasso;
import io.reactivex.y;

/* renamed from: bv6  reason: default package */
public final class bv6 implements fjf<av6> {
    private final wlf<Picasso> a;
    private final wlf<wt6> b;
    private final wlf<y> c;
    private final wlf<ry6> d;
    private final wlf<oy6> e;
    private final wlf<g> f;

    public bv6(wlf<Picasso> wlf, wlf<wt6> wlf2, wlf<y> wlf3, wlf<ry6> wlf4, wlf<oy6> wlf5, wlf<g> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new av6(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
