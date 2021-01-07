package com.spotify.mobius.rx2;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.functions.f;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Set;

/* access modifiers changed from: package-private */
public class n<E, M, F> implements w<E, M> {
    private final MobiusLoop.h<M, E, F> a;
    private final M b;
    private final Set<F> c;

    class a implements u<M> {
        final /* synthetic */ s a;

        /* renamed from: com.spotify.mobius.rx2.n$a$a  reason: collision with other inner class name */
        class C0205a implements da2<M> {
            final /* synthetic */ t a;

            C0205a(a aVar, t tVar) {
                this.a = tVar;
            }

            @Override // defpackage.da2
            public void accept(M m) {
                this.a.onNext(m);
            }
        }

        class b implements g<E> {
            final /* synthetic */ MobiusLoop a;

            b(a aVar, MobiusLoop mobiusLoop) {
                this.a = mobiusLoop;
            }

            @Override // io.reactivex.functions.g
            public void accept(E e) {
                this.a.h(e);
            }
        }

        class c implements g<Throwable> {
            final /* synthetic */ t a;

            c(a aVar, t tVar) {
                this.a = tVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(Throwable th) {
                this.a.onError(new UnrecoverableIncomingException(th));
            }
        }

        class d implements f {
            final /* synthetic */ MobiusLoop a;
            final /* synthetic */ io.reactivex.disposables.b b;

            d(a aVar, MobiusLoop mobiusLoop, io.reactivex.disposables.b bVar) {
                this.a = mobiusLoop;
                this.b = bVar;
            }

            @Override // io.reactivex.functions.f
            public void cancel() {
                this.a.dispose();
                this.b.dispose();
            }
        }

        a(s sVar) {
            this.a = sVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.spotify.mobius.MobiusLoop$h */
        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: com.spotify.mobius.MobiusLoop$h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.u
        public void subscribe(t<M> tVar) {
            MobiusLoop mobiusLoop;
            if (n.this.c == null) {
                mobiusLoop = n.this.a.g(n.this.b);
            } else {
                mobiusLoop = n.this.a.a(n.this.b, n.this.c);
            }
            mobiusLoop.j(new C0205a(this, tVar));
            tVar.e(new d(this, mobiusLoop, this.a.subscribe(new b(this, mobiusLoop), new c(this, tVar))));
        }
    }

    n(MobiusLoop.h<M, E, F> hVar, M m, Set<F> set) {
        this.a = hVar;
        this.b = m;
        this.c = set;
    }

    @Override // io.reactivex.w
    public v<M> apply(s<E> sVar) {
        return s.y(new a(sVar));
    }
}
