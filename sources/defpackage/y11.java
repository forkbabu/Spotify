package defpackage;

import com.spotify.mobius.e0;
import defpackage.p21;
import defpackage.r21;

/* renamed from: y11  reason: default package */
public final /* synthetic */ class y11 implements ti0 {
    public final /* synthetic */ t21 a;

    public /* synthetic */ y11(t21 t21) {
        this.a = t21;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        t21 t21 = this.a;
        r21.c cVar = (r21.c) obj;
        int ordinal = cVar.j().ordinal();
        if (ordinal == 0) {
            return e0.f(t21.i(new p21.g(cVar.i())));
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return e0.f(t21.i(new p21.b(cVar.i())));
        }
        return e0.h();
    }
}
