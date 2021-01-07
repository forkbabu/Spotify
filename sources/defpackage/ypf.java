package defpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.a;
import org.slf4j.helpers.b;
import org.slf4j.helpers.c;
import org.slf4j.helpers.d;

/* renamed from: ypf  reason: default package */
public final class ypf {
    static volatile int a;
    static final c b = new c();
    static final a c = new a();
    static boolean d;
    private static final String[] e = {"1.6", "1.7"};
    private static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    static {
        boolean z;
        String str = null;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        if (str == null) {
            z = false;
        } else {
            z = str.equalsIgnoreCase("true");
        }
        d = z;
    }

    private ypf() {
    }

    static Set<URL> a() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = ypf.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f);
            } else {
                enumeration = classLoader.getResources(f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e2) {
            d.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static void b() {
        c cVar = b;
        synchronized (cVar) {
            cVar.e();
            Iterator it = ((ArrayList) cVar.d()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                bVar.C(e(bVar.getName()));
            }
        }
    }

    public static wpf c() {
        if (a == 0) {
            synchronized (ypf.class) {
                if (a == 0) {
                    a = 1;
                    g();
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return zpf.c().a();
        } else {
            if (i == 4) {
                return c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    public static xpf d(Class<?> cls) {
        Class<?> a2;
        xpf e2 = e(cls.getName());
        if (d && (a2 = d.a()) != null && (!a2.isAssignableFrom(cls))) {
            d.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", e2.getName(), a2.getName()));
            d.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return e2;
    }

    public static xpf e(String str) {
        return c().a(str);
    }

    private static boolean f() {
        String str;
        try {
            str = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        return str.toLowerCase().contains("android");
    }

    private static final void g() {
        Set<URL> set = null;
        try {
            if (!f()) {
                set = a();
                j(set);
            }
            zpf.c();
            a = 3;
            i(set);
            b();
            h();
            b.b();
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                a = 4;
                d.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                d.b("Defaulting to no-operation (NOP) logger implementation");
                d.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } else {
                a = 2;
                d.c("Failed to instantiate SLF4J LoggerFactory", e2);
                throw e2;
            }
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                a = 2;
                d.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                d.b("Your binding is version 1.5.5 or earlier.");
                d.b("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        } catch (Exception e4) {
            a = 2;
            d.c("Failed to instantiate SLF4J LoggerFactory", e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        }
        if (a == 3) {
            try {
                String str = zpf.d;
                boolean z = false;
                for (String str2 : e) {
                    if (str.startsWith(str2)) {
                        z = true;
                    }
                }
                if (!z) {
                    d.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
                    d.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                }
            } catch (NoSuchFieldError unused) {
            } catch (Throwable th) {
                d.c("Unexpected problem occured during version sanity check", th);
            }
        }
    }

    private static void h() {
        LinkedBlockingQueue<org.slf4j.event.c> c2 = b.c();
        int size = c2.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (c2.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                org.slf4j.event.c cVar = (org.slf4j.event.c) it.next();
                if (cVar != null) {
                    b a2 = cVar.a();
                    String name = a2.getName();
                    if (a2.A()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    } else if (!a2.z()) {
                        if (a2.y()) {
                            a2.B(cVar);
                        } else {
                            d.b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (cVar.a().y()) {
                        d.b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        d.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        d.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!cVar.a().z()) {
                        d.b("The following set of substitute loggers may have been accessed");
                        d.b("during the initialization phase. Logging calls during this");
                        d.b("phase were not honored. However, subsequent logging calls to these");
                        d.b("loggers will work as normally expected.");
                        d.b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    private static void i(Set<URL> set) {
        if (set != null) {
            boolean z = true;
            if (set.size() <= 1) {
                z = false;
            }
            if (z) {
                StringBuilder V0 = je.V0("Actual binding is of type [");
                V0.append(zpf.c().b());
                V0.append("]");
                d.b(V0.toString());
            }
        }
    }

    private static void j(Set<URL> set) {
        boolean z = true;
        if (set.size() <= 1) {
            z = false;
        }
        if (z) {
            d.b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                d.b("Found binding in [" + it.next() + "]");
            }
            d.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
