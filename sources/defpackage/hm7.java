package defpackage;

import com.spotify.mobius.e0;
import defpackage.km7;
import defpackage.lm7;

/* renamed from: hm7  reason: default package */
public final /* synthetic */ class hm7 implements nmf {
    public final /* synthetic */ mm7 a;

    public /* synthetic */ hm7(mm7 mm7) {
        this.a = mm7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mm7 mm7 = this.a;
        km7.h hVar = km7.h.a;
        int ordinal = ((lm7.q) obj).a().ordinal();
        if (ordinal == 0) {
            return e0.g(mm7.r(false), z42.l(new km7.f(false)));
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return e0.h();
            }
            if (mm7.l()) {
                return e0.g(mm7.r(false), z42.l(km7.n.a));
            }
            return e0.g(mm7.r(true), z42.l(hVar));
        } else if (mm7.l()) {
            return e0.f(mm7.r(false));
        } else {
            return e0.a(z42.l(hVar));
        }
    }
}
