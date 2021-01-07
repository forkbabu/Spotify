package com.spotify.mobile.android.storytelling.common;

import com.spotify.mobile.android.storytelling.common.g;
import defpackage.fx1;
import defpackage.lx1;
import io.reactivex.a0;
import io.reactivex.c0;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class b {
    private List<? extends cmf<lx1>> a = EmptyList.a;
    private List<g> b = new ArrayList();
    private final cmf<fx1> c;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements c0<Integer> {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // io.reactivex.c0
        public final void subscribe(a0<Integer> a0Var) {
            h.e(a0Var, "emitter");
            List list = this.a.a;
            if (!list.isEmpty()) {
                a0Var.onSuccess(Integer.valueOf(list.size()));
                return;
            }
            try {
                fx1 fx1 = (fx1) this.a.c.invoke();
                if (fx1 instanceof fx1.a) {
                    b bVar = this.a;
                    IllegalStateException illegalStateException = new IllegalStateException("Can't load stories");
                    bVar.getClass();
                    if (!a0Var.d()) {
                        a0Var.onError(illegalStateException);
                    }
                } else if (fx1 instanceof fx1.b) {
                    this.a.a = ((fx1.b) fx1).a();
                    b bVar2 = this.a;
                    int size = ((fx1.b) fx1).a().size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add(g.b.a);
                    }
                    bVar2.b = arrayList;
                    a0Var.onSuccess(Integer.valueOf(((fx1.b) fx1).a().size()));
                }
            } catch (InterruptedException e) {
                this.a.getClass();
                if (!a0Var.d()) {
                    a0Var.onError(e);
                }
            }
        }
    }

    /* renamed from: com.spotify.mobile.android.storytelling.common.b$b  reason: collision with other inner class name */
    static final class C0197b<T> implements c0<hx1> {
        final /* synthetic */ b a;
        final /* synthetic */ int b;

        C0197b(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        @Override // io.reactivex.c0
        public final void subscribe(a0<hx1> a0Var) {
            h.e(a0Var, "emitter");
            g h = this.a.h(this.b);
            if (h instanceof g.a) {
                a0Var.onSuccess(((g.a) h).a());
            } else {
                b.c(this.a, this.b, a0Var);
            }
        }
    }

    public b(cmf<fx1> cmf) {
        h.e(cmf, "storiesLoader");
        this.c = cmf;
    }

    public static final void c(b bVar, int i, a0 a0Var) {
        bVar.getClass();
        if (i >= 0) {
            try {
                if (i < bVar.a.size()) {
                    lx1 lx1 = (lx1) ((cmf) bVar.a.get(i)).invoke();
                    if (lx1 instanceof lx1.a) {
                        IllegalStateException illegalStateException = new IllegalStateException("Can't load story " + i);
                        if (!a0Var.d()) {
                            a0Var.onError(illegalStateException);
                            return;
                        }
                        return;
                    } else if (lx1 instanceof lx1.b) {
                        bVar.b.set(i, new g.a(((lx1.b) lx1).a()));
                        a0Var.onSuccess(((lx1.b) lx1).a());
                        return;
                    } else {
                        return;
                    }
                }
            } catch (InterruptedException e) {
                if (!a0Var.d()) {
                    a0Var.onError(e);
                    return;
                }
                return;
            }
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Story request before cache is initialized: " + i);
        if (!a0Var.d()) {
            a0Var.onError(illegalStateException2);
        }
    }

    public final z<Integer> f() {
        z<Integer> g = z.g(new a(this));
        h.d(g, "Single.create { emitter …        }\n        }\n    }");
        return g;
    }

    public final z<hx1> g(int i) {
        z<hx1> g = z.g(new C0197b(this, i));
        h.d(g, "Single.create { emitter … emitter)\n        }\n    }");
        return g;
    }

    public final g h(int i) {
        if (i < 0 || i >= this.b.size()) {
            return g.b.a;
        }
        return this.b.get(i);
    }
}
