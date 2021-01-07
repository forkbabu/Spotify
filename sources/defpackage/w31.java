package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.s0;
import kotlin.jvm.internal.h;

/* renamed from: w31  reason: default package */
public final class w31 implements fjf<s0> {
    private final v31 a;
    private final wlf<Context> b;

    public w31(v31 v31, wlf<Context> wlf) {
        this.a = v31;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v31 v31 = this.a;
        Context context = this.b.get();
        v31.getClass();
        h.e(context, "context");
        return new u31(context);
    }
}
