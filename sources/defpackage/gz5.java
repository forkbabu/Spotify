package defpackage;

import com.spotify.music.feedback.b;
import defpackage.qy5;

/* renamed from: gz5  reason: default package */
public final class gz5 implements fjf<fz5> {
    private final wlf<bz5> a;
    private final wlf<qy5.a> b;
    private final wlf<xz5> c;
    private final wlf<b> d;

    public gz5(wlf<bz5> wlf, wlf<qy5.a> wlf2, wlf<xz5> wlf3, wlf<b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fz5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
