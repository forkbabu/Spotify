package defpackage;

import java.lang.Thread;

/* renamed from: mw9  reason: default package */
public final /* synthetic */ class mw9 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ qx9 a;

    public /* synthetic */ mw9(qx9 qx9) {
        this.a = qx9;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.a(thread, th);
    }
}
