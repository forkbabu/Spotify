package defpackage;

import io.netty.channel.k;
import io.netty.channel.m;
import io.netty.handler.codec.http.e0;
import io.netty.handler.codec.http.o;
import io.netty.handler.codec.http.z;
import io.reactivex.h;

/* renamed from: zre  reason: default package */
class zre extends m {
    private final h<?> b;

    /* renamed from: zre$a */
    static final class a {
        static final a a = new a();

        private a() {
        }
    }

    zre(h<?> hVar) {
        this.b = hVar;
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void S(k kVar, Object obj) {
        a aVar = a.a;
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            String k = e0Var.u().k("x-asr-status");
            if (k != null && k.startsWith(Integer.toString(408))) {
                kVar.s(aVar);
                e0Var.d();
                if (!this.b.isCancelled()) {
                    this.b.onComplete();
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof z) || ((z) obj).b().d() != 408) {
            kVar.N(obj);
            return;
        }
        if (obj instanceof o) {
            ((o) obj).d();
        }
        kVar.s(aVar);
        if (!this.b.isCancelled()) {
            this.b.onComplete();
        }
    }
}
