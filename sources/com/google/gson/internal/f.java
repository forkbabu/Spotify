package com.google.gson.internal;

import com.google.gson.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class f {
    private final Map<Type, l<?>> a;
    private final x20 b = x20.a();

    class a implements q<T> {
        final /* synthetic */ l a;
        final /* synthetic */ Type b;

        a(f fVar, l lVar, Type type) {
            this.a = lVar;
            this.b = type;
        }

        @Override // com.google.gson.internal.q
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    class b implements q<T> {
        final /* synthetic */ l a;
        final /* synthetic */ Type b;

        b(f fVar, l lVar, Type type) {
            this.a = lVar;
            this.b = type;
        }

        @Override // com.google.gson.internal.q
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    public f(Map<Type, l<?>> map) {
        this.a = map;
    }

    public <T> q<T> a(z20<T> z20) {
        g gVar;
        Type d = z20.d();
        Class<? super T> c = z20.c();
        l<?> lVar = this.a.get(d);
        if (lVar != null) {
            return new a(this, lVar, d);
        }
        l<?> lVar2 = this.a.get(c);
        if (lVar2 != null) {
            return new b(this, lVar2, d);
        }
        q<T> qVar = null;
        try {
            Constructor<? super T> declaredConstructor = c.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            gVar = new g(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        if (Collection.class.isAssignableFrom(c)) {
            if (SortedSet.class.isAssignableFrom(c)) {
                qVar = new h(this);
            } else if (EnumSet.class.isAssignableFrom(c)) {
                qVar = new i(this, d);
            } else if (Set.class.isAssignableFrom(c)) {
                qVar = new j(this);
            } else if (Queue.class.isAssignableFrom(c)) {
                qVar = new k(this);
            } else {
                qVar = new l(this);
            }
        } else if (Map.class.isAssignableFrom(c)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(c)) {
                qVar = new m(this);
            } else if (ConcurrentMap.class.isAssignableFrom(c)) {
                qVar = new a(this);
            } else if (SortedMap.class.isAssignableFrom(c)) {
                qVar = new b(this);
            } else if (!(d instanceof ParameterizedType) || String.class.isAssignableFrom(z20.b(((ParameterizedType) d).getActualTypeArguments()[0]).c())) {
                qVar = new d(this);
            } else {
                qVar = new c(this);
            }
        }
        if (qVar != null) {
            return qVar;
        }
        return new e(this, c, d);
    }

    public String toString() {
        return this.a.toString();
    }
}
