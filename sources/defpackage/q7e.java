package defpackage;

import java.util.Map;

/* renamed from: q7e  reason: default package */
public class q7e {
    private final Map<Integer, l7e> a;
    private final s7e b;

    public q7e(Map<Integer, l7e> map, s7e s7e) {
        this.a = map;
        this.b = s7e;
    }

    public boolean a(o8e o8e) {
        l7e l7e = this.a.get(Integer.valueOf(o8e.id()));
        if (l7e != null) {
            return l7e.a(this.b, o8e);
        }
        return true;
    }
}
