package defpackage;

import com.spotify.http.v;
import com.spotify.music.json.g;
import retrofit2.w;

/* renamed from: ao5  reason: default package */
public final class ao5 implements fjf<w> {
    private final wlf<com.spotify.http.w> a;
    private final wlf<g> b;

    public ao5(wlf<com.spotify.http.w> wlf, wlf<g> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return v.a(this.a.get().a(), this.b.get());
    }
}
