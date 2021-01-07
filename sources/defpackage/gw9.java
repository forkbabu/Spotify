package defpackage;

import io.reactivex.functions.g;

/* renamed from: gw9  reason: default package */
public final /* synthetic */ class gw9 implements g {
    public final /* synthetic */ bx9 a;

    public /* synthetic */ gw9(bx9 bx9) {
        this.a = bx9;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        bx9.d(this.a, ((Boolean) obj).booleanValue());
    }
}
