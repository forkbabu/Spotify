package defpackage;

import android.content.Context;
import com.spotify.music.features.home.common.cache.DiskCacheImpl;
import com.spotify.music.features.home.common.cache.a;

/* renamed from: hk5  reason: default package */
public final class hk5 implements fjf<a<byte[]>> {
    private final wlf<Context> a;
    private final wlf<String> b;

    public hk5(wlf<Context> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DiskCacheImpl(this.a.get(), this.b.get(), "home", "free-tier-cache");
    }
}
