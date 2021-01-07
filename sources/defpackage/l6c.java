package defpackage;

import io.reactivex.functions.g;

/* renamed from: l6c  reason: default package */
public final /* synthetic */ class l6c implements g {
    public final /* synthetic */ m6c a;

    public /* synthetic */ l6c(m6c m6c) {
        this.a = m6c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        m6c.b(this.a, ((Boolean) obj).booleanValue());
    }
}
