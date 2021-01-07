package com.spotify.libs.connect.providers;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.List;
import kotlin.jvm.internal.h;

public final class ActiveDeviceProviderImpl implements h, ru0.a {
    private final io.reactivex.subjects.a<Optional<GaiaDevice>> a;
    private final p b = new p();
    private final m c;

    static final class a<T, R> implements l<List<? extends GaiaDevice>, v<? extends Optional<GaiaDevice>>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.libs.connect.providers.k] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // io.reactivex.functions.l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.reactivex.v<? extends com.google.common.base.Optional<com.spotify.libs.connect.model.GaiaDevice>> apply(java.util.List<? extends com.spotify.libs.connect.model.GaiaDevice> r3) {
            /*
                r2 = this;
                java.util.List r3 = (java.util.List) r3
                java.lang.String r0 = "list"
                kotlin.jvm.internal.h.e(r3, r0)
                io.reactivex.s r3 = io.reactivex.s.d0(r3)
                com.spotify.libs.connect.providers.ActiveDeviceProviderImpl$onStart$1$1 r0 = com.spotify.libs.connect.providers.ActiveDeviceProviderImpl$onStart$1$1.a
                if (r0 == 0) goto L_0x0015
                com.spotify.libs.connect.providers.k r1 = new com.spotify.libs.connect.providers.k
                r1.<init>(r0)
                r0 = r1
            L_0x0015:
                io.reactivex.functions.n r0 = (io.reactivex.functions.n) r0
                io.reactivex.s r3 = r3.Q(r0)
                com.spotify.libs.connect.providers.i r0 = com.spotify.libs.connect.providers.i.a
                io.reactivex.s r3 = r3.j0(r0)
                com.google.common.base.Optional r0 = com.google.common.base.Optional.absent()
                io.reactivex.s r3 = r3.A(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.connect.providers.ActiveDeviceProviderImpl.a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public ActiveDeviceProviderImpl(m mVar) {
        h.e(mVar, "devicesListProvider");
        this.c = mVar;
        io.reactivex.subjects.a<Optional<GaiaDevice>> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.providers.h
    public s<Optional<GaiaDevice>> a() {
        return this.a;
    }

    @Override // com.spotify.libs.connect.providers.h
    public GaiaDevice b() {
        Optional<GaiaDevice> j1 = this.a.j1();
        if (j1 != null) {
            return j1.orNull();
        }
        return null;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.a().W(a.a, false, Integer.MAX_VALUE).E().subscribe(new j(new ActiveDeviceProviderImpl$onStart$2(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
