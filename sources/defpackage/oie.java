package defpackage;

import defpackage.qhe;
import defpackage.rie;
import io.reactivex.a;
import java.util.concurrent.TimeUnit;

/* renamed from: oie  reason: default package */
public final /* synthetic */ class oie implements si0 {
    public final /* synthetic */ rie.b a;
    public final /* synthetic */ phe b;
    public final /* synthetic */ da2 c;

    public /* synthetic */ oie(rie.b bVar, phe phe, da2 da2) {
        this.a = bVar;
        this.b = phe;
        this.c = da2;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        rie.b bVar = this.a;
        phe phe = this.b;
        da2 da2 = this.c;
        qhe.c cVar = (qhe.c) obj;
        rie.l(rie.this, phe.f());
        if (phe.f()) {
            rie.this.o.dispose();
            rie rie = rie.this;
            rie.o = a.L(750, TimeUnit.MILLISECONDS, rie.p).subscribe(new lie(da2, phe));
        }
    }
}
