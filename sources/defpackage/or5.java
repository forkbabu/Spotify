package defpackage;

import io.reactivex.functions.g;

/* renamed from: or5  reason: default package */
public final /* synthetic */ class or5 implements g {
    public final /* synthetic */ es5 a;

    public /* synthetic */ or5(es5 es5) {
        this.a = es5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        es5.e(this.a, ((Integer) obj).intValue());
    }
}
