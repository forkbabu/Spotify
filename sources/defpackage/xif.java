package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.pse.model.e;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.v;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: xif  reason: default package */
public final class xif implements v {
    private final g70 a;

    /* renamed from: xif$a */
    static final class a<T, R> implements l<Optional<f70>, Destination> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Destination apply(Optional<f70> optional) {
            Optional<f70> optional2 = optional;
            h.e(optional2, "it");
            if (optional2.isPresent()) {
                return Destination.j.a;
            }
            return Destination.i.a;
        }
    }

    public xif(g70 g70) {
        h.e(g70, "mAccountInfoStore");
        this.a = g70;
    }

    @Override // com.spotify.loginflow.v
    public z<Destination> a(e eVar) {
        h.e(eVar, "psesConfiguration");
        if (eVar.j()) {
            z<R> A = this.a.a().A(a.a);
            h.d(A, "mAccountInfoStore.andMar…          }\n            }");
            return A;
        }
        z<Destination> z = z.z(Destination.i.a);
        h.d(z, "Single.just(Destination.Start)");
        return z;
    }
}
