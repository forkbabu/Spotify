package defpackage;

import android.content.Context;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.music.spotlets.scannables.c;

/* renamed from: v28  reason: default package */
public final class v28 implements fjf<u28> {
    private final wlf<Boolean> a;
    private final wlf<Context> b;
    private final wlf<h0> c;
    private final wlf<c> d;
    private final wlf<vxc> e;

    public v28(wlf<Boolean> wlf, wlf<Context> wlf2, wlf<h0> wlf3, wlf<c> wlf4, wlf<vxc> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u28(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
