package defpackage;

import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: gi7  reason: default package */
public final /* synthetic */ class gi7 implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ gi7(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = (s) obj;
        return sVar.N0(1).x(sVar.z(500, TimeUnit.MILLISECONDS, this.a));
    }
}
