package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: hfa  reason: default package */
public class hfa implements ffa {
    private final Map<String, efa> a = new HashMap(1);

    @Override // defpackage.ffa
    public efa a(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new gfa());
        }
        return this.a.get(str);
    }
}
