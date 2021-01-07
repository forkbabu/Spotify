package defpackage;

import com.spotify.mobius.e0;
import defpackage.gs7;
import defpackage.hs7;

/* renamed from: as7  reason: default package */
public final /* synthetic */ class as7 implements nmf {
    public final /* synthetic */ hs7 a;

    public /* synthetic */ as7(hs7 hs7) {
        this.a = hs7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        hs7 hs7 = this.a;
        boolean a2 = ((gs7.b) obj).a();
        if (hs7.a() == a2) {
            return e0.h();
        }
        hs7.a j = hs7.j();
        j.b(a2);
        return e0.f(j.a());
    }
}
