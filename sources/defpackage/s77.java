package defpackage;

import com.spotify.http.u;
import com.spotify.music.features.podcast.episode.datasource.w;

/* renamed from: s77  reason: default package */
public final class s77 implements fjf<w> {
    private final wlf<u> a;

    public s77(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        w wVar = (w) this.a.get().c(w.class);
        yif.g(wVar, "Cannot return null from a non-@Nullable @Provides method");
        return wVar;
    }
}
