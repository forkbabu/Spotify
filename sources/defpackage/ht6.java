package defpackage;

import android.content.Context;
import android.os.Build;
import com.spotify.mobile.android.util.x;

/* renamed from: ht6  reason: default package */
public final class ht6 implements fjf<Boolean> {
    private final wlf<Context> a;

    public ht6(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(!x.g(this.a.get()) && Build.VERSION.SDK_INT >= 23);
    }
}
