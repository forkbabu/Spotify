package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: v9e  reason: default package */
public final class v9e implements fjf<Map<Integer, w9e>> {
    private final wlf<Set<Map.Entry<Integer, w9e>>> a;

    public v9e(wlf<Set<Map.Entry<Integer, w9e>>> wlf) {
        this.a = wlf;
    }

    public static Map<Integer, w9e> a(Set<Map.Entry<Integer, w9e>> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, w9e> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
