package defpackage;

import com.spotify.music.podcast.ui.topic.f;
import defpackage.d77;

/* renamed from: e77  reason: default package */
public final class e77 implements fjf<d77> {
    private final wlf<d77.a> a;
    private final wlf<f> b;

    public e77(wlf<d77.a> wlf, wlf<f> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d77(ejf.a(this.a), this.b.get());
    }
}
