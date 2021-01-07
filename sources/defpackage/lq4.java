package defpackage;

import io.reactivex.functions.g;

/* renamed from: lq4  reason: default package */
public final /* synthetic */ class lq4 implements g {
    public final /* synthetic */ nq4 a;

    public /* synthetic */ lq4(nq4 nq4) {
        this.a = nq4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(((Float) obj).floatValue());
    }
}
