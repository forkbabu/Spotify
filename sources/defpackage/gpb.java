package defpackage;

import io.reactivex.functions.g;

/* renamed from: gpb  reason: default package */
public final /* synthetic */ class gpb implements g {
    public final /* synthetic */ ypb a;

    public /* synthetic */ gpb(ypb ypb) {
        this.a = ypb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Long) obj);
    }
}
