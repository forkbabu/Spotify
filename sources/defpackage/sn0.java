package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.v;
import okio.e;

/* renamed from: sn0  reason: default package */
public final class sn0 implements v {
    public static final a b = new a(null);
    private final int a = 500;

    /* renamed from: sn0$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0 i = fof.i();
        if (i.a() != null && i.c("Content-Encoding") == null && i.c("X-Transfer-Encoding") == null) {
            c0 a2 = i.a();
            h.c(a2);
            if (a2.a() >= ((long) this.a)) {
                a0.a h = i.h();
                h.e("Content-Encoding", "gzip");
                String g = i.g();
                c0 a3 = i.a();
                h.c(a3);
                h.d(a3, "originalRequest.body()!!");
                rn0 rn0 = new rn0(a3);
                e eVar = new e();
                rn0.f(eVar);
                h.g(g, new qn0(rn0, eVar));
                return fof.f(h.b());
            }
        }
        return fof.f(i);
    }
}
