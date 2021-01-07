package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.q;
import kotlin.jvm.internal.h;

/* renamed from: x31  reason: default package */
public final class x31 implements fjf<k.a> {
    private final v31 a;
    private final wlf<Context> b;
    private final wlf<jj> c;

    public x31(v31 v31, wlf<Context> wlf, wlf<jj> wlf2) {
        this.a = v31;
        this.b = wlf;
        this.c = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        v31 v31 = this.a;
        Context context = this.b.get();
        jj jjVar = this.c.get();
        v31.getClass();
        h.e(context, "context");
        h.e(jjVar, "okHttpDataSourceFactory");
        return new q(context, jjVar);
    }
}
