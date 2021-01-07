package io.netty.util.internal.logging;

import io.netty.util.internal.ThreadLocalRandom;

public abstract class c {
    private static volatile c a;
    public static final /* synthetic */ int b = 0;

    static {
        g gVar;
        String name = c.class.getName();
        try {
            g gVar2 = new g(true);
            ((Slf4JLogger) gVar2.c(name)).p("Using SLF4J as the default logging framework");
            gVar = gVar2;
        } catch (Throwable unused) {
            c cVar = d.c;
            ((JdkLogger) cVar.c(name)).p("Using java.util.logging as the default logging framework");
            gVar = cVar;
        }
        a = gVar;
        try {
            Class.forName(ThreadLocalRandom.class.getName(), true, c.class.getClassLoader());
        } catch (Exception unused2) {
        }
    }

    public static b a(Class<?> cls) {
        return b(cls.getName());
    }

    public static b b(String str) {
        return a.c(str);
    }

    /* access modifiers changed from: protected */
    public abstract b c(String str);
}
