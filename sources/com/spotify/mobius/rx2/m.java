package com.spotify.mobius.rx2;

import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.HashMap;
import java.util.Map;

public class m<F, E> {
    private final Map<Class<?>, w<F, E>> a = new HashMap();
    private c<w<? extends F, E>, g<Throwable>> b = new a(this);

    class a implements c<w<? extends F, E>, g<Throwable>> {
        a(m mVar) {
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            return new a((w) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements w<F, E> {
        final /* synthetic */ Class a;
        final /* synthetic */ w b;

        b(Class cls, w wVar) {
            this.a = cls;
            this.b = wVar;
        }

        @Override // io.reactivex.w
        public v apply(s sVar) {
            Class cls = this.a;
            if (cls != null) {
                return sVar.Q(Functions.h(cls)).h(cls).q(this.b).L((g) ((a) m.this.b).apply(this.b));
            }
            throw new NullPointerException("clazz is null");
        }
    }

    /* access modifiers changed from: private */
    public interface c<T, R> extends l<T, R> {
    }

    m(l lVar) {
    }

    public <G extends F> m<F, E> b(Class<G> cls, io.reactivex.functions.a aVar) {
        h(cls, new p(null, aVar));
        return this;
    }

    public <G extends F> m<F, E> c(Class<G> cls, io.reactivex.functions.a aVar, y yVar) {
        h(cls, new p(yVar, aVar));
        return this;
    }

    public <G extends F> m<F, E> d(Class<G> cls, g<G> gVar) {
        gVar.getClass();
        h(cls, new r(gVar, null));
        return this;
    }

    public <G extends F> m<F, E> e(Class<G> cls, g<G> gVar, y yVar) {
        gVar.getClass();
        h(cls, new r(gVar, yVar));
        return this;
    }

    public <G extends F> m<F, E> f(Class<G> cls, l<G, E> lVar) {
        h(cls, new t(lVar, null));
        return this;
    }

    public <G extends F> m<F, E> g(Class<G> cls, l<G, E> lVar, y yVar) {
        h(cls, new t(lVar, yVar));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <G extends F> com.spotify.mobius.rx2.m<F, E> h(java.lang.Class<G> r4, io.reactivex.w<G, E> r5) {
        /*
            r3 = this;
            r5.getClass()
            java.util.Map<java.lang.Class<?>, io.reactivex.w<F, E>> r0 = r3.a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isAssignableFrom(r4)
            if (r2 != 0) goto L_0x0026
            boolean r2 = r4.isAssignableFrom(r1)
            if (r2 != 0) goto L_0x0026
            goto L_0x000d
        L_0x0026:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Effect classes may not be assignable to each other, collision found: "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r4 = r4.getSimpleName()
            r0.append(r4)
            java.lang.String r4 = " <-> "
            r0.append(r4)
            java.lang.String r4 = r1.getSimpleName()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L_0x0049:
            java.util.Map<java.lang.Class<?>, io.reactivex.w<F, E>> r0 = r3.a
            com.spotify.mobius.rx2.m$b r1 = new com.spotify.mobius.rx2.m$b
            r1.<init>(r4, r5)
            r0.put(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.rx2.m.h(java.lang.Class, io.reactivex.w):com.spotify.mobius.rx2.m");
    }

    public w<F, E> i() {
        return new h(this.a.keySet(), this.a.values());
    }
}
