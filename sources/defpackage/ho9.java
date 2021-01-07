package defpackage;

import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import defpackage.go9;
import kotlin.jvm.internal.h;

/* renamed from: ho9  reason: default package */
public final class ho9 implements fjf<aq9> {
    private final wlf<m> a;
    private final wlf<f> b;
    private final wlf<ro9> c;

    public ho9(wlf<m> wlf, wlf<f> wlf2, wlf<ro9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        m mVar = this.a.get();
        f fVar = this.b.get();
        ro9 ro9 = this.c.get();
        go9.a aVar = go9.a;
        h.e(mVar, "followManager");
        h.e(fVar, "rxArtistFollowDataResolver");
        h.e(ro9, "homeFollowDataHolder");
        return new aq9(mVar, fVar, ro9);
    }
}
