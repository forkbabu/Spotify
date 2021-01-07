package defpackage;

import com.spotify.mobius.e0;
import defpackage.ohe;
import defpackage.phe;

/* renamed from: wge  reason: default package */
public final /* synthetic */ class wge implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ wge(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        boolean k = ((ohe.h) obj).k();
        phe.a e = phe.e();
        e.c(k);
        return e0.f(e.a());
    }
}
