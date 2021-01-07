package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o7e  reason: default package */
public final class o7e implements fjf<Map<Integer, l7e>> {
    private final wlf<Set<Map.Entry<Integer, l7e>>> a;

    public o7e(wlf<Set<Map.Entry<Integer, l7e>>> wlf) {
        this.a = wlf;
    }

    public static Map<Integer, l7e> a(Set<Map.Entry<Integer, l7e>> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, l7e> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
