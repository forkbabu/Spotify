package defpackage;

import android.content.Context;
import com.spotify.music.features.home.common.cache.DiskCacheImpl;
import com.spotify.music.features.home.common.cache.a;
import kotlin.jvm.internal.h;

/* renamed from: ar2  reason: default package */
public final class ar2 implements fjf<a<byte[]>> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<Boolean> c;

    public ar2(wlf<Context> wlf, wlf<String> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        String str = this.b.get();
        boolean booleanValue = this.c.get().booleanValue();
        h.e(context, "context");
        h.e(str, "username");
        return new DiskCacheImpl(context, str, "home", booleanValue ? "free-tier-cache" : "premium-cache");
    }
}
