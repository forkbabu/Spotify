package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tme  reason: default package */
public final /* synthetic */ class tme implements w92 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ tme(AtomicBoolean atomicBoolean, Thread thread) {
        this.a = atomicBoolean;
        this.b = thread;
    }

    @Override // defpackage.w92
    public final void dispose() {
        AtomicBoolean atomicBoolean = this.a;
        Thread thread = this.b;
        atomicBoolean.set(false);
        thread.interrupt();
    }
}
