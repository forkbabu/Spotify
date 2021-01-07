package com.spotify.music.features.blendtastematch.api;

import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;
import retrofit2.HttpException;
import retrofit2.v;

public final class b {
    private final a a;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<v<TasteMatch>, d> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d apply(v<TasteMatch> vVar) {
            v<TasteMatch> vVar2 = vVar;
            h.e(vVar2, "it");
            if (vVar2.f()) {
                return vVar2.a();
            }
            if (vVar2.b() == 410) {
                return c.a;
            }
            throw new HttpException(vVar2);
        }
    }

    public b(a aVar) {
        h.e(aVar, "endpoint");
        this.a = aVar;
    }

    public final z<d> a(String str) {
        h.e(str, "token");
        z<R> A = this.a.b(str).A(a.a);
        h.d(A, "endpoint.getTasteMatch(t…          }\n            }");
        return A;
    }
}
