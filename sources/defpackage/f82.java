package defpackage;

import android.content.Context;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.offline.c0;
import io.reactivex.z;
import java.util.List;

/* renamed from: f82  reason: default package */
public final class f82 implements fjf<c0> {
    private final wlf<Context> a;
    private final wlf<y62> b;
    private final wlf<List<f>> c;
    private final wlf<z<p62>> d;
    private final wlf<Boolean> e;

    public f82(wlf<Context> wlf, wlf<y62> wlf2, wlf<List<f>> wlf3, wlf<z<p62>> wlf4, wlf<Boolean> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get().booleanValue());
    }
}
