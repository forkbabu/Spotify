package defpackage;

import defpackage.kef;
import io.reactivex.functions.g;
import io.reactivex.x;

/* renamed from: jbf  reason: default package */
public final /* synthetic */ class jbf implements g {
    public final /* synthetic */ x a;
    public final /* synthetic */ String b;

    public /* synthetic */ jbf(x xVar, String str) {
        this.a = xVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        kef.f fVar = (kef.f) obj;
        this.a.onNext(k9f.a(this.b, fVar.u(), fVar.t()));
    }
}
