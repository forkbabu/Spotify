package defpackage;

import com.spotify.music.features.browse.localcache.f;
import com.spotify.music.features.browse.view.a;
import io.reactivex.y;

/* renamed from: wf4  reason: default package */
public final class wf4 implements fjf<vf4> {
    private final wlf<y> a;
    private final wlf<f> b;
    private final wlf<a> c;

    public wf4(wlf<y> wlf, wlf<f> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vf4(this.a.get(), this.b.get(), this.c.get());
    }
}
