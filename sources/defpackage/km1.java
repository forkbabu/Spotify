package defpackage;

import java.util.concurrent.Callable;

/* renamed from: km1  reason: default package */
public final /* synthetic */ class km1 implements Callable {
    public final /* synthetic */ jn1 a;

    public /* synthetic */ km1(jn1 jn1) {
        this.a = jn1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return jn1.c(this.a);
    }
}
