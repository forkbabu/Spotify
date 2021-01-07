package defpackage;

import com.spotify.base.java.logging.Logger;
import defpackage.ev8;
import defpackage.fv8;
import defpackage.zu8;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: av8  reason: default package */
final class av8<Upstream, Downstream> implements w<zu8.a, ev8> {
    final /* synthetic */ ov8 a;

    /* renamed from: av8$a */
    static final class a<T, R> implements l<zu8.a, v<? extends fv8>> {
        final /* synthetic */ av8 a;

        a(av8 av8) {
            this.a = av8;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends fv8> apply(zu8.a aVar) {
            h.e(aVar, "it");
            this.a.a.getClass();
            Logger.b("fetchEmail called", new Object[0]);
            s i0 = s.i0(new fv8.c(""));
            h.d(i0, "Observable.just(UpdateEmailFetchState.Success(\"\"))");
            return i0;
        }
    }

    /* renamed from: av8$b */
    static final class b<T, R> implements l<fv8, ev8> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ev8 apply(fv8 fv8) {
            fv8 fv82 = fv8;
            h.e(fv82, "response");
            return new ev8.a(fv82);
        }
    }

    av8(ov8 ov8) {
        this.a = ov8;
    }

    @Override // io.reactivex.w
    public final v<ev8> apply(s<zu8.a> sVar) {
        h.e(sVar, "effect");
        return sVar.W(new a(this), false, Integer.MAX_VALUE).j0(b.a).s0((R) new ev8.a(fv8.a.a));
    }
}
