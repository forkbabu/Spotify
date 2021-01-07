package io.netty.util.internal;

import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.lang.reflect.Method;
import java.security.AccessController;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import sun.misc.Unsafe;

public final class f {
    private static final b a = c.b(f.class.getName());
    private static final ClassPool b;

    static {
        int i = c.b;
        ClassPool classPool = new ClassPool(true);
        b = classPool;
        classPool.appendClassPath(new ClassClassPath(l.class));
    }

    private f() {
    }

    public static t a(Class<?> cls) {
        ClassLoader classLoader;
        boolean z = PlatformDependent.q;
        Unsafe unsafe = n.b;
        if (System.getSecurityManager() == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        } else {
            classLoader = (ClassLoader) AccessController.doPrivileged(new p());
        }
        if (classLoader == null) {
            classLoader = PlatformDependent.x();
        }
        return b(cls, classLoader);
    }

    public static t b(Class<?> cls, ClassLoader classLoader) {
        String c = c(cls);
        String y0 = je.y0("io.netty.util.internal.__matchers__.", c, "Matcher");
        try {
            return (t) Class.forName(y0, true, classLoader).newInstance();
        } catch (Exception unused) {
            try {
                CtClass andRename = b.getAndRename(l.class.getName(), y0);
                andRename.setModifiers(andRename.getModifiers() | 16);
                CtMethod declaredMethod = andRename.getDeclaredMethod("match");
                declaredMethod.setBody("{ return $1 instanceof " + c + "; }");
                byte[] bytecode = andRename.toBytecode();
                andRename.detach();
                Class cls2 = Integer.TYPE;
                Method declaredMethod2 = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls2, cls2);
                declaredMethod2.setAccessible(true);
                Class cls3 = (Class) declaredMethod2.invoke(classLoader, y0, bytecode, 0, Integer.valueOf(bytecode.length));
                if (cls != Object.class) {
                    a.r("Generated: {}", cls3.getName());
                }
                return (t) cls3.newInstance();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private static String c(Class<?> cls) {
        if (cls.isArray()) {
            return je.I0(new StringBuilder(), c(cls.getComponentType()), "[]");
        }
        return cls.getName();
    }
}
