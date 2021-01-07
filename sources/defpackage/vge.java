package defpackage;

import com.spotify.mobius.e0;
import defpackage.ohe;

/* renamed from: vge  reason: default package */
public final /* synthetic */ class vge implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ vge(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        ohe.f fVar = (ohe.f) obj;
        String str = (String) fVar.l().b(lhe.a, tge.a, ihe.a);
        if (!phe.a().equals(str)) {
            return e0.h();
        }
        return (e0) fVar.l().b(new fhe(fVar, phe, str), new ehe(phe, str), new dhe(phe, str));
    }
}
