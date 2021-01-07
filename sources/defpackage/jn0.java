package defpackage;

import com.spotify.http.u;
import com.spotify.http.v;
import com.spotify.http.w;
import com.spotify.music.json.g;

/* renamed from: jn0  reason: default package */
public final class jn0 implements fjf<u> {
    private final wlf<w> a;
    private final wlf<g> b;

    public jn0(wlf<w> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(v.a(this.a.get().a(), this.b.get()), um0.a);
    }
}
