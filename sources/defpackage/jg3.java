package defpackage;

import com.spotify.eventsender.r0;
import java.util.Collections;

/* renamed from: jg3  reason: default package */
public final class jg3 implements fjf<r0> {
    private final wlf<mg3> a;
    private final wlf<kl0> b;

    public jg3(wlf<mg3> wlf, wlf<kl0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        r0.a a2 = r0.a();
        a2.d(Collections.singletonList(this.a.get()));
        a2.f(this.b.get());
        return a2.a();
    }
}
