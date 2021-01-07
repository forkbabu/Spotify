package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: y2e  reason: default package */
public final class y2e implements fjf<Map<Integer, x2e>> {
    private final wlf<Set<Map.Entry<Integer, x2e>>> a;

    public y2e(wlf<Set<Map.Entry<Integer, x2e>>> wlf) {
        this.a = wlf;
    }

    public static Map<Integer, x2e> a(Set<Map.Entry<Integer, x2e>> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, x2e> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
