package defpackage;

import defpackage.qhe;
import defpackage.rie;

/* renamed from: mie  reason: default package */
public final /* synthetic */ class mie implements si0 {
    public final /* synthetic */ rie.b a;
    public final /* synthetic */ phe b;

    public /* synthetic */ mie(rie.b bVar, phe phe) {
        this.a = bVar;
        this.b = phe;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        rie.b bVar = this.a;
        phe phe = this.b;
        rie.m(rie.this, (qhe.b) obj, phe.f());
    }
}
