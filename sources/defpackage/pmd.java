package defpackage;

import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: pmd  reason: default package */
public final class pmd implements Runnable {
    private final /* synthetic */ cmf a;

    pmd(cmf cmf) {
        this.a = cmf;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        h.d(this.a.invoke(), "invoke(...)");
    }
}
