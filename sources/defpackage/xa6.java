package defpackage;

import io.reactivex.functions.g;

/* renamed from: xa6  reason: default package */
public final /* synthetic */ class xa6 implements g {
    public final /* synthetic */ nb6 a;

    public /* synthetic */ xa6(nb6 nb6) {
        this.a = nb6;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        nb6.f(this.a, ((Boolean) obj).booleanValue());
    }
}
