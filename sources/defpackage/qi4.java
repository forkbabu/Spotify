package defpackage;

import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: qi4  reason: default package */
public final class qi4<T, R> implements l<Boolean, d0<? extends String>> {
    final /* synthetic */ ri4 a;

    qi4(ri4 ri4) {
        this.a = ri4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends String> apply(Boolean bool) {
        Boolean bool2 = bool;
        h.e(bool2, "backendEnabled");
        if (bool2.booleanValue()) {
            return ri4.b(this.a);
        }
        ri4 ri4 = this.a;
        ri4.getClass();
        z<T> w = io.reactivex.l.j(new mi4(ri4)).w();
        h.d(w, "Maybe.fromCallable {\n   …ull)\n        }.toSingle()");
        return w;
    }
}
