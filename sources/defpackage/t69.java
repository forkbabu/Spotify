package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.a;

/* renamed from: t69  reason: default package */
public final class t69 implements fjf<a> {
    private final wlf<u> a;

    public t69(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = (a) this.a.get().c(a.class);
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
