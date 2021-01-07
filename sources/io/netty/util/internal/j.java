package io.netty.util.internal;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;

public final class j {
    private static final io.netty.util.internal.logging.b a;
    private static final String b;
    private static final File c;

    /* access modifiers changed from: package-private */
    public static class a implements PrivilegedAction<Object> {
        final /* synthetic */ Class a;
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        a(Class cls, String str, boolean z) {
            this.a = cls;
            this.b = str;
            this.c = z;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                Method method = this.a.getMethod("loadLibrary", String.class, Boolean.TYPE);
                method.setAccessible(true);
                return method.invoke(null, this.b, Boolean.valueOf(this.c));
            } catch (Exception e) {
                return e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements PrivilegedAction<Class<?>> {
        final /* synthetic */ ClassLoader a;
        final /* synthetic */ Class b;
        final /* synthetic */ byte[] c;

        b(ClassLoader classLoader, Class cls, byte[] bArr) {
            this.a = classLoader;
            this.b = cls;
            this.c = bArr;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Class<?> run() {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, cls, cls);
                declaredMethod.setAccessible(true);
                return (Class) declaredMethod.invoke(this.a, this.b.getName(), this.c, 0, Integer.valueOf(this.c.length));
            } catch (Exception e) {
                throw new IllegalStateException("Define class failed!", e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163  */
    static {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.j.<clinit>():void");
    }

    private j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f6 A[SYNTHETIC, Splitter:B:63:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fd A[SYNTHETIC, Splitter:B:67:0x00fd] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r9, java.lang.ClassLoader r10) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.j.a(java.lang.String, java.lang.ClassLoader):void");
    }

    public static void b(ClassLoader classLoader, String... strArr) {
        for (String str : strArr) {
            try {
                a(str, classLoader);
                a.r("Successfully loaded the library: {}", str);
                return;
            } catch (Throwable th) {
                a.b("Unable to load the library '{}', trying next name...", str, th);
            }
        }
        StringBuilder V0 = je.V0("Failed to load any of the given libraries: ");
        V0.append(Arrays.toString(strArr));
        throw new IllegalArgumentException(V0.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(java.lang.ClassLoader r2, java.lang.String r3, boolean r4) {
        /*
            java.lang.String r0 = "Unable to load the library '{}', trying other loading mechanism."
            java.lang.Class<io.netty.util.internal.k> r1 = io.netty.util.internal.k.class
            java.lang.Class r2 = f(r2, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0013, Exception -> 0x000c }
            d(r2, r3, r4)     // Catch:{ UnsatisfiedLinkError -> 0x0013, Exception -> 0x000c }
            return
        L_0x000c:
            r2 = move-exception
            io.netty.util.internal.logging.b r1 = io.netty.util.internal.j.a
            r1.b(r0, r3, r2)
            goto L_0x0019
        L_0x0013:
            r2 = move-exception
            io.netty.util.internal.logging.b r1 = io.netty.util.internal.j.a
            r1.b(r0, r3, r2)
        L_0x0019:
            if (r4 == 0) goto L_0x001f
            java.lang.System.load(r3)
            goto L_0x0022
        L_0x001f:
            java.lang.System.loadLibrary(r3)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.j.c(java.lang.ClassLoader, java.lang.String, boolean):void");
    }

    private static void d(Class<?> cls, String str, boolean z) {
        Object doPrivileged = AccessController.doPrivileged(new a(cls, str, z));
        if (doPrivileged instanceof Throwable) {
            Throwable th = (Throwable) doPrivileged;
            Throwable cause = th.getCause();
            if (cause == null) {
                throw new UnsatisfiedLinkError(th.getMessage());
            } else if (cause instanceof UnsatisfiedLinkError) {
                throw ((UnsatisfiedLinkError) cause);
            } else {
                throw new UnsatisfiedLinkError(cause.getMessage());
            }
        }
    }

    private static File e(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    private static Class<?> f(ClassLoader classLoader, Class<?> cls) {
        try {
            return classLoader.loadClass(cls.getName());
        } catch (ClassNotFoundException unused) {
            String name = cls.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf > 0) {
                name = name.substring(lastIndexOf + 1);
            }
            URL resource = cls.getResource(name + ".class");
            if (resource != null) {
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
                Closeable closeable = null;
                try {
                    InputStream openStream = resource.openStream();
                    while (true) {
                        int read = openStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        openStream.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return (Class) AccessController.doPrivileged(new b(classLoader, cls, byteArray));
                } catch (IOException e) {
                    throw new ClassNotFoundException(cls.getName(), e);
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            closeable.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    throw th;
                }
            } else {
                throw new ClassNotFoundException(cls.getName());
            }
        }
    }
}
