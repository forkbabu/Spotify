package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y10  reason: default package */
public class y10 {
    private static volatile y10 b;
    private final Set<z10> a = new HashSet();

    y10() {
    }

    public static y10 a() {
        y10 y10 = b;
        if (y10 == null) {
            synchronized (y10.class) {
                y10 = b;
                if (y10 == null) {
                    y10 = new y10();
                    b = y10;
                }
            }
        }
        return y10;
    }

    /* access modifiers changed from: package-private */
    public Set<z10> b() {
        Set<z10> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
