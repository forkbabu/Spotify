package defpackage;

import com.spotify.music.features.followfeed.persistence.a;
import com.spotify.music.features.followfeed.persistence.b;
import com.spotify.music.features.followfeed.persistence.d;
import kotlin.jvm.internal.h;

/* renamed from: v35  reason: default package */
public final class v35 implements fjf<a> {
    private final wlf<d> a;

    public v35(wlf<d> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a.get();
        h.e(dVar, "followFeedCache");
        return new b(dVar);
    }
}
