package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;

/* renamed from: vt8  reason: default package */
public final class vt8 implements fjf<ut8> {
    private final wlf<Context> a;
    private final wlf<m> b;
    private final wlf<c> c;

    public vt8(wlf<Context> wlf, wlf<m> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ut8(this.a.get(), this.b.get(), this.c.get());
    }
}
