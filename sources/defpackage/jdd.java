package defpackage;

import defpackage.cdd;
import io.reactivex.functions.l;
import io.reactivex.y;

/* renamed from: jdd  reason: default package */
public final /* synthetic */ class jdd implements l {
    public final /* synthetic */ f4d a;
    public final /* synthetic */ y b;

    public /* synthetic */ jdd(f4d f4d, y yVar) {
        this.a = f4d;
        this.b = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f4d f4d = this.a;
        cdd.a aVar = (cdd.a) obj;
        return f4d.a().o0(this.b).j0(kdd.a);
    }
}
