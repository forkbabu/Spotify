package defpackage;

import com.spotify.mobius.e0;
import defpackage.hie;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: dhe  reason: default package */
public final /* synthetic */ class dhe implements ti0 {
    public final /* synthetic */ phe a;
    public final /* synthetic */ String b;

    public /* synthetic */ dhe(phe phe, String str) {
        this.a = phe;
        this.b = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        qhe.e eVar = new qhe.e(this.b, ((hie.a) obj).e());
        phe.a e = phe.e();
        e.b(eVar);
        return e0.f(e.a());
    }
}
