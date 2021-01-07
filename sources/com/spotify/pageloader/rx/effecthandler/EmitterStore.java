package com.spotify.pageloader.rx.effecthandler;

import com.spotify.pageloader.x0;
import io.reactivex.f;
import io.reactivex.r;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.h;

public final class EmitterStore<T> {
    private CopyOnWriteArraySet<nmf<f<T>, kotlin.f>> a = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<f<T>> b = new CopyOnWriteArraySet<>();
    private final s<T> c;

    static final class a<T> implements u<T> {
        final /* synthetic */ EmitterStore a;

        /* renamed from: com.spotify.pageloader.rx.effecthandler.EmitterStore$a$a  reason: collision with other inner class name */
        static final class C0361a implements io.reactivex.functions.f {
            final /* synthetic */ a a;
            final /* synthetic */ t b;

            C0361a(a aVar, t tVar) {
                this.a = aVar;
                this.b = tVar;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                EmitterStore emitterStore = this.a.a;
                t tVar = this.b;
                h.d(tVar, "emitter");
                EmitterStore.c(emitterStore, tVar);
            }
        }

        a(EmitterStore emitterStore) {
            this.a = emitterStore;
        }

        @Override // io.reactivex.u
        public final void subscribe(t<T> tVar) {
            h.e(tVar, "emitter");
            EmitterStore.a(this.a, tVar);
            tVar.e(new C0361a(this, tVar));
        }
    }

    public EmitterStore() {
        s<T> y = s.y(new a(this));
        h.d(y, "Observable.create<T> { e…(emitter)\n        }\n    }");
        this.c = y;
    }

    public static final void a(EmitterStore emitterStore, f fVar) {
        emitterStore.b.add(fVar);
        Iterator<T> it = emitterStore.a.iterator();
        while (it.hasNext()) {
            it.next().invoke(fVar);
        }
    }

    public static final void c(EmitterStore emitterStore, f fVar) {
        emitterStore.b.remove(fVar);
    }

    public final void d(r<T> rVar) {
        h.e(rVar, "notification");
        for (T t : this.b) {
            h.d(t, "emitter");
            x0.a(t, rVar);
        }
    }

    public final s<T> e() {
        return this.c;
    }

    public final cmf<kotlin.f> f(nmf<? super f<T>, kotlin.f> nmf) {
        h.e(nmf, "observer");
        this.a.add(nmf);
        return new EmitterStore$observe$1(this, nmf);
    }
}
