package defpackage;

import io.reactivex.functions.g;

/* renamed from: sa2  reason: default package */
public final /* synthetic */ class sa2 implements g {
    public final /* synthetic */ rb2 a;

    public /* synthetic */ sa2(rb2 rb2) {
        this.a = rb2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        rb2.c(this.a, ((Boolean) obj).booleanValue());
    }
}
