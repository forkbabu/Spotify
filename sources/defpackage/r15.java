package defpackage;

import com.spotify.music.features.followfeed.a;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import kotlin.jvm.internal.h;

/* renamed from: r15  reason: default package */
public final class r15 implements fjf<a> {
    private final wlf<m> a;
    private final wlf<f> b;

    public r15(wlf<m> wlf, wlf<f> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        m mVar = this.a.get();
        f fVar = this.b.get();
        h.e(mVar, "followManager");
        h.e(fVar, "rxArtistFollowDataResolver");
        return new a(mVar, fVar);
    }
}
