package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: yge  reason: default package */
public final /* synthetic */ class yge implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ yge(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        qhe qhe;
        phe phe = this.a;
        String k = ((ohe.d) obj).k();
        if (!(!phe.a().equals(k))) {
            return e0.h();
        }
        if (MoreObjects.isNullOrEmpty(k)) {
            qhe.a aVar = new qhe.a();
            phe.a e = phe.e();
            e.b(aVar);
            return e0.f(e.a());
        }
        if (cie.a(k)) {
            qhe = new qhe.c(k);
        } else {
            qhe = new qhe.b(k, 130);
        }
        phe.a e2 = phe.e();
        e2.b(qhe);
        return e0.f(e2.a());
    }
}
