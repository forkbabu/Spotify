package defpackage;

import defpackage.o8d;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: u8d  reason: default package */
final class u8d<Upstream, Downstream> implements e0<String, o8d.c> {
    final /* synthetic */ w7d a;
    final /* synthetic */ y b;

    /* renamed from: u8d$a */
    static final class a<T, R> implements l<String, d0<? extends o8d.c>> {
        final /* synthetic */ u8d a;

        a(u8d u8d) {
            this.a = u8d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends o8d.c> apply(String str) {
            String str2 = str;
            h.e(str2, "localDeviceId");
            return this.a.a.b(str2).A(s8d.a).J((long) 10000, TimeUnit.MILLISECONDS, this.a.b).m(new v9d("social listening impl: currentOrNewSession failed", new Object[0])).A(t8d.a);
        }
    }

    u8d(w7d w7d, y yVar) {
        this.a = w7d;
        this.b = yVar;
    }

    @Override // io.reactivex.e0
    public final d0<o8d.c> a(z<String> zVar) {
        h.e(zVar, "upstream");
        return zVar.s(new a(this));
    }
}
