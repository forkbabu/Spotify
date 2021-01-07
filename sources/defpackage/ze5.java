package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.x6;
import io.reactivex.y;

/* renamed from: ze5  reason: default package */
public final class ze5 implements fjf<ye5> {
    private final wlf<Context> a;
    private final wlf<y> b;
    private final wlf<y> c;
    private final wlf<x6> d;
    private final wlf<se5> e;

    public ze5(wlf<Context> wlf, wlf<y> wlf2, wlf<y> wlf3, wlf<x6> wlf4, wlf<se5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ye5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
