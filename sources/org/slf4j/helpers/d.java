package org.slf4j.helpers;

import java.io.PrintStream;

public final class d {
    private static b a = null;
    private static boolean b = false;

    /* access modifiers changed from: private */
    public static final class b extends SecurityManager {
        b(a aVar) {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private d() {
    }

    public static Class<?> a() {
        int i;
        b bVar = a;
        if (bVar == null) {
            if (b) {
                bVar = null;
            } else {
                try {
                    bVar = new b(null);
                } catch (SecurityException unused) {
                    bVar = null;
                }
                a = bVar;
                b = true;
            }
        }
        if (bVar == null) {
            return null;
        }
        Class<?>[] classContext = bVar.getClassContext();
        String name = d.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    public static final void b(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }

    public static final void c(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
