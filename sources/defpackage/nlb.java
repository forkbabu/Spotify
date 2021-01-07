package defpackage;

import io.reactivex.functions.g;

/* renamed from: nlb  reason: default package */
public final /* synthetic */ class nlb implements g {
    public final /* synthetic */ qlb a;

    public /* synthetic */ nlb(qlb qlb) {
        this.a = qlb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qlb.a(this.a, ((Integer) obj).intValue());
    }
}
