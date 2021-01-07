package defpackage;

import com.spotify.superbird.earcon.a;
import io.reactivex.y;

/* renamed from: wh2  reason: default package */
public final class wh2 implements fjf<vh2> {
    private final wlf<y> a;
    private final wlf<a> b;
    private final wlf<zdf> c;

    public wh2(wlf<y> wlf, wlf<a> wlf2, wlf<zdf> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vh2(this.a.get(), this.b.get(), this.c.get());
    }
}
