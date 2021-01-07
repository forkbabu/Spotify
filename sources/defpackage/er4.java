package defpackage;

import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.features.connectui.picker.legacy.util.b;
import com.spotify.music.features.connectui.picker.legacy.util.d;
import com.spotify.music.features.connectui.picker.legacy.util.f;

/* renamed from: er4  reason: default package */
public final class er4 implements fjf<dr4> {
    private final wlf<wt4> a;
    private final wlf<d> b;
    private final wlf<f> c;
    private final wlf<b> d;
    private final wlf<e> e;
    private final wlf<com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b> f;

    public er4(wlf<wt4> wlf, wlf<d> wlf2, wlf<f> wlf3, wlf<b> wlf4, wlf<e> wlf5, wlf<com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.b> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dr4(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
