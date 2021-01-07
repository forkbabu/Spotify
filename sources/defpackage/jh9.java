package defpackage;

import com.spotify.mobius.g;
import com.spotify.mobius.h;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.subjects.c;

/* renamed from: jh9  reason: default package */
public final class jh9<M, E> implements g<M, E> {
    private final c<M> a;
    private final s<E> b;

    /* renamed from: jh9$a */
    public static final class a implements h<M> {
        final /* synthetic */ jh9 a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(jh9 jh9, io.reactivex.disposables.b bVar) {
            this.a = jh9;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(M m) {
            this.a.a.onNext(m);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    /* renamed from: jh9$b */
    static final class b<T> implements io.reactivex.functions.g<E> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        @Override // io.reactivex.functions.g
        public final void accept(E e) {
            this.a.accept(e);
        }
    }

    public jh9(c cVar, s sVar, int i) {
        s<E> sVar2;
        if ((i & 2) != 0) {
            sVar2 = (s<E>) o.a;
            kotlin.jvm.internal.h.d(sVar2, "Observable.empty()");
        } else {
            sVar2 = null;
        }
        kotlin.jvm.internal.h.e(cVar, "models");
        kotlin.jvm.internal.h.e(sVar2, "events");
        this.a = cVar;
        this.b = sVar2;
    }

    @Override // com.spotify.mobius.g
    public h<M> t(da2<E> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this, this.b.subscribe(new b(da2)));
    }
}
