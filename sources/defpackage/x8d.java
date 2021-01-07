package defpackage;

import defpackage.o8d;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: x8d  reason: default package */
final class x8d<Upstream, Downstream> implements e0<String, o8d.b> {
    final /* synthetic */ w7d a;
    final /* synthetic */ String b;
    final /* synthetic */ y c;

    /* renamed from: x8d$a */
    static final class a<T, R> implements l<String, d0<? extends o8d.b>> {
        final /* synthetic */ x8d a;

        a(x8d x8d) {
            this.a = x8d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends o8d.b> apply(String str) {
            String str2 = str;
            h.e(str2, "localDeviceId");
            x8d x8d = this.a;
            return x8d.a.e(x8d.b, str2).h(z.z(new o8d.b(true))).J((long) 10000, TimeUnit.MILLISECONDS, this.a.c).m(new v9d("Failed to delete session %s", new Object[]{this.a.b}));
        }
    }

    x8d(w7d w7d, String str, y yVar) {
        this.a = w7d;
        this.b = str;
        this.c = yVar;
    }

    @Override // io.reactivex.e0
    public final d0<o8d.b> a(z<String> zVar) {
        h.e(zVar, "upstream");
        return zVar.s(new a(this));
    }
}
