package defpackage;

import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;

/* renamed from: jy6  reason: default package */
public final class jy6 implements fjf<iy6> {
    private final wlf<String> a;
    private final wlf<v> b;
    private final wlf<i> c;
    private final wlf<m8c> d;

    public jy6(wlf<String> wlf, wlf<v> wlf2, wlf<i> wlf3, wlf<m8c> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iy6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
