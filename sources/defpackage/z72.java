package defpackage;

import com.google.android.exoplayer2.offline.n;
import com.spotify.mobile.android.video.offline.c0;
import com.spotify.mobile.android.video.offline.u;
import com.spotify.mobile.android.video.offline.w;
import io.reactivex.y;

/* renamed from: z72  reason: default package */
public final class z72 implements fjf<u> {
    private final wlf<n> a;
    private final wlf<c0> b;
    private final wlf<w> c;
    private final wlf<r82> d;
    private final wlf<y> e;

    public z72(wlf<n> wlf, wlf<c0> wlf2, wlf<w> wlf3, wlf<r82> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
