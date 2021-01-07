package defpackage;

import defpackage.hee;
import io.reactivex.functions.g;

/* renamed from: tee  reason: default package */
public final /* synthetic */ class tee implements g {
    public final /* synthetic */ qge a;

    public /* synthetic */ tee(qge qge) {
        this.a = qge;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f((hee.n) obj);
    }
}
