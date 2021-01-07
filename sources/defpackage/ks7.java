package defpackage;

import defpackage.fs7;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: ks7  reason: default package */
public final /* synthetic */ class ks7 implements l {
    public final /* synthetic */ at7 a;

    public /* synthetic */ ks7(at7 at7) {
        this.a = at7;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        at7 at7 = this.a;
        fs7.g gVar = (fs7.g) obj;
        String c = gVar.c();
        boolean b = gVar.b();
        at7.getClass();
        return a.u(new ws7(at7, c, b));
    }
}
