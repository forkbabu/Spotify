package org.apache.commons.io;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class e {
    private static final boolean a;
    private static Method b;
    private static Method c;
    private static Object d;
    private static Object e;

    static {
        boolean z = true;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> loadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> loadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> loadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> loadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            b = loadClass.getMethod("isSymbolicLink", loadClass2);
            loadClass.getMethod("delete", loadClass2);
            loadClass.getMethod("readSymbolicLink", loadClass2);
            Object newInstance = Array.newInstance(loadClass3, 0);
            e = newInstance;
            loadClass.getMethod("createSymbolicLink", loadClass2, loadClass2, newInstance.getClass());
            Object newInstance2 = Array.newInstance(loadClass4, 0);
            d = newInstance2;
            loadClass.getMethod("exists", loadClass2, newInstance2.getClass());
            c = File.class.getMethod("toPath", new Class[0]);
            loadClass2.getMethod("toFile", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z = false;
        }
        a = z;
    }

    public static boolean a() {
        return a;
    }

    public static boolean b(File file) {
        try {
            return ((Boolean) b.invoke(null, c.invoke(file, new Object[0]))).booleanValue();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
