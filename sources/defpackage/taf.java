package defpackage;

import defpackage.kef;
import io.reactivex.a;
import io.reactivex.functions.l;
import java.util.concurrent.TimeUnit;

/* renamed from: taf  reason: default package */
public final /* synthetic */ class taf implements l {
    public final /* synthetic */ t92 a;

    public /* synthetic */ taf(t92 t92) {
        this.a = t92;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.x xVar = (kef.x) obj;
        return a.u(new z9f(this.a)).o(200, TimeUnit.MILLISECONDS).N();
    }
}
