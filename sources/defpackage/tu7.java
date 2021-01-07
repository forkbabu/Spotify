package defpackage;

import io.reactivex.functions.g;

/* renamed from: tu7  reason: default package */
public final /* synthetic */ class tu7 implements g {
    public final /* synthetic */ xu7 a;
    public final /* synthetic */ qv7 b;

    public /* synthetic */ tu7(xu7 xu7, qv7 qv7) {
        this.a = xu7;
        this.b = qv7;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, (Throwable) obj);
    }
}
