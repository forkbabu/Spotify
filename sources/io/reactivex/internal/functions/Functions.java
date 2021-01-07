package io.reactivex.internal.functions;

import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public final class Functions {
    static final io.reactivex.functions.l<Object, Object> a = new o();
    public static final Runnable b = new n();
    public static final io.reactivex.functions.a c = new k();
    static final io.reactivex.functions.g<Object> d = new l();
    public static final io.reactivex.functions.g<Throwable> e = new r();
    public static final io.reactivex.functions.m f = new m();
    static final io.reactivex.functions.n<Object> g = new t();

    enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Set<Object> call() {
            return new HashSet();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements io.reactivex.functions.g<T> {
        final io.reactivex.functions.a a;

        a(io.reactivex.functions.a aVar) {
            this.a = aVar;
        }

        @Override // io.reactivex.functions.g
        public void accept(T t) {
            this.a.run();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, R> implements io.reactivex.functions.l<Object[], R> {
        final io.reactivex.functions.c<? super T1, ? super T2, ? extends R> a;

        b(io.reactivex.functions.c<? super T1, ? super T2, ? extends R> cVar) {
            this.a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.a.a(objArr2[0], objArr2[1]);
            }
            StringBuilder V0 = je.V0("Array of size 2 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T1, T2, T3, R> implements io.reactivex.functions.l<Object[], R> {
        final io.reactivex.functions.h<T1, T2, T3, R> a;

        c(io.reactivex.functions.h<T1, T2, T3, R> hVar) {
            this.a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.functions.h<T1, T2, T3, R> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 3) {
                return this.a.a(objArr2[0], objArr2[1], objArr2[2]);
            }
            StringBuilder V0 = je.V0("Array of size 3 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T1, T2, T3, T4, R> implements io.reactivex.functions.l<Object[], R> {
        final io.reactivex.functions.i<T1, T2, T3, T4, R> a;

        d(io.reactivex.functions.i<T1, T2, T3, T4, R> iVar) {
            this.a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: io.reactivex.functions.i<T1, T2, T3, T4, R> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 4) {
                return this.a.a(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
            }
            StringBuilder V0 = je.V0("Array of size 4 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T1, T2, T3, T4, T5, R> implements io.reactivex.functions.l<Object[], R> {
        private final io.reactivex.functions.j<T1, T2, T3, T4, T5, R> a;

        e(io.reactivex.functions.j<T1, T2, T3, T4, T5, R> jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.reactivex.functions.j<T1, T2, T3, T4, T5, R> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 5) {
                return this.a.a(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
            }
            StringBuilder V0 = je.V0("Array of size 5 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    static final class f<T1, T2, T3, T4, T5, T6, T7, R> implements io.reactivex.functions.l<Object[], R> {
        final com.spotify.music.libs.mediabrowserservice.k<T1, T2, T3, T4, T5, T6, T7, R> a;

        f(com.spotify.music.libs.mediabrowserservice.k<T1, T2, T3, T4, T5, T6, T7, R> kVar) {
            this.a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 7) {
                com.spotify.music.libs.mediabrowserservice.k<T1, T2, T3, T4, T5, T6, T7, R> kVar = this.a;
                return kVar.a.c(kVar.b, (PlayerState) objArr2[0], (PlayerQueue) objArr2[1], (Boolean) objArr2[2], (Integer) objArr2[3], (lk1) objArr2[4], (Boolean) objArr2[5], (Boolean) objArr2[6]);
            }
            StringBuilder V0 = je.V0("Array of size 7 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T1, T2, T3, T4, T5, T6, T7, T8, R> implements io.reactivex.functions.l<Object[], R> {
        final io.reactivex.functions.k<T1, T2, T3, T4, T5, T6, T7, T8, R> a;

        g(io.reactivex.functions.k<T1, T2, T3, T4, T5, T6, T7, T8, R> kVar) {
            this.a = kVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 8) {
                return ((com.spotify.music.features.settings.d) this.a).a(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6], objArr2[7]);
            }
            StringBuilder V0 = je.V0("Array of size 8 expected but got ");
            V0.append(objArr2.length);
            throw new IllegalArgumentException(V0.toString());
        }
    }

    static final class h<T> implements Callable<List<T>> {
        final int a;

        h(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new ArrayList(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T, U> implements io.reactivex.functions.l<T, U> {
        final Class<U> a;

        i(Class<U> cls) {
            this.a = cls;
        }

        @Override // io.reactivex.functions.l
        public U apply(T t) {
            return this.a.cast(t);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T, U> implements io.reactivex.functions.n<T> {
        final Class<U> a;

        j(Class<U> cls) {
            this.a = cls;
        }

        @Override // io.reactivex.functions.n
        public boolean test(T t) {
            return this.a.isInstance(t);
        }
    }

    static final class k implements io.reactivex.functions.a {
        k() {
        }

        @Override // io.reactivex.functions.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    static final class l implements io.reactivex.functions.g<Object> {
        l() {
        }

        @Override // io.reactivex.functions.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    static final class m implements io.reactivex.functions.m {
        m() {
        }

        @Override // io.reactivex.functions.m
        public void a(long j) {
        }
    }

    static final class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // java.lang.Object
        public String toString() {
            return "EmptyRunnable";
        }
    }

    static final class o implements io.reactivex.functions.l<Object, Object> {
        o() {
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T, U> implements Callable<U>, io.reactivex.functions.l<T, U> {
        final U a;

        p(U u) {
            this.a = u;
        }

        @Override // io.reactivex.functions.l
        public U apply(T t) {
            return this.a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.a;
        }
    }

    static final class q<T> implements io.reactivex.functions.l<List<T>, List<T>> {
        final Comparator<? super T> a;

        q(Comparator<? super T> comparator) {
            this.a = comparator;
        }

        @Override // io.reactivex.functions.l
        public Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, this.a);
            return list;
        }
    }

    static final class r implements io.reactivex.functions.g<Throwable> {
        r() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            io.reactivex.plugins.a.g(new OnErrorNotImplementedException(th));
        }
    }

    static final class s<K, V, T> implements io.reactivex.functions.b<Map<K, V>, T> {
        private final io.reactivex.functions.l<? super T, ? extends V> a;
        private final io.reactivex.functions.l<? super T, ? extends K> b;

        s(io.reactivex.functions.l<? super T, ? extends V> lVar, io.reactivex.functions.l<? super T, ? extends K> lVar2) {
            this.a = lVar;
            this.b = lVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.Map */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.b
        public void a(Object obj, Object obj2) {
            ((Map) obj).put(this.b.apply(obj2), this.a.apply(obj2));
        }
    }

    static final class t implements io.reactivex.functions.n<Object> {
        t() {
        }

        @Override // io.reactivex.functions.n
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> io.reactivex.functions.g<T> a(io.reactivex.functions.a aVar) {
        return new a(aVar);
    }

    public static <T> io.reactivex.functions.n<T> b() {
        return (io.reactivex.functions.n<T>) g;
    }

    public static <T, U> io.reactivex.functions.l<T, U> c(Class<U> cls) {
        return new i(cls);
    }

    public static <T> Callable<List<T>> d(int i2) {
        return new h(i2);
    }

    public static <T> Callable<Set<T>> e() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> io.reactivex.functions.g<T> f() {
        return (io.reactivex.functions.g<T>) d;
    }

    public static <T> io.reactivex.functions.l<T, T> g() {
        return (io.reactivex.functions.l<T, T>) a;
    }

    public static <T, U> io.reactivex.functions.n<T> h(Class<U> cls) {
        return new j(cls);
    }

    public static <T> Callable<T> i(T t2) {
        return new p(t2);
    }

    public static <T, U> io.reactivex.functions.l<T, U> j(U u) {
        return new p(u);
    }

    public static <T> io.reactivex.functions.l<List<T>, List<T>> k(Comparator<? super T> comparator) {
        return new q(comparator);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.functions.l<Object[], R> l(com.spotify.music.libs.mediabrowserservice.k<T1, T2, T3, T4, T5, T6, T7, R> kVar) {
        if (kVar != null) {
            return new f(kVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T1, T2, R> io.reactivex.functions.l<Object[], R> m(io.reactivex.functions.c<? super T1, ? super T2, ? extends R> cVar) {
        if (cVar != null) {
            return new b(cVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T1, T2, T3, R> io.reactivex.functions.l<Object[], R> n(io.reactivex.functions.h<T1, T2, T3, R> hVar) {
        if (hVar != null) {
            return new c(hVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T1, T2, T3, T4, R> io.reactivex.functions.l<Object[], R> o(io.reactivex.functions.i<T1, T2, T3, T4, R> iVar) {
        if (iVar != null) {
            return new d(iVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T1, T2, T3, T4, T5, R> io.reactivex.functions.l<Object[], R> p(io.reactivex.functions.j<T1, T2, T3, T4, T5, R> jVar) {
        if (jVar != null) {
            return new e(jVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.functions.l<Object[], R> q(io.reactivex.functions.k<T1, T2, T3, T4, T5, T6, T7, T8, R> kVar) {
        if (kVar != null) {
            return new g(kVar);
        }
        throw new NullPointerException("f is null");
    }

    public static <T, K, V> io.reactivex.functions.b<Map<K, V>, T> r(io.reactivex.functions.l<? super T, ? extends K> lVar, io.reactivex.functions.l<? super T, ? extends V> lVar2) {
        return new s(lVar2, lVar);
    }
}
