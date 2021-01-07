package defpackage;

import android.content.Context;
import com.spotify.music.nowplaying.core.navcontext.j;
import defpackage.qy5;

/* renamed from: cz5  reason: default package */
public final class cz5 implements fjf<bz5> {
    private final wlf<wx5> a;
    private final wlf<qy5.a> b;
    private final wlf<j> c;
    private final wlf<Context> d;

    public cz5(wlf<wx5> wlf, wlf<qy5.a> wlf2, wlf<j> wlf3, wlf<Context> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bz5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
