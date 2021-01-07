package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xu4  reason: default package */
public final /* synthetic */ class xu4 implements Callable {
    public final /* synthetic */ cv4 a;
    public final /* synthetic */ uda b;

    public /* synthetic */ xu4(cv4 cv4, uda uda) {
        this.a = cv4;
        this.b = uda;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        cv4 cv4 = this.a;
        uda uda = this.b;
        cv4.getClass();
        return uda.d().j0(new yu4(cv4)).E();
    }
}
