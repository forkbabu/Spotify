package defpackage;

import com.spotify.http.i;
import com.spotify.http.j;
import io.reactivex.y;

/* renamed from: wm0  reason: default package */
public final class wm0 implements fjf<j> {
    private final wlf<i> a;
    private final wlf<y> b;

    public wm0(wlf<i> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
