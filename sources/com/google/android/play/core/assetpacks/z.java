package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class z {
    private static final a c = new a("AssetPackStorage");
    private final Context a;
    private final c2 b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    z(Context context, c2 c2Var) {
        this.a = context;
        this.b = c2Var;
    }

    private static void c(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long f = f(file);
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals(String.valueOf(f)) && !file2.getName().equals("stale.tmp")) {
                    m(file2);
                }
            }
        }
    }

    private static long f(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            c.d(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static boolean m(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File file2 : listFiles) {
                z &= m(file2);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    private final File w(String str) {
        return new File(z(), str);
    }

    private final List<File> x() {
        ArrayList arrayList = new ArrayList();
        try {
            if (z().exists()) {
                if (z().listFiles() != null) {
                    File[] listFiles = z().listFiles();
                    for (File file : listFiles) {
                        if (!file.getCanonicalPath().equals(new File(z(), "_tmp").getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            c.e("Could not process directory while scanning installed packs. %s", e);
        }
    }

    private final File y(String str, int i, long j) {
        return new File(new File(new File(new File(z(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File z() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }

    /* access modifiers changed from: package-private */
    public final File a(String str, int i, long j) {
        return new File(new File(w(str), String.valueOf(i)), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i, long j, String str2) {
        return new File(new File(new File(y(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, int i, long j, int i2) {
        File file = new File(j(str, i, j), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void e(List<String> list) {
        int a2 = this.b.a();
        Iterator it = ((ArrayList) x()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && f(file) != ((long) a2)) {
                m(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.a g(java.lang.String r7) {
        /*
            r6 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.z()
            r0.<init>(r1, r7)
            boolean r1 = r0.exists()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x0020
            com.google.android.play.core.internal.a r0 = com.google.android.play.core.assetpacks.z.c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r7
            java.lang.String r7 = "Pack not found with pack name: %s"
            r0.c(r7, r1)
        L_0x001d:
            r7 = r4
            goto L_0x0091
        L_0x0020:
            java.io.File r1 = new java.io.File
            com.google.android.play.core.assetpacks.c2 r5 = r6.b
            int r5 = r5.a()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.<init>(r0, r5)
            boolean r0 = r1.exists()
            r5 = 2
            if (r0 != 0) goto L_0x004e
            com.google.android.play.core.internal.a r0 = com.google.android.play.core.assetpacks.z.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.c2 r7 = r6.b
            int r7 = r7.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r2] = r7
            java.lang.String r7 = "Pack not found with pack name: %s app version: %s"
            r0.c(r7, r1)
            goto L_0x001d
        L_0x004e:
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L_0x0079
            int r1 = r0.length
            if (r1 != 0) goto L_0x0058
            goto L_0x0079
        L_0x0058:
            if (r1 <= r2) goto L_0x0072
            com.google.android.play.core.internal.a r0 = com.google.android.play.core.assetpacks.z.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.c2 r7 = r6.b
            int r7 = r7.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r2] = r7
            java.lang.String r7 = "Multiple pack versions found for pack name: %s app version: %s"
            r0.e(r7, r1)
            goto L_0x001d
        L_0x0072:
            r7 = r0[r3]
            java.lang.String r7 = r7.getCanonicalPath()
            goto L_0x0091
        L_0x0079:
            com.google.android.play.core.internal.a r0 = com.google.android.play.core.assetpacks.z.c
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r7
            com.google.android.play.core.assetpacks.c2 r7 = r6.b
            int r7 = r7.a()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r2] = r7
            java.lang.String r7 = "No pack version found for pack name: %s app version: %s"
            r0.c(r7, r1)
            goto L_0x001d
        L_0x0091:
            if (r7 != 0) goto L_0x0094
            return r4
        L_0x0094:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "assets"
            r0.<init>(r7, r1)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x00ad
            com.google.android.play.core.internal.a r7 = com.google.android.play.core.assetpacks.z.c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "Failed to find assets directory: %s"
            r7.e(r0, r1)
            return r4
        L_0x00ad:
            java.lang.String r0 = r0.getCanonicalPath()
            com.google.android.play.core.assetpacks.d0 r1 = new com.google.android.play.core.assetpacks.d0
            r1.<init>(r3, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.z.g(java.lang.String):com.google.android.play.core.assetpacks.a");
    }

    /* access modifiers changed from: package-private */
    public final File h(String str, int i, long j, String str2) {
        return new File(new File(new File(y(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Long> i() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = ((ArrayList) x()).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                a g = g(file.getName());
                if (g != null) {
                    hashMap2.put(file.getName(), g);
                }
            }
        } catch (IOException e) {
            c.e("Could not process directory while scanning installed packs: %s", e);
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(s(str)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final File j(String str, int i, long j) {
        return new File(y(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    public final File k(String str, int i, long j, String str2) {
        return new File(t(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        Iterator it = ((ArrayList) x()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                c(file);
                long f = f(file);
                if (((long) this.b.a()) != f) {
                    try {
                        new File(new File(file, String.valueOf(f)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        c.e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    c(file2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int n(String str, int i, long j) {
        File file = new File(j(str, i, j), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new bv("Merge checkpoint file corrupt.", e);
                }
            } else {
                throw new bv("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            w.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean o(String str) {
        if (!w(str).exists()) {
            return true;
        }
        return m(w(str));
    }

    /* access modifiers changed from: package-private */
    public final int p(String str) {
        return (int) f(w(str));
    }

    /* access modifiers changed from: package-private */
    public final File q(String str, int i, long j) {
        return new File(new File(y(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File r(String str, int i, long j, String str2) {
        return new File(t(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    public final long s(String str) {
        return f(new File(w(str), String.valueOf((int) f(w(str)))));
    }

    /* access modifiers changed from: package-private */
    public final File t(String str, int i, long j, String str2) {
        return new File(new File(new File(y(str, i, j), "_slices"), "_metadata"), str2);
    }

    /* access modifiers changed from: package-private */
    public final void u() {
        m(z());
    }

    /* access modifiers changed from: package-private */
    public final void v(String str, int i, long j) {
        if (y(str, i, j).exists()) {
            m(y(str, i, j));
        }
    }
}
