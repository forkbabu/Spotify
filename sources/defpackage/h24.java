package defpackage;

import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: h24  reason: default package */
public final class h24 implements fjf<g24> {
    private final wlf<m> a;
    private final wlf<AssistedCurationSearchLogger> b;
    private final wlf<c8b> c;

    public h24(wlf<m> wlf, wlf<AssistedCurationSearchLogger> wlf2, wlf<c8b> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g24(this.a.get(), this.b.get(), this.c.get());
    }
}
