package defpackage;

import com.spotify.mobius.e0;
import defpackage.km7;
import defpackage.lm7;

/* renamed from: ul7  reason: default package */
public final /* synthetic */ class ul7 implements nmf {
    public final /* synthetic */ mm7 a;

    public /* synthetic */ ul7(mm7 mm7) {
        this.a = mm7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mm7 mm7 = this.a;
        km7.g gVar = km7.g.a;
        int ordinal = ((lm7.c) obj).a().ordinal();
        if (ordinal == 0) {
            return e0.g(mm7.q(false), z42.l(new km7.f(true)));
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return e0.h();
            }
            if (mm7.a()) {
                return e0.g(mm7.q(false), z42.l(km7.j.a));
            }
            return e0.g(mm7.q(true), z42.l(gVar));
        } else if (mm7.a()) {
            return e0.f(mm7.q(false));
        } else {
            return e0.a(z42.l(gVar));
        }
    }
}
