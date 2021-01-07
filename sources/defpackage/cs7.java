package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.features.profile.model.LoadingState;
import defpackage.gs7;
import defpackage.hs7;

/* renamed from: cs7  reason: default package */
public final /* synthetic */ class cs7 implements nmf {
    public final /* synthetic */ hs7 a;

    public /* synthetic */ cs7(hs7 hs7) {
        this.a = hs7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        hs7.a j = this.a.j();
        j.c(((gs7.c) obj).a());
        hs7 a2 = j.a();
        boolean z = true;
        boolean z2 = a2.b() && a2.f() && !a2.c().d();
        hs7.a j2 = a2.j();
        j2.d(z2);
        hs7 a3 = j2.a();
        ct7 e = a3.c().e();
        boolean z3 = !a3.b() && e != ct7.a;
        boolean z4 = z3 && e.e();
        hs7.a j3 = a3.j();
        j3.g(z3);
        j3.f(z4);
        hs7 a4 = j3.a();
        np7 c = a4.c();
        if (c.h() != LoadingState.LOADED || !c.i().isEmpty() || !c.k().isEmpty()) {
            z = false;
        }
        hs7.a j4 = a4.j();
        j4.h(z);
        return e0.f(j4.a());
    }
}
