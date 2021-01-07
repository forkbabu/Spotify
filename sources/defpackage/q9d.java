package defpackage;

import defpackage.o8d;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: q9d  reason: default package */
final class q9d<Upstream, Downstream> implements e0<String, o8d.i> {
    final /* synthetic */ w7d a;
    final /* synthetic */ String b;
    final /* synthetic */ y c;

    /* renamed from: q9d$a */
    static final class a<T, R> implements l<String, d0<? extends o8d.i>> {
        final /* synthetic */ q9d a;

        a(q9d q9d) {
            this.a = q9d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends o8d.i> apply(String str) {
            String str2 = str;
            h.e(str2, "localDeviceId");
            q9d q9d = this.a;
            return q9d.a.f(q9d.b, str2).h(z.z(new o8d.i(true))).J((long) 10000, TimeUnit.MILLISECONDS, this.a.c).m(new v9d("Failed to leave session", new Object[0]));
        }
    }

    q9d(w7d w7d, String str, y yVar) {
        this.a = w7d;
        this.b = str;
        this.c = yVar;
    }

    @Override // io.reactivex.e0
    public final d0<o8d.i> a(z<String> zVar) {
        h.e(zVar, "upstream");
        return zVar.s(new a(this));
    }
}
