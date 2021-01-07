package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.video.endvideo.i;
import com.spotify.mobile.android.video.endvideo.m;
import io.reactivex.y;

/* renamed from: yv8  reason: default package */
public final class yv8 implements fjf<m> {
    private final wlf<gl0<u>> a;
    private final wlf<i> b;
    private final wlf<cqe> c;
    private final wlf<y> d;
    private final wlf<wv8> e;
    private final wlf<uv8> f;
    private final wlf<com.spotify.mobile.android.util.connectivity.y> g;

    public yv8(wlf<gl0<u>> wlf, wlf<i> wlf2, wlf<cqe> wlf3, wlf<y> wlf4, wlf<wv8> wlf5, wlf<uv8> wlf6, wlf<com.spotify.mobile.android.util.connectivity.y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
