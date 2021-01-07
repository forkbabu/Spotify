package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.ev8;
import defpackage.hv8;
import defpackage.zu8;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: cv8  reason: default package */
final class cv8<Upstream, Downstream> implements w<zu8.c, ev8> {
    final /* synthetic */ ov8 a;

    /* renamed from: cv8$a */
    static final class a<T, R> implements l<zu8.c, v<? extends hv8>> {
        final /* synthetic */ cv8 a;

        a(cv8 cv8) {
            this.a = cv8;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends hv8> apply(zu8.c cVar) {
            zu8.c cVar2 = cVar;
            h.e(cVar2, "it");
            ov8 ov8 = this.a.a;
            String a2 = cVar2.a();
            ov8.getClass();
            h.e(a2, "email");
            Logger.b("saveEmail data payload: " + a2, new Object[0]);
            s i0 = s.i0(hv8.c.a);
            h.d(i0, "Observable.just(UpdateEmailSaveState.Success)");
            return i0;
        }
    }

    /* renamed from: cv8$b */
    static final class b<T, R> implements l<hv8, ev8> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ev8 apply(hv8 hv8) {
            hv8 hv82 = hv8;
            h.e(hv82, "response");
            return new ev8.d(hv82);
        }
    }

    cv8(ov8 ov8) {
        this.a = ov8;
    }

    @Override // io.reactivex.w
    public final v<ev8> apply(s<zu8.c> sVar) {
        h.e(sVar, "effect");
        return sVar.W(new a(this), false, Integer.MAX_VALUE).j0(b.a).s0((R) new ev8.d(hv8.a.a));
    }
}
