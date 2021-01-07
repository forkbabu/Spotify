package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.x;
import com.google.android.exoplayer2.y;
import com.spotify.music.preview.p;
import defpackage.aq;
import defpackage.cq;

/* renamed from: pxc  reason: default package */
public final class pxc implements fjf<y> {
    private final wlf<p> a;
    private final wlf<Context> b;

    public pxc(wlf<p> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.b.get();
        return this.a.get().a(context, new x(context), new cq(cq.d.L, new aq.d()));
    }
}
