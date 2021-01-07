package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: v1d  reason: default package */
public final class v1d implements fjf<Map<Integer, p1d>> {
    private final wlf<Set<Map.Entry<Integer, p1d>>> a;

    public v1d(wlf<Set<Map.Entry<Integer, p1d>>> wlf) {
        this.a = wlf;
    }

    public static Map<Integer, p1d> a(Set<Map.Entry<Integer, p1d>> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, p1d> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
