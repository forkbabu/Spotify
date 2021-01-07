package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abd  reason: default package */
public final /* synthetic */ class abd implements Callable {
    public final /* synthetic */ fbd a;

    public /* synthetic */ abd(fbd fbd) {
        this.a = fbd;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b();
    }
}
