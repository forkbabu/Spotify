package defpackage;

import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.music.features.home.common.viewbinder.w;
import com.spotify.music.features.home.common.viewbinder.y;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

/* renamed from: mj5  reason: default package */
public final class mj5 implements fjf<v> {
    private final wlf<w> a;
    private final wlf<y> b;
    private final wlf<AndroidFeatureHomeProperties> c;

    public mj5(wlf<w> wlf, wlf<y> wlf2, wlf<AndroidFeatureHomeProperties> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = (w) this.a.get();
        v vVar2 = (y) this.b.get();
        if (this.c.get().d()) {
            vVar = vVar2;
        }
        yif.g(vVar, "Cannot return null from a non-@Nullable @Provides method");
        return vVar;
    }
}
