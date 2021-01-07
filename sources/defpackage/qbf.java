package defpackage;

import defpackage.kef;
import io.reactivex.a;
import io.reactivex.functions.l;
import java.util.concurrent.TimeUnit;

/* renamed from: qbf  reason: default package */
public final /* synthetic */ class qbf implements l {
    public final /* synthetic */ t92 a;

    public /* synthetic */ qbf(t92 t92) {
        this.a = t92;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        kef.b bVar = (kef.b) obj;
        return a.u(new uaf(this.a)).o(200, TimeUnit.MILLISECONDS).N();
    }
}
