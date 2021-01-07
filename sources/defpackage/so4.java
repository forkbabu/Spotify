package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.s;

/* renamed from: so4  reason: default package */
public final class so4 implements fjf<ro4> {
    private final wlf<s<ConnectManager>> a;
    private final wlf<p> b;
    private final wlf<cs0> c;

    public so4(wlf<s<ConnectManager>> wlf, wlf<p> wlf2, wlf<cs0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ro4(this.a.get(), this.b.get(), this.c.get());
    }
}
