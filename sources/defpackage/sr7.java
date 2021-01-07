package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.e0;
import defpackage.fs7;
import defpackage.gs7;
import kotlin.jvm.internal.h;

/* renamed from: sr7  reason: default package */
public final /* synthetic */ class sr7 implements nmf {
    public final /* synthetic */ hs7 a;

    public /* synthetic */ sr7(hs7 hs7) {
        this.a = hs7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        hs7 hs7 = this.a;
        gs7.e eVar = (gs7.e) obj;
        String B = l0.J(hs7.c().o()).B();
        B.getClass();
        h.e(B, "userUri");
        return e0.a(z42.l(new fs7.g(B, true ^ hs7.c().e().e())));
    }
}
