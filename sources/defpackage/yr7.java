package defpackage;

import com.spotify.mobius.e0;
import defpackage.fs7;
import defpackage.gs7;
import kotlin.jvm.internal.h;

/* renamed from: yr7  reason: default package */
public final /* synthetic */ class yr7 implements nmf {
    public final /* synthetic */ hs7 a;

    public /* synthetic */ yr7(hs7 hs7) {
        this.a = hs7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        gs7.g gVar = (gs7.g) obj;
        String o = this.a.c().o();
        h.e(o, "username");
        return e0.a(z42.l(new fs7.c(o)));
    }
}
