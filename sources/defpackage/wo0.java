package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: wo0  reason: default package */
public final /* synthetic */ class wo0 implements w {
    public final /* synthetic */ mp0 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ wo0(mp0 mp0, boolean z) {
        this.a = mp0;
        this.b = z;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new qo0(this.a, this.b), false, Integer.MAX_VALUE);
    }
}
