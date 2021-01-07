package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: god  reason: default package */
public final class god implements yqe {
    private volatile String a = "";

    public final void a(String str) {
        h.e(str, "<set-?>");
        this.a = str;
    }

    @Override // defpackage.yqe
    public String get() {
        return this.a;
    }
}
