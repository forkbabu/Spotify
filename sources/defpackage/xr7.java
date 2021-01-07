package defpackage;

import com.spotify.mobius.e0;
import defpackage.fs7;
import defpackage.gs7;
import kotlin.jvm.internal.h;

/* renamed from: xr7  reason: default package */
public final /* synthetic */ class xr7 implements nmf {
    public final /* synthetic */ hs7 a;

    public /* synthetic */ xr7(hs7 hs7) {
        this.a = hs7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        gs7.k kVar = (gs7.k) obj;
        String o = this.a.c().o();
        h.e(o, "username");
        return e0.a(z42.l(new fs7.d(o)));
    }
}
