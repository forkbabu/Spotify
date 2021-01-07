package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.y;
import kotlin.jvm.internal.h;

/* renamed from: y31  reason: default package */
public final class y31 implements fjf<y> {
    private final v31 a;
    private final wlf<Context> b;
    private final wlf<s0> c;

    public y31(v31 v31, wlf<Context> wlf, wlf<s0> wlf2) {
        this.a = v31;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        v31 v31 = this.a;
        Context context = this.b.get();
        s0 s0Var = this.c.get();
        v31.getClass();
        h.e(context, "context");
        h.e(s0Var, "renderersFactory");
        u0 a2 = new u0.b(context, s0Var).a();
        h.d(a2, "SimpleExoPlayer.Builder(…renderersFactory).build()");
        return a2;
    }
}
