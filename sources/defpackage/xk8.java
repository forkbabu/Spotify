package defpackage;

import defpackage.yk8;
import io.reactivex.functions.f;

/* renamed from: xk8  reason: default package */
public final /* synthetic */ class xk8 implements f {
    public final /* synthetic */ yk8.b a;

    public /* synthetic */ xk8(yk8.b bVar) {
        this.a = bVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.c();
    }
}
