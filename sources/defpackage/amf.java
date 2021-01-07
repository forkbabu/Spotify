package defpackage;

import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: amf  reason: default package */
public final class amf {
    public static final zlf a;

    static {
        zlf zlf;
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int k = e.k(property, '.', 0, false, 6, null);
            if (k < 0) {
                try {
                    i = Integer.parseInt(property) * 65536;
                } catch (NumberFormatException unused) {
                }
            } else {
                int i2 = k + 1;
                int k2 = e.k(property, '.', i2, false, 4, null);
                if (k2 < 0) {
                    k2 = property.length();
                }
                String substring = property.substring(0, k);
                h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = property.substring(i2, k2);
                h.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            }
        }
        if (i >= 65544) {
            try {
                Object newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                h.d(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    zlf = (zlf) newInstance;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = zlf.class.getClassLoader();
                    Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                    h.d(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause;
                }
            } catch (ClassNotFoundException unused2) {
                try {
                    Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    h.d(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        zlf = (zlf) newInstance2;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = zlf.class.getClassLoader();
                        Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                        h.d(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause2;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            a = zlf;
        }
        if (i >= 65543) {
            try {
                Object newInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                h.d(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    zlf = (zlf) newInstance3;
                    a = zlf;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader6 = zlf.class.getClassLoader();
                    Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                    h.d(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause3;
                }
            } catch (ClassNotFoundException unused4) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    h.d(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        zlf = (zlf) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = zlf.class.getClassLoader();
                        Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                        h.d(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause4;
                    }
                } catch (ClassNotFoundException unused5) {
                }
            }
        }
        zlf = new zlf();
        a = zlf;
    }
}
