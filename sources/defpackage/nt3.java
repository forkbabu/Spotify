package defpackage;

import defpackage.st3;
import io.reactivex.functions.g;

/* renamed from: nt3  reason: default package */
public final /* synthetic */ class nt3 implements g {
    public final /* synthetic */ st3.a a;

    public /* synthetic */ nt3(st3.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
