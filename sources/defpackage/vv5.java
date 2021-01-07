package defpackage;

import android.content.Context;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.h;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.l;
import com.spotify.remoteconfig.xj;

/* renamed from: vv5  reason: default package */
public final class vv5 implements fjf<uv5> {
    private final wlf<l> a;
    private final wlf<h> b;
    private final wlf<wv5> c;
    private final wlf<Context> d;
    private final wlf<xj> e;

    public vv5(wlf<l> wlf, wlf<h> wlf2, wlf<wv5> wlf3, wlf<Context> wlf4, wlf<xj> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uv5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
