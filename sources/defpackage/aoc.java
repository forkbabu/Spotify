package defpackage;

import io.reactivex.functions.f;
import io.reactivex.t;

/* renamed from: aoc  reason: default package */
public final /* synthetic */ class aoc implements f {
    public final /* synthetic */ ioc a;
    public final /* synthetic */ t b;

    public /* synthetic */ aoc(ioc ioc, t tVar) {
        this.a = ioc;
        this.b = tVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.e(this.b);
    }
}
