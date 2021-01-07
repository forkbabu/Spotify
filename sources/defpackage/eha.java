package defpackage;

import io.reactivex.functions.f;
import io.reactivex.t;

/* renamed from: eha  reason: default package */
public final /* synthetic */ class eha implements f {
    public final /* synthetic */ iha a;
    public final /* synthetic */ t b;

    public /* synthetic */ eha(iha iha, t tVar) {
        this.a = iha;
        this.b = tVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.n(this.b);
    }
}
