package defpackage;

import com.spotify.playlist.endpoints.i;

/* renamed from: xr6  reason: default package */
public final class xr6 implements fjf<wr6> {
    private final wlf<cqe> a;
    private final wlf<i> b;

    public xr6(wlf<cqe> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wr6(this.a.get(), this.b.get());
    }
}
