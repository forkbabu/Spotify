package defpackage;

import java.util.Map;

/* renamed from: g3e  reason: default package */
public class g3e implements f3e {
    private final Map<Integer, x2e> a;
    private final k3e b;

    public g3e(Map<Integer, x2e> map, k3e k3e) {
        this.a = map;
        this.b = k3e;
    }

    @Override // defpackage.f3e
    public boolean a(o8e o8e) {
        x2e x2e = this.a.get(Integer.valueOf(o8e.id()));
        if (x2e != null) {
            return x2e.a(o8e);
        }
        return this.b.a(o8e);
    }
}
