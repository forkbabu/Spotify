package defpackage;

import defpackage.gqc;

/* renamed from: epc  reason: default package */
public final /* synthetic */ class epc implements si0 {
    public final /* synthetic */ lpc a;
    public final /* synthetic */ jqc b;

    public /* synthetic */ epc(lpc lpc, jqc jqc) {
        this.a = lpc;
        this.b = jqc;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.d(this.b, (gqc.c) obj);
    }
}
