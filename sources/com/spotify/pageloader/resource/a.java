package com.spotify.pageloader.resource;

import com.spotify.pageloader.c;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.o0;
import io.reactivex.functions.f;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import kotlin.jvm.internal.h;

public final class a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.pageloader.resource.a$a  reason: collision with other inner class name */
    public static final class C0359a<T> implements u<l0<R>> {
        final /* synthetic */ LoadableResource a;

        /* renamed from: com.spotify.pageloader.resource.a$a$a  reason: collision with other inner class name */
        static final class C0360a implements f {
            final /* synthetic */ C0359a a;

            C0360a(C0359a aVar) {
                this.a = aVar;
            }

            @Override // io.reactivex.functions.f
            public final void cancel() {
                this.a.a.g();
            }
        }

        /* renamed from: com.spotify.pageloader.resource.a$a$b */
        static final class b<T> implements qg0<l0<LoadableResource>> {
            final /* synthetic */ t a;

            b(t tVar) {
                this.a = tVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.qg0
            public void accept(l0<LoadableResource> l0Var) {
                l0<LoadableResource> l0Var2 = l0Var;
                t tVar = this.a;
                if (l0Var2 != null) {
                    tVar.onNext(l0Var2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.pageloader.LoadState<R>");
            }
        }

        C0359a(LoadableResource loadableResource) {
            this.a = loadableResource;
        }

        @Override // io.reactivex.u
        public final void subscribe(t<l0<R>> tVar) {
            h.e(tVar, "emitter");
            tVar.e(new C0360a(this));
            this.a.f(new b(tVar));
        }
    }

    public static final <R extends LoadableResource> o0<R> a(R r) {
        h.e(r, "$this$asLoadable");
        c cVar = new c(s.y(new C0359a(r)));
        h.d(cVar, "Loadable.from(\n        O…        )\n        }\n    )");
        return cVar;
    }
}
