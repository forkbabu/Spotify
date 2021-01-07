package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: yw6  reason: default package */
public final class yw6 implements fjf<xw6> {
    private final wlf<c> a;
    private final wlf<wt6> b;
    private final wlf<OffliningLogger> c;
    private final wlf<e0> d;
    private final wlf<hy6> e;

    public yw6(wlf<c> wlf, wlf<wt6> wlf2, wlf<OffliningLogger> wlf3, wlf<e0> wlf4, wlf<hy6> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xw6(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
