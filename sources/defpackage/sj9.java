package defpackage;

import com.spotify.http.u;

/* renamed from: sj9  reason: default package */
public final class sj9 implements fjf<rj9> {
    private final wlf<u> a;

    public sj9(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rj9(this.a.get());
    }
}
