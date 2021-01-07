package defpackage;

import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.json.g;
import io.reactivex.y;

/* renamed from: oi5  reason: default package */
public final class oi5 implements fjf<ni5> {
    private final wlf<a<byte[]>> a;
    private final wlf<g> b;
    private final wlf<Boolean> c;
    private final wlf<y> d;

    public oi5(wlf<a<byte[]>> wlf, wlf<g> wlf2, wlf<Boolean> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ni5(this.a.get(), this.b.get(), this.c.get().booleanValue(), this.d.get());
    }
}
