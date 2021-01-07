package com.spotify.login.settings;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class a implements d {
    private final c a;

    /* renamed from: com.spotify.login.settings.a$a  reason: collision with other inner class name */
    static final class C0168a<T, R> implements l<Response, Boolean> {
        public static final C0168a a = new C0168a();

        C0168a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Response response) {
            Response response2 = response;
            h.e(response2, "response");
            return Boolean.valueOf(response2.getStatus() == 202);
        }
    }

    public a(c cVar) {
        h.e(cVar, "endpoint");
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.spotify.login.settings.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.s<java.lang.Boolean> a() {
        /*
            r3 = this;
            com.spotify.login.settings.c r0 = r3.a
            io.reactivex.s r0 = r0.b()
            io.reactivex.s r0 = r0.E()
            r1 = 1
            io.reactivex.observables.a r0 = r0.v0(r1)
            io.reactivex.s r0 = r0.h1()
            io.reactivex.s<java.lang.Object> r1 = io.reactivex.internal.operators.observable.o.a
            io.reactivex.s r0 = r0.p0(r1)
            kotlin.reflect.f r1 = com.spotify.login.settings.CosmosLoginSettings$getOfflineMode$1.a
            if (r1 == 0) goto L_0x0023
            com.spotify.login.settings.b r2 = new com.spotify.login.settings.b
            r2.<init>(r1)
            r1 = r2
        L_0x0023:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.s r0 = r0.j0(r1)
            java.lang.String r1 = "endpoint.observeSettings…ngsResponse::offlineMode)"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.login.settings.a.a():io.reactivex.s");
    }

    public z<Boolean> b(boolean z) {
        z<R> A = this.a.a(String.valueOf(z)).A(C0168a.a);
        h.d(A, "endpoint\n            .se…== ACCEPTED\n            }");
        return A;
    }
}
