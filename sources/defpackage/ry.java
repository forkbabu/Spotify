package defpackage;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: ry  reason: default package */
public final /* synthetic */ class ry implements Executor {
    static final Executor a = new ry();

    private ry() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
