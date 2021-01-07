package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;

/* renamed from: my8  reason: default package */
public final class my8 implements fjf<Boolean> {
    private final wlf<Context> a;

    public my8(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(x.g(this.a.get()));
    }
}
