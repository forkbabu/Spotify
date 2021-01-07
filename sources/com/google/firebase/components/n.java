package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public class n {
    private final d<?> a;
    private final Set<n> b = new HashSet();
    private final Set<n> c = new HashSet();

    n(d<?> dVar) {
        this.a = dVar;
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar) {
        this.b.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public void b(n nVar) {
        this.c.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public d<?> c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Set<n> d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void g(n nVar) {
        this.c.remove(nVar);
    }
}
