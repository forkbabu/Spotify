package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.l;

/* renamed from: az3  reason: default package */
public final class az3 implements fjf<zy3> {
    private final wlf<String> a;
    private final wlf<w> b;
    private final wlf<l> c;
    private final wlf<vwc> d;
    private final wlf<ly3> e;

    public az3(wlf<String> wlf, wlf<w> wlf2, wlf<l> wlf3, wlf<vwc> wlf4, wlf<ly3> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zy3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
