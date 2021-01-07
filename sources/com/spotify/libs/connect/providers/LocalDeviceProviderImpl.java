package com.spotify.libs.connect.providers;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.List;
import kotlin.jvm.internal.h;

public final class LocalDeviceProviderImpl implements p, ru0.a {
    private final io.reactivex.subjects.a<GaiaDevice> a;
    private final p b = new p();
    private final m c;

    static final class a<T, R> implements l<List<? extends GaiaDevice>, v<? extends GaiaDevice>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends GaiaDevice> apply(List<? extends GaiaDevice> list) {
            List<? extends GaiaDevice> list2 = list;
            h.e(list2, "list");
            return s.d0(list2).Q(q.a);
        }
    }

    public LocalDeviceProviderImpl(m mVar) {
        h.e(mVar, "devicesListProvider");
        this.c = mVar;
        io.reactivex.subjects.a<GaiaDevice> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.libs.connect.providers.p
    public GaiaDevice b() {
        return this.a.j1();
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        this.b.b(this.c.a().W(a.a, false, Integer.MAX_VALUE).E().subscribe(new r(new LocalDeviceProviderImpl$onStart$2(this.a))));
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
