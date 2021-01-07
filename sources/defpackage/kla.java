package defpackage;

import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: kla  reason: default package */
public final /* synthetic */ class kla implements l {
    public final /* synthetic */ mla a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kla(mla mla, boolean z) {
        this.a = mla;
        this.b = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        mla mla = this.a;
        boolean z = this.b;
        mla.getClass();
        return a.u(new lla(mla, (String) obj, z));
    }
}
