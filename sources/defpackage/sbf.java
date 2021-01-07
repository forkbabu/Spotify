package defpackage;

import defpackage.kef;
import io.reactivex.functions.l;

/* renamed from: sbf  reason: default package */
public final /* synthetic */ class sbf implements l {
    public final /* synthetic */ ppe a;

    public /* synthetic */ sbf(ppe ppe) {
        this.a = ppe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.p pVar = (kef.p) obj;
        return this.a.c(pVar.u().intValue(), pVar.t()).N();
    }
}
