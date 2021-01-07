package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d<T> {
    private final Set<Class<? super T>> a;
    private final Set<p> b;
    private final int c;
    private final int d;
    private final g<T> e;
    private final Set<Class<?>> f;

    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<p> b = new HashSet();
        private int c;
        private int d;
        private g<T> e;
        private Set<Class<?>> f;

        b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            if (cls != null) {
                hashSet.add(cls);
                for (Class cls2 : clsArr) {
                    rw.e(cls2, "Null interface");
                }
                Collections.addAll(this.a, clsArr);
                return;
            }
            throw new NullPointerException("Null interface");
        }

        static b a(b bVar) {
            bVar.d = 1;
            return bVar;
        }

        private b<T> g(int i) {
            if (this.c == 0) {
                this.c = i;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public b<T> b(p pVar) {
            if (!this.a.contains(pVar.a())) {
                this.b.add(pVar);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> c() {
            g(1);
            return this;
        }

        public d<T> d() {
            if (this.e != null) {
                return new d<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> e() {
            g(2);
            return this;
        }

        public b<T> f(g<T> gVar) {
            this.e = gVar;
            return this;
        }
    }

    d(Set set, Set set2, int i, int i2, g gVar, Set set3, a aVar) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = i2;
        this.e = gVar;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0], null);
    }

    public static <T> d<T> f(T t, Class<T> cls) {
        b a2 = a(cls);
        b.a(a2);
        a2.f(c.b(t));
        return a2.d();
    }

    @SafeVarargs
    public static <T> d<T> j(T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, null);
        bVar.f(b.b(t));
        return bVar.d();
    }

    public Set<p> b() {
        return this.b;
    }

    public g<T> c() {
        return this.e;
    }

    public Set<Class<? super T>> d() {
        return this.a;
    }

    public Set<Class<?>> e() {
        return this.f;
    }

    public boolean g() {
        return this.c == 1;
    }

    public boolean h() {
        return this.c == 2;
    }

    public boolean i() {
        return this.d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
