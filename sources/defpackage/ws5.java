package defpackage;

import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.music.nowplaying.core.navcontext.h;
import io.reactivex.g;

/* renamed from: ws5  reason: default package */
public final class ws5 implements fjf<g<f>> {
    private final wlf<h> a;

    public ws5(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        h hVar = this.a.get();
        kotlin.jvm.internal.h.e(hVar, "navigationContextFlowable");
        g<f> r0 = hVar.a().V(1).r0();
        kotlin.jvm.internal.h.d(r0, "navigationContextFlowabl…et().replay(1).refCount()");
        return r0;
    }
}
