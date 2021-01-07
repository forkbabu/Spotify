package defpackage;

import android.content.Context;
import com.spotify.music.navigation.t;

/* renamed from: n36  reason: default package */
public final class n36 implements fjf<m36> {
    private final wlf<Context> a;
    private final wlf<h36> b;
    private final wlf<t> c;
    private final wlf<e36> d;

    public n36(wlf<Context> wlf, wlf<h36> wlf2, wlf<t> wlf3, wlf<e36> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m36(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
