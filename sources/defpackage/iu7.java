package defpackage;

import com.spotify.http.u;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: iu7  reason: default package */
public final class iu7 implements fjf<hu7> {
    private final wlf<y> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<bqa> d;
    private final wlf<g<SessionState>> e;
    private final wlf<u> f;

    public iu7(wlf<y> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<bqa> wlf4, wlf<g<SessionState>> wlf5, wlf<u> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hu7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
