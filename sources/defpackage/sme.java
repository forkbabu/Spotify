package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sme  reason: default package */
public final /* synthetic */ class sme implements Runnable {
    public final /* synthetic */ ume a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ da2 c;

    public /* synthetic */ sme(ume ume, AtomicBoolean atomicBoolean, da2 da2) {
        this.a = ume;
        this.b = atomicBoolean;
        this.c = da2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c);
    }
}
