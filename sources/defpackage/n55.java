package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.freetierartist.datasource.p;

/* renamed from: n55  reason: default package */
public final class n55 implements fjf<p> {
    private final wlf<u> a;

    public n55(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        p pVar = (p) this.a.get().c(p.class);
        yif.g(pVar, "Cannot return null from a non-@Nullable @Provides method");
        return pVar;
    }
}
