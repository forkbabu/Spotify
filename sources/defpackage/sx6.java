package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: sx6  reason: default package */
public final class sx6 implements fjf<rx6> {
    private final wlf<c> a;
    private final wlf<wt6> b;
    private final wlf<e0> c;
    private final wlf<ky6> d;

    public sx6(wlf<c> wlf, wlf<wt6> wlf2, wlf<e0> wlf3, wlf<ky6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rx6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
