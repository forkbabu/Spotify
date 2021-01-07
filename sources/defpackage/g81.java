package defpackage;

import java.util.concurrent.Callable;

/* renamed from: g81  reason: default package */
public final /* synthetic */ class g81 implements Callable {
    public final /* synthetic */ h81 a;
    public final /* synthetic */ String b;

    public /* synthetic */ g81(h81 h81, String str) {
        this.a = h81;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b);
    }
}
