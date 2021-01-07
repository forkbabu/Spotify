package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: cz0  reason: default package */
public final class cz0 implements bz0 {
    private final hz0 a;

    public cz0(hz0 hz0) {
        h.e(hz0, "psesTracker");
        this.a = hz0;
    }

    @Override // defpackage.bz0
    public void a(String str) {
        h.e(str, "name");
        this.a.a(new kz0(str));
    }
}
