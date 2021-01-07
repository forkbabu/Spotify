package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;

/* renamed from: rt2  reason: default package */
public final class rt2 implements fjf<Boolean> {
    private final wlf<Context> a;

    public rt2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(x.f(this.a.get()));
    }
}
