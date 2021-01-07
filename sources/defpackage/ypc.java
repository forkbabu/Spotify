package defpackage;

import defpackage.eqc;
import defpackage.gqc;

/* renamed from: ypc  reason: default package */
public final /* synthetic */ class ypc implements ti0 {
    public final /* synthetic */ jqc a;

    public /* synthetic */ ypc(jqc jqc) {
        this.a = jqc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jqc jqc = this.a;
        eqc.f fVar = (eqc.f) obj;
        return jqc.a(jqc.j(), jqc.b(), jqc.e(), jqc.c(), new gqc.c(fVar.c(), fVar.d()), fVar.b(), fVar.e(), jqc.d(), Integer.valueOf(jqc.i()));
    }
}
