package defpackage;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.b;
import com.facebook.k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: uf  reason: default package */
public class uf {
    private static final Set<Object> a = Collections.newSetFromMap(new WeakHashMap());
    private static boolean b = false;

    public static void a() {
        b = true;
    }

    public static void b(Throwable th, Object obj) {
        if (b) {
            a.add(obj);
            if (k.g()) {
                b.b(th);
                InstrumentData.b.a(th, InstrumentData.Type.CrashShield).d();
            }
        }
    }

    public static boolean c(Object obj) {
        return a.contains(obj);
    }
}
