package defpackage;

import com.spotify.music.features.followfeed.network.a;
import com.spotify.music.features.followfeed.network.b;
import kotlin.jvm.internal.h;

/* renamed from: d35  reason: default package */
public final class d35 implements fjf<a> {
    private final wlf<f35> a;

    public d35(wlf<f35> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f35 f35 = this.a.get();
        h.e(f35, "followFeedV1Endpoint");
        return new b(f35);
    }
}
