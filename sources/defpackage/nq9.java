package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: nq9  reason: default package */
final class nq9 implements Runnable {
    private final /* synthetic */ cmf a;

    nq9(cmf cmf) {
        this.a = cmf;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        h.d(this.a.invoke(), "invoke(...)");
    }
}
