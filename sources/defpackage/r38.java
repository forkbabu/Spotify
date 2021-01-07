package defpackage;

import com.spotify.music.features.radiohub.view.e;
import com.spotify.music.features.radiohub.view.f;

/* renamed from: r38  reason: default package */
public final class r38 implements fjf<e> {
    private final wlf<b61> a;
    private final wlf<e61> b;

    public r38(wlf<b61> wlf, wlf<e61> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f(this.a.get(), this.b.get());
    }
}
