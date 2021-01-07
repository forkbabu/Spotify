package defpackage;

import com.spotify.mobius.e0;
import defpackage.mp7;
import defpackage.np7;

/* renamed from: fp7  reason: default package */
public final /* synthetic */ class fp7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ fp7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mp7.c cVar = (mp7.c) obj;
        np7.a n = this.a.n();
        n.d(cVar.a());
        n.h(cVar.c());
        n.g(cVar.b());
        return e0.f(n.a());
    }
}
