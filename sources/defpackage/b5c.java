package defpackage;

import io.reactivex.functions.g;

/* renamed from: b5c  reason: default package */
public final /* synthetic */ class b5c implements g {
    public final /* synthetic */ e5c a;

    public /* synthetic */ b5c(e5c e5c) {
        this.a = e5c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e5c.a(this.a, ((Boolean) obj).booleanValue());
    }
}
