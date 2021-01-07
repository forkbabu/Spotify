package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.s;

/* renamed from: ur4  reason: default package */
public final class ur4 implements fjf<tr4> {
    private final wlf<s<ConnectManager>> a;
    private final wlf<p> b;
    private final wlf<cs0> c;

    public ur4(wlf<s<ConnectManager>> wlf, wlf<p> wlf2, wlf<cs0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tr4(this.a.get(), this.b.get(), this.c.get());
    }
}
