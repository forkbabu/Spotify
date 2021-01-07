package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.collection.util.k;

/* renamed from: yv3  reason: default package */
public final class yv3 implements fjf<xv3> {
    private final wlf<CollectionStateProvider> a;
    private final wlf<k> b;
    private final wlf<k1e<b91>> c;
    private final wlf<String> d;

    public yv3(wlf<CollectionStateProvider> wlf, wlf<k> wlf2, wlf<k1e<b91>> wlf3, wlf<String> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xv3(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
