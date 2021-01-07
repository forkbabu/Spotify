package defpackage;

import com.spotify.music.features.queue.v2.i;
import com.spotify.ubi.specification.factories.m3;
import kotlin.jvm.internal.h;

/* renamed from: vx7  reason: default package */
public final class vx7 implements fjf<i> {
    private final ux7 a;
    private final wlf<ere> b;

    public vx7(ux7 ux7, wlf<ere> wlf) {
        this.a = ux7;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ux7 ux7 = this.a;
        ere ere = this.b.get();
        ux7.getClass();
        h.e(ere, "ubiLogger");
        return new i(ere, new m3());
    }
}
