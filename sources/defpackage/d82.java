package defpackage;

import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.t;
import com.spotify.mobile.android.video.offline.u;
import com.spotify.mobile.android.video.offline.y;

/* renamed from: d82  reason: default package */
public final class d82 implements fjf<BetamaxOfflineManager> {
    private final wlf<u> a;
    private final wlf<t> b;
    private final wlf<r82> c;

    public d82(wlf<u> wlf, wlf<t> wlf2, wlf<r82> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new y(this.a.get(), this.b.get(), this.c.get());
    }
}
