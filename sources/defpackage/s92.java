package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;

/* renamed from: s92  reason: default package */
public final class s92 implements fjf<r92> {
    private final wlf<Context> a;
    private final wlf<i> b;

    public s92(wlf<Context> wlf, wlf<i> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r92(this.a.get(), this.b.get());
    }
}
