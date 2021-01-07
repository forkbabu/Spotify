package defpackage;

import com.spotify.mobius.e0;
import defpackage.nhe;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qhe;
import java.util.HashSet;

/* renamed from: ahe  reason: default package */
public final /* synthetic */ class ahe implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ ahe(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        ohe.e eVar = (ohe.e) obj;
        HashSet hashSet = new HashSet();
        qhe b = phe.b();
        b.getClass();
        if (b instanceof qhe.d) {
            hashSet.add(new nhe.b());
        } else {
            qhe b2 = phe.b();
            b2.getClass();
            if (b2 instanceof qhe.c) {
                hashSet.add(new nhe.g(phe.a(), true));
            } else {
                qhe b3 = phe.b();
                b3.getClass();
                if (b3 instanceof qhe.b) {
                    qhe b4 = phe.b();
                    b4.getClass();
                    if (((qhe.b) b4).i() == 20) {
                        hashSet.add(new nhe.f(phe.a()));
                    }
                }
            }
        }
        if (phe.f()) {
            return e0.a(hashSet);
        }
        phe.a e = phe.e();
        e.d(true);
        return e0.g(e.a(), hashSet);
    }
}
