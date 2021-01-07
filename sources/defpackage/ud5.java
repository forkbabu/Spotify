package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.x6;
import io.reactivex.y;

/* renamed from: ud5  reason: default package */
public final class ud5 implements fjf<td5> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<yk8> c;
    private final wlf<x6> d;

    public ud5(wlf<Context> wlf, wlf<y> wlf2, wlf<yk8> wlf3, wlf<x6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new td5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
