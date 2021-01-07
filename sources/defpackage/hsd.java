package defpackage;

import com.spotify.packagevalidator.denylist.cache.db.b;
import io.reactivex.y;

/* renamed from: hsd  reason: default package */
public final class hsd implements fjf<gsd> {
    private final wlf<b> a;
    private final wlf<y> b;
    private final wlf<cqe> c;

    public hsd(wlf<b> wlf, wlf<y> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gsd(this.a.get(), this.b.get(), this.c.get());
    }
}
