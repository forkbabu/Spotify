package defpackage;

import com.spotify.libs.connect.j;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.y;

/* renamed from: oq4  reason: default package */
public final class oq4 implements fjf<nq4> {
    private final wlf<j> a;
    private final wlf<cs0> b;
    private final wlf<p> c;
    private final wlf<zca> d;
    private final wlf<y> e;

    public oq4(wlf<j> wlf, wlf<cs0> wlf2, wlf<p> wlf3, wlf<zca> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nq4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
