package defpackage;

import defpackage.rbd;
import io.reactivex.functions.g;

/* renamed from: icd  reason: default package */
public final /* synthetic */ class icd implements g {
    public final /* synthetic */ qcd a;

    public /* synthetic */ icd(qcd qcd) {
        this.a = qcd;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        rbd.i iVar = (rbd.i) obj;
        this.a.c(true);
    }
}
