package defpackage;

import io.reactivex.functions.g;

/* renamed from: znc  reason: default package */
public final /* synthetic */ class znc implements g {
    public final /* synthetic */ ioc a;

    public /* synthetic */ znc(ioc ioc) {
        this.a = ioc;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g((Throwable) obj);
    }
}
