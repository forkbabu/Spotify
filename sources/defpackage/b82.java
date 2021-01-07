package defpackage;

import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.offline.j0;
import com.spotify.mobile.android.video.offline.w;
import com.spotify.mobile.android.video.offline.x;
import io.reactivex.z;
import java.util.List;

/* renamed from: b82  reason: default package */
public final class b82 implements fjf<w> {
    private final wlf<j0> a;
    private final wlf<z<p62>> b;
    private final wlf<x> c;
    private final wlf<List<f>> d;

    public b82(wlf<j0> wlf, wlf<z<p62>> wlf2, wlf<x> wlf3, wlf<List<f>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w(this.a.get(), this.b.get(), ejf.a(this.c), this.d.get());
    }
}
