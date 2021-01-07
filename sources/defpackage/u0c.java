package defpackage;

import android.content.Context;
import kotlin.jvm.internal.h;

/* renamed from: u0c  reason: default package */
public final class u0c implements fjf<u1c> {
    private final wlf<Context> a;

    public u0c(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        h.e(context, "context");
        return new u1c(context, null, null, null, 14);
    }
}
