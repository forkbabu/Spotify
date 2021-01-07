package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class t extends a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final e f;

    private static class a implements q10 {
        private final q10 a;

        public a(Set<Class<?>> set, q10 q10) {
            this.a = q10;
        }
    }

    t(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (p pVar : dVar.b()) {
            if (pVar.b()) {
                if (pVar.d()) {
                    hashSet3.add(pVar.a());
                } else {
                    hashSet.add(pVar.a());
                }
            } else if (pVar.d()) {
                hashSet4.add(pVar.a());
            } else {
                hashSet2.add(pVar.a());
            }
        }
        if (!dVar.e().isEmpty()) {
            hashSet.add(q10.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.e();
        this.f = eVar;
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> a(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.a(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.e
    public <T> T get(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = (T) this.f.get(cls);
            return !cls.equals(q10.class) ? t : (T) new a(this.e, t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }
}
