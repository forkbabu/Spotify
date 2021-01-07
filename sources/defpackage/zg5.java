package defpackage;

import com.spotify.playlist.endpoints.p;
import io.reactivex.y;

/* renamed from: zg5  reason: default package */
public final class zg5 implements fjf<yg5> {
    private final wlf<p> a;
    private final wlf<y> b;

    public zg5(wlf<p> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yg5(this.a.get(), this.b.get());
    }
}
