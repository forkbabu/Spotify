package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: so0  reason: default package */
public final /* synthetic */ class so0 implements w {
    public final /* synthetic */ y a;

    public /* synthetic */ so0(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.C(10, TimeUnit.MINUTES, this.a).j0(no0.a);
    }
}
