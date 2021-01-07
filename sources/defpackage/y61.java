package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: y61  reason: default package */
public final class y61 implements a71 {
    private final Map<String, a71> a;
    private final a71 b;

    y61(Map<String, a71> map, a71 a71) {
        this.a = ImmutableMap.copyOf(map);
        a71.getClass();
        this.b = a71;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        a71 a71 = this.a.get(o81.name());
        if (a71 != null) {
            a71.b(o81, n61);
        } else {
            this.b.b(o81, n61);
        }
    }
}
