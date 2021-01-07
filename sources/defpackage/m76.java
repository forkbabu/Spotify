package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.playlistentity.q;

/* renamed from: m76  reason: default package */
public final class m76 implements fjf<q> {
    private final wlf<u> a;

    public m76(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        q qVar = (q) this.a.get().c(q.class);
        yif.g(qVar, "Cannot return null from a non-@Nullable @Provides method");
        return qVar;
    }
}
