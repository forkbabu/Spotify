package defpackage;

import com.spotify.music.connection.l;

/* renamed from: yy3  reason: default package */
public final class yy3 implements fjf<xy3> {
    private final wlf<l> a;
    private final wlf<q9a> b;
    private final wlf<String> c;
    private final wlf<ey3> d;

    public yy3(wlf<l> wlf, wlf<q9a> wlf2, wlf<String> wlf3, wlf<ey3> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xy3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
