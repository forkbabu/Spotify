package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: r0e  reason: default package */
public abstract class r0e implements s0e {
    public static r0e b(List<String> list) {
        h.f(list, "values");
        return new q0e(list);
    }

    @Override // defpackage.s0e
    public boolean a(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return c().contains(obj.toString());
    }

    public abstract List<String> c();
}
