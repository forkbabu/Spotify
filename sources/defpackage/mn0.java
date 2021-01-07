package defpackage;

import com.spotify.http.q;
import kotlin.jvm.internal.h;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;

/* renamed from: mn0  reason: default package */
public final class mn0 implements v {
    private final q a;

    public mn0(q qVar) {
        h.e(qVar, "cache");
        this.a = qVar;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        try {
            return fof.f(i);
        } catch (IllegalArgumentException unused) {
            this.a.c();
            return fof.f(i);
        }
    }
}
