package defpackage;

import defpackage.gff;
import io.reactivex.functions.g;

/* renamed from: nff  reason: default package */
public final /* synthetic */ class nff implements g {
    public final /* synthetic */ tef a;

    public /* synthetic */ nff(tef tef) {
        this.a = tef;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(((gff.f) obj).b());
    }
}
