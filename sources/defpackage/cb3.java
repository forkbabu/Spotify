package defpackage;

import android.content.Context;
import com.spotify.http.w;
import com.spotify.mobile.android.video.q;
import java.io.File;

/* renamed from: cb3  reason: default package */
public final class cb3 implements fjf<q> {
    private final wlf<Context> a;
    private final wlf<w> b;

    public cb3(wlf<Context> wlf, wlf<w> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q(new File(this.a.get().getCacheDir(), "nowplaying-canvas-cache"), 50000000, this.b.get().a());
    }
}
