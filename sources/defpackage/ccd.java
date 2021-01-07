package defpackage;

import defpackage.rbd;
import io.reactivex.functions.g;

/* renamed from: ccd  reason: default package */
public final /* synthetic */ class ccd implements g {
    public final /* synthetic */ qcd a;

    public /* synthetic */ ccd(qcd qcd) {
        this.a = qcd;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        rbd.j jVar = (rbd.j) obj;
        this.a.d(true);
    }
}
