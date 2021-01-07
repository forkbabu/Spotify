package defpackage;

import com.spotify.http.u;
import com.spotify.music.track.share.impl.video.service.a;

/* renamed from: cod  reason: default package */
public final class cod implements fjf<a> {
    private final wlf<u> a;

    public cod(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = (a) this.a.get().c(a.class);
        yif.g(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
