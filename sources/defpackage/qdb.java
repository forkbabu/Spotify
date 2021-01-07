package defpackage;

import java.util.Map;
import kotlin.jvm.internal.f;

/* renamed from: qdb  reason: default package */
public final class qdb {
    private final Map<Integer, Integer> a;

    public qdb(Map map, f fVar) {
        this.a = map;
    }

    public final int a(int i) {
        Map<Integer, Integer> map;
        if (i < 0 || (map = this.a) == null) {
            return 0;
        }
        int i2 = map.get(Integer.valueOf(i));
        if (i2 == null) {
            i2 = 0;
        }
        return i2.intValue();
    }
}
