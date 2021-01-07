package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nk9  reason: default package */
public class nk9 implements u51, v51 {
    private final Map<Integer, pk9<?>> a;
    private final Map<String, Integer> b;

    nk9(Map<String, pk9<?>> map) {
        HashMap hashMap = new HashMap(map.size());
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Map.Entry<String, pk9<?>> entry : map.entrySet()) {
            pk9<?> value = entry.getValue();
            int d = value.d();
            pk9 pk9 = (pk9) hashMap.get(Integer.valueOf(d));
            if (pk9 == null || pk9.getClass().equals(value.getClass())) {
                hashMap.put(Integer.valueOf(d), value);
                builder.mo51put(entry.getKey(), Integer.valueOf(d));
            } else {
                throw new IllegalArgumentException("Multiple entries with the same key: " + d + " = " + pk9);
            }
        }
        this.a = ImmutableMap.copyOf(hashMap);
        this.b = builder.build();
    }

    @Override // defpackage.u51
    public s51<?> a(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        Integer num = this.b.get(s81.componentId().id());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
