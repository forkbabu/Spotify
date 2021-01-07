package defpackage;

import com.spotify.mobius.e0;
import defpackage.lm7;
import defpackage.mm7;

/* renamed from: ol7  reason: default package */
public final /* synthetic */ class ol7 implements nmf {
    public final /* synthetic */ mm7 a;

    public /* synthetic */ ol7(mm7 mm7) {
        this.a = mm7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        mm7 mm7 = this.a;
        lm7.k kVar = (lm7.k) obj;
        if (kVar.a().equals(mm7.e())) {
            return e0.h();
        }
        String a2 = kVar.a();
        mm7.a o = mm7.o();
        o.d(a2);
        mm7.a o2 = o.a().o();
        o2.e(true);
        return e0.f(o2.a());
    }
}
