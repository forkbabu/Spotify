package defpackage;

import com.spotify.player.queue.f;
import kotlin.jvm.internal.h;

/* renamed from: dy7  reason: default package */
public final class dy7 implements fjf<f> {
    private final yx7 a;
    private final wlf<bxd> b;

    public dy7(yx7 yx7, wlf<bxd> wlf) {
        this.a = yx7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yx7 yx7 = this.a;
        bxd bxd = this.b.get();
        yx7.getClass();
        h.e(bxd, "playerApis");
        f a2 = bxd.a();
        h.d(a2, "playerApis.queue()");
        return a2;
    }
}
