package defpackage;

import io.reactivex.functions.g;

/* renamed from: vu4  reason: default package */
public final /* synthetic */ class vu4 implements g {
    public final /* synthetic */ uda a;

    public /* synthetic */ vu4(uda uda) {
        this.a = uda;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(((Boolean) obj).booleanValue());
    }
}
