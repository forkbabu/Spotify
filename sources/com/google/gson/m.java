package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m extends p implements Iterable<p> {
    private final List<p> a = new ArrayList();

    @Override // com.google.gson.p
    public String e() {
        if (this.a.size() == 1) {
            return this.a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).a.equals(this.a));
    }

    public void f(p pVar) {
        if (pVar == null) {
            pVar = q.a;
        }
        this.a.add(pVar);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<p> iterator() {
        return this.a.iterator();
    }
}
