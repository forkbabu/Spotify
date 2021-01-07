package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.y;
import java.util.List;
import java.util.Map;

/* renamed from: ho  reason: default package */
public abstract class ho implements Loader.e {
    public final m a;
    public final int b;
    public final d0 c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    protected final y h;

    public ho(k kVar, m mVar, int i, d0 d0Var, int i2, Object obj, long j, long j2) {
        this.h = new y(kVar);
        mVar.getClass();
        this.a = mVar;
        this.b = i;
        this.c = d0Var;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }

    public final long c() {
        return this.h.d();
    }

    public final Map<String, List<String>> d() {
        return this.h.f();
    }

    public final Uri e() {
        return this.h.e();
    }
}
