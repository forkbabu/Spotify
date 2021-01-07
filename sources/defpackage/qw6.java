package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.libs.viewuri.c;

/* renamed from: qw6  reason: default package */
public final class qw6 implements fjf<pw6> {
    private final wlf<c> a;
    private final wlf<wt6> b;
    private final wlf<e0> c;

    public qw6(wlf<c> wlf, wlf<wt6> wlf2, wlf<e0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pw6(this.a.get(), this.b.get(), this.c.get());
    }
}
