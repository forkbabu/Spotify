package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.connectivity.b0;

/* renamed from: wbc  reason: default package */
public final class wbc implements fjf<b0> {
    private final wlf<Context> a;

    public wbc(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b0(this.a.get());
    }
}
