package defpackage;

import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import io.reactivex.s;

/* renamed from: pk5  reason: default package */
public final class pk5 implements fjf<ok5> {
    private final wlf<s<Boolean>> a;
    private final wlf<s<Boolean>> b;
    private final wlf<hha> c;
    private final wlf<AndroidFeatureHomeProperties> d;

    public pk5(wlf<s<Boolean>> wlf, wlf<s<Boolean>> wlf2, wlf<hha> wlf3, wlf<AndroidFeatureHomeProperties> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ok5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
