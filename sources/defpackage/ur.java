package defpackage;

import android.os.Process;

/* renamed from: ur  reason: default package */
final class ur implements Runnable {
    private final Runnable a;

    public ur(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
