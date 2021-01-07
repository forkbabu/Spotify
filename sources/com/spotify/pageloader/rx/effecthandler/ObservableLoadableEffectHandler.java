package com.spotify.pageloader.rx.effecthandler;

import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.x0;
import com.spotify.rxjava2.p;
import defpackage.jud;
import io.reactivex.f;
import io.reactivex.internal.operators.observable.d0;
import io.reactivex.s;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

public final class ObservableLoadableEffectHandler<T> implements g<jud<? extends T, ? extends f<T>>, kud<? extends T, ? extends f<T>>> {
    private final s<T> a;
    private final EmitterStore<T> b;
    private final f<l0<s<T>>> c;

    public static final class a implements h<jud<? extends T, ? extends f<T>>> {
        private final p a = new p();
        final /* synthetic */ ObservableLoadableEffectHandler b;
        final /* synthetic */ ObservableLoadableEffectHandler$connect$1 c;
        final /* synthetic */ da2 d;
        final /* synthetic */ cmf e;

        a(ObservableLoadableEffectHandler observableLoadableEffectHandler, ObservableLoadableEffectHandler$connect$1 observableLoadableEffectHandler$connect$1, da2 da2, cmf cmf) {
            this.b = observableLoadableEffectHandler;
            this.c = observableLoadableEffectHandler$connect$1;
            this.d = da2;
            this.e = cmf;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: io.reactivex.f */
        /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: io.reactivex.f */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            jud jud = (jud) obj;
            kotlin.jvm.internal.h.e(jud, "effect");
            if (jud instanceof jud.a) {
                this.b.c.onNext(this.c.invoke(((jud.a) jud).a()));
            } else if (jud instanceof jud.b) {
                jud.b bVar = (jud.b) jud;
                this.b.b.d(bVar.a());
                this.b.c.onNext(this.c.invoke(bVar.b()));
            } else if (jud instanceof jud.d) {
                jud.d dVar = (jud.d) jud;
                Iterator<T> it = dVar.a().iterator();
                while (it.hasNext()) {
                    x0.a((f) dVar.b(), it.next());
                }
            } else if (jud instanceof jud.c) {
                this.b.b.d(((jud.c) jud).a());
            } else if (jud instanceof jud.e) {
                p pVar = this.a;
                s sVar = this.b.a;
                sVar.getClass();
                pVar.b(new d0(sVar).subscribe(new a(this)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.a();
            this.e.invoke();
        }
    }

    public ObservableLoadableEffectHandler(s<T> sVar, EmitterStore<T> emitterStore, f<l0<s<T>>> fVar) {
        kotlin.jvm.internal.h.e(sVar, "source");
        kotlin.jvm.internal.h.e(emitterStore, "emitterStore");
        kotlin.jvm.internal.h.e(fVar, "loadStateEmitter");
        this.a = sVar;
        this.b = emitterStore;
        this.c = fVar;
    }

    @Override // com.spotify.mobius.g
    public h<jud<T, f<T>>> t(da2<kud<T, f<T>>> da2) {
        kotlin.jvm.internal.h.e(da2, "dispatchEvent");
        return new a(this, new ObservableLoadableEffectHandler$connect$1(this), da2, this.b.f(new ObservableLoadableEffectHandler$connect$removeObserver$1(da2)));
    }
}
