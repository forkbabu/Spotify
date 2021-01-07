package defpackage;

import com.spotify.music.navigation.t;
import defpackage.xhb;
import kotlin.jvm.internal.h;

/* renamed from: zhb  reason: default package */
public final class zhb implements fjf<rhb> {
    private final wlf<t> a;

    public zhb(wlf<t> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t tVar = this.a.get();
        xhb.a aVar = xhb.a;
        h.e(tVar, "navigationApi");
        return new shb(tVar);
    }
}
