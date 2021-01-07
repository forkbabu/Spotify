package com.spotify.remoteconfig.client.network;

import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class m<T> implements e0<T, T> {

    /* access modifiers changed from: private */
    public static final class a implements l<s<Throwable>, v<?>> {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<?> apply(s<Throwable> sVar) {
            s<Throwable> sVar2 = sVar;
            h.f(sVar2, "throwableObserver");
            s W = s.d1(sVar2, s.u0(1, this.a + 1), k.a).W(new l(this), false, Integer.MAX_VALUE);
            h.b(W, "throwableObserver.zipWit…      }\n                }");
            return W;
        }
    }

    public m(int i, int i2) {
    }

    @Override // io.reactivex.e0
    public d0<T> a(z<T> zVar) {
        h.f(zVar, "upstream");
        z<T> B0 = zVar.P().w0(new a(3, 500)).B0();
        h.b(B0, "upstream\n        .toObse…\n        .singleOrError()");
        return B0;
    }
}
