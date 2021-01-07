package io.netty.util;

import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;

public final class n {
    private static final b a = c.b(n.class.getName());
    public static final /* synthetic */ int b = 0;

    static {
        int i = c.b;
    }

    private n() {
    }

    public static boolean a(Object obj) {
        if (obj instanceof o) {
            return ((o) obj).d();
        }
        return false;
    }

    public static void b(Object obj) {
        try {
            a(obj);
        } catch (Throwable th) {
            a.g("Failed to release a message: {}", obj, th);
        }
    }
}
