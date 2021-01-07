package defpackage;

import defpackage.q21;
import io.reactivex.functions.g;

/* renamed from: w21  reason: default package */
public final /* synthetic */ class w21 implements g {
    public final /* synthetic */ g31 a;

    public /* synthetic */ w21(g31 g31) {
        this.a = g31;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        q21.c cVar = (q21.c) obj;
        ((h31) this.a).g(cVar.b(), cVar.a());
    }
}
