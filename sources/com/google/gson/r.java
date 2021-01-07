package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

public final class r extends p {
    private final LinkedTreeMap<String, p> a = new LinkedTreeMap<>();

    public Set<Map.Entry<String, p>> entrySet() {
        return this.a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof r) && ((r) obj).a.equals(this.a));
    }

    public void f(String str, p pVar) {
        LinkedTreeMap<String, p> linkedTreeMap = this.a;
        if (pVar == null) {
            pVar = q.a;
        }
        linkedTreeMap.put(str, pVar);
    }

    public p h(String str) {
        return this.a.get(str);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
