package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: r6e  reason: default package */
public final class r6e implements fjf<Map<Integer, List<i6e>>> {
    private final wlf<Set<Map.Entry<Integer, List<i6e>>>> a;

    public r6e(wlf<Set<Map.Entry<Integer, List<i6e>>>> wlf) {
        this.a = wlf;
    }

    public static Map<Integer, List<i6e>> a(Set<Map.Entry<Integer, List<i6e>>> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Map.Entry<Integer, List<i6e>> entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
