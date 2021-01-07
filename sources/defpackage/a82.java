package defpackage;

import com.google.android.video.exo.d;
import com.spotify.mobile.android.video.offline.v;
import com.spotify.mobile.android.video.offline.z;
import okhttp3.y;

/* renamed from: a82  reason: default package */
public final class a82 implements fjf<v> {
    private final wlf<y> a;
    private final wlf<z> b;
    private final wlf<io.reactivex.z<p62>> c;

    public a82(wlf<y> wlf, wlf<z> wlf2, wlf<io.reactivex.z<p62>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.b.get().a(), new d(this.a.get(), null), this.c.get());
    }
}
