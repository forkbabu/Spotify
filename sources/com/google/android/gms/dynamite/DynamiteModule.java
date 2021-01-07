package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    private static Boolean b = null;
    private static i c = null;
    private static k d = null;
    private static String e = null;
    private static int f = -1;
    private static final ThreadLocal<b> g = new ThreadLocal<>();
    private static final ThreadLocal<Long> h = new a();
    private static final a.b i = new b();
    @RecentlyNonNull
    public static final a j = new e();
    @RecentlyNonNull
    public static final a k = new d();
    @RecentlyNonNull
    public static final a l = new g();
    @RecentlyNonNull
    public static final a m = new f();
    private final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @RecentlyNullable
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        LoadingException(String str, a aVar) {
            super(str);
        }

        LoadingException(String str, Throwable th, a aVar) {
            super(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        public static class C0101a {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        public interface b {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        C0101a a(Context context, String str, b bVar);
    }

    /* access modifiers changed from: private */
    public static class b {
        public Cursor a;

        private b() {
        }

        b(a aVar) {
        }
    }

    private static class c implements a.b {
        private final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.a.b
        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.a.b
        public final int b(Context context, String str) {
            return this.a;
        }
    }

    private DynamiteModule(Context context) {
        if (context != null) {
            this.a = context;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (m.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            String.valueOf(str).length();
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @RecentlyNonNull
    public static DynamiteModule c(@RecentlyNonNull Context context, @RecentlyNonNull a aVar, @RecentlyNonNull String str) {
        ThreadLocal<b> threadLocal = g;
        b bVar = threadLocal.get();
        b bVar2 = new b(null);
        threadLocal.set(bVar2);
        ThreadLocal<Long> threadLocal2 = h;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.C0101a a2 = aVar.a(context, str, i);
            int i2 = a2.a;
            str.length();
            str.length();
            int i3 = a2.c;
            if (i3 == 0 || ((i3 == -1 && a2.a == 0) || (i3 == 1 && a2.b == 0))) {
                int i4 = a2.a;
                int i5 = a2.b;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i4);
                sb.append(" and remote version is ");
                sb.append(i5);
                sb.append(".");
                throw new LoadingException(sb.toString(), null);
            } else if (i3 == -1) {
                DynamiteModule e2 = e(context, str);
                if (longValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(longValue));
                }
                Cursor cursor = bVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(bVar);
                return e2;
            } else if (i3 == 1) {
                try {
                    DynamiteModule f2 = f(context, str, a2.b);
                    if (longValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(longValue));
                    }
                    Cursor cursor2 = bVar2.a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    threadLocal.set(bVar);
                    return f2;
                } catch (LoadingException e3) {
                    String valueOf = String.valueOf(e3.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to load remote module: ".concat(valueOf);
                    } else {
                        new String("Failed to load remote module: ");
                    }
                    int i6 = a2.a;
                    if (i6 == 0 || aVar.a(context, str, new c(i6)).c != -1) {
                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                    }
                    DynamiteModule e4 = e(context, str);
                    if (r1 != 0) {
                        h.set(Long.valueOf(longValue));
                    }
                    return e4;
                }
            } else {
                int i7 = a2.c;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("VersionPolicy returned invalid code:");
                sb2.append(i7);
                throw new LoadingException(sb2.toString(), null);
            }
        } finally {
            if (longValue == 0) {
                h.remove();
            } else {
                h.set(Long.valueOf(longValue));
            }
            Cursor cursor3 = bVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            g.set(bVar);
        }
    }

    public static int d(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z) {
        Boolean bool;
        ClassLoader classLoader;
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.FALSE;
        try {
            synchronized (DynamiteModule.class) {
                bool = b;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader2 = (ClassLoader) declaredField.get(null);
                            if (classLoader2 != null) {
                                if (classLoader2 != ClassLoader.getSystemClassLoader()) {
                                    try {
                                        h(classLoader2);
                                    } catch (LoadingException unused) {
                                    }
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            } else {
                                try {
                                    int l2 = l(context, str, z);
                                    String str2 = e;
                                    if (str2 != null) {
                                        if (!str2.isEmpty()) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                g.l(str3);
                                                classLoader = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                g.l(str4);
                                                classLoader = new c(str4, ClassLoader.getSystemClassLoader());
                                            }
                                            h(classLoader);
                                            declaredField.set(null, classLoader);
                                            b = bool2;
                                            return l2;
                                        }
                                    }
                                    return l2;
                                } catch (LoadingException unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                }
                            }
                            bool2 = bool3;
                        }
                        bool3 = bool2;
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String.valueOf(e2).length();
                    }
                    b = bool3;
                    bool = bool3;
                }
            }
            if (!bool.booleanValue()) {
                return j(context, str, z);
            }
            try {
                return l(context, str, z);
            } catch (LoadingException e3) {
                String valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to retrieve remote module version: ".concat(valueOf);
                    return 0;
                }
                new String("Failed to retrieve remote module version: ");
                return 0;
            }
        } catch (Throwable th) {
            com.google.android.gms.common.util.c.a(context, th);
            throw th;
        }
    }

    private static DynamiteModule e(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule f(Context context, String str, int i2) {
        Boolean bool;
        com.google.android.gms.dynamic.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", null);
            } else if (bool.booleanValue()) {
                return k(context, str, i2);
            } else {
                String.valueOf(str).length();
                i g2 = g(context);
                if (g2 != null) {
                    int b2 = g2.b();
                    if (b2 >= 3) {
                        b bVar = g.get();
                        if (bVar != null) {
                            aVar = g2.B(com.google.android.gms.dynamic.b.F3(context), str, i2, com.google.android.gms.dynamic.b.F3(bVar.a));
                        } else {
                            throw new LoadingException("No cached result cursor holder", null);
                        }
                    } else if (b2 == 2) {
                        aVar = g2.b3(com.google.android.gms.dynamic.b.F3(context), str, i2);
                    } else {
                        aVar = g2.w2(com.google.android.gms.dynamic.b.F3(context), str, i2);
                    }
                    if (com.google.android.gms.dynamic.b.E3(aVar) != null) {
                        return new DynamiteModule((Context) com.google.android.gms.dynamic.b.E3(aVar));
                    }
                    throw new LoadingException("Failed to load remote module.", null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", null);
            }
        } catch (RemoteException e2) {
            throw new LoadingException("Failed to load remote module.", e2, null);
        } catch (LoadingException e3) {
            throw e3;
        } catch (Throwable th) {
            com.google.android.gms.common.util.c.a(context, th);
            throw new LoadingException("Failed to load remote module.", th, null);
        }
    }

    private static i g(Context context) {
        i iVar;
        synchronized (DynamiteModule.class) {
            i iVar2 = c;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof i) {
                        iVar = (i) queryLocalInterface;
                    } else {
                        iVar = new h(iBinder);
                    }
                }
                if (iVar != null) {
                    c = iVar;
                    return iVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    private static void h(ClassLoader classLoader) {
        k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    kVar = (k) queryLocalInterface;
                } else {
                    kVar = new j(iBinder);
                }
            }
            d = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, null);
        }
    }

    private static boolean i(Cursor cursor) {
        b bVar = g.get();
        if (bVar == null || bVar.a != null) {
            return false;
        }
        bVar.a = cursor;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081 A[Catch:{ all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int j(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            com.google.android.gms.dynamite.i r0 = g(r8)
            r6 = 0
            if (r0 != 0) goto L_0x0008
            return r6
        L_0x0008:
            r7 = 0
            int r1 = r0.b()     // Catch:{ RemoteException -> 0x006c }
            r2 = 3
            if (r1 < r2) goto L_0x0055
            com.google.android.gms.dynamic.a r1 = com.google.android.gms.dynamic.b.F3(r8)     // Catch:{ RemoteException -> 0x006c }
            java.lang.ThreadLocal<java.lang.Long> r8 = com.google.android.gms.dynamite.DynamiteModule.h     // Catch:{ RemoteException -> 0x006c }
            java.lang.Object r8 = r8.get()     // Catch:{ RemoteException -> 0x006c }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ RemoteException -> 0x006c }
            long r4 = r8.longValue()     // Catch:{ RemoteException -> 0x006c }
            r2 = r9
            r3 = r10
            com.google.android.gms.dynamic.a r8 = r0.m3(r1, r2, r3, r4)     // Catch:{ RemoteException -> 0x006c }
            java.lang.Object r8 = com.google.android.gms.dynamic.b.E3(r8)     // Catch:{ RemoteException -> 0x006c }
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch:{ RemoteException -> 0x006c }
            if (r8 == 0) goto L_0x004f
            boolean r9 = r8.moveToFirst()     // Catch:{ RemoteException -> 0x004c, all -> 0x0049 }
            if (r9 != 0) goto L_0x0035
            goto L_0x004f
        L_0x0035:
            int r9 = r8.getInt(r6)     // Catch:{ RemoteException -> 0x004c, all -> 0x0049 }
            if (r9 <= 0) goto L_0x0042
            boolean r10 = i(r8)     // Catch:{ RemoteException -> 0x004c, all -> 0x0049 }
            if (r10 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r7 = r8
        L_0x0043:
            if (r7 == 0) goto L_0x0048
            r7.close()
        L_0x0048:
            return r9
        L_0x0049:
            r9 = move-exception
            r7 = r8
            goto L_0x008c
        L_0x004c:
            r9 = move-exception
            r7 = r8
            goto L_0x006d
        L_0x004f:
            if (r8 == 0) goto L_0x0054
            r8.close()
        L_0x0054:
            return r6
        L_0x0055:
            r2 = 2
            if (r1 != r2) goto L_0x0061
            com.google.android.gms.dynamic.a r8 = com.google.android.gms.dynamic.b.F3(r8)
            int r8 = r0.M2(r8, r9, r10)
            return r8
        L_0x0061:
            com.google.android.gms.dynamic.a r8 = com.google.android.gms.dynamic.b.F3(r8)
            int r8 = r0.X2(r8, r9, r10)
            return r8
        L_0x006a:
            r9 = move-exception
            goto L_0x008c
        L_0x006c:
            r9 = move-exception
        L_0x006d:
            java.lang.String r8 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x006a }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x006a }
            int r10 = r9.length()     // Catch:{ all -> 0x006a }
            if (r10 == 0) goto L_0x0081
            r8.concat(r9)     // Catch:{ all -> 0x006a }
            goto L_0x0086
        L_0x0081:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x006a }
            r9.<init>(r8)     // Catch:{ all -> 0x006a }
        L_0x0086:
            if (r7 == 0) goto L_0x008b
            r7.close()
        L_0x008b:
            return r6
        L_0x008c:
            if (r7 == 0) goto L_0x0091
            r7.close()
        L_0x0091:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.j(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule k(Context context, String str, int i2) {
        k kVar;
        Boolean valueOf;
        com.google.android.gms.dynamic.a aVar;
        String.valueOf(str).length();
        synchronized (DynamiteModule.class) {
            kVar = d;
        }
        if (kVar != null) {
            b bVar = g.get();
            if (bVar == null || bVar.a == null) {
                throw new LoadingException("No result cursor", null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = bVar.a;
            com.google.android.gms.dynamic.b.F3(null);
            synchronized (DynamiteModule.class) {
                valueOf = Boolean.valueOf(f >= 2);
            }
            if (valueOf.booleanValue()) {
                aVar = kVar.b2(com.google.android.gms.dynamic.b.F3(applicationContext), str, i2, com.google.android.gms.dynamic.b.F3(cursor));
            } else {
                aVar = kVar.B(com.google.android.gms.dynamic.b.F3(applicationContext), str, i2, com.google.android.gms.dynamic.b.F3(cursor));
            }
            Context context2 = (Context) com.google.android.gms.dynamic.b.E3(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (i(r10) != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009a A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int l(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.h     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            if (r12 == 0) goto L_0x0016
            java.lang.String r10 = "api_force_staging"
            goto L_0x0018
        L_0x0016:
            java.lang.String r10 = "api"
        L_0x0018:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r12.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0093, all -> 0x0091 }
            if (r10 == 0) goto L_0x0089
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            if (r11 == 0) goto L_0x0089
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            if (r11 <= 0) goto L_0x0079
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r12 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r12)     // Catch:{ Exception -> 0x0084, all -> 0x0080 }
            r1 = 2
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0076 }
            com.google.android.gms.dynamite.DynamiteModule.e = r1     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0076 }
            if (r1 < 0) goto L_0x006e
            int r1 = r10.getInt(r1)     // Catch:{ all -> 0x0076 }
            com.google.android.gms.dynamite.DynamiteModule.f = r1     // Catch:{ all -> 0x0076 }
        L_0x006e:
            monitor-exit(r12)     // Catch:{ all -> 0x0076 }
            boolean r12 = i(r10)
            if (r12 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0076:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        L_0x0079:
            r0 = r10
        L_0x007a:
            if (r0 == 0) goto L_0x007f
            r0.close()
        L_0x007f:
            return r11
        L_0x0080:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00a4
        L_0x0084:
            r11 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L_0x0095
        L_0x0089:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)
            throw r11
        L_0x0091:
            r10 = move-exception
            goto L_0x00a4
        L_0x0093:
            r10 = move-exception
            r11 = r0
        L_0x0095:
            boolean r12 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00a2 }
            if (r12 == 0) goto L_0x009a
            throw r10     // Catch:{ all -> 0x00a2 }
        L_0x009a:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r10, r0)     // Catch:{ all -> 0x00a2 }
            throw r12     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r10 = move-exception
            r0 = r11
        L_0x00a4:
            if (r0 == 0) goto L_0x00a9
            r0.close()
        L_0x00a9:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.l(android.content.Context, java.lang.String, boolean):int");
    }

    @RecentlyNonNull
    public final IBinder b(@RecentlyNonNull String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
