package defpackage;

import com.spotify.mobile.android.util.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: dd0  reason: default package */
public class dd0 {
    private static final List<Pattern> b;
    private static final Pattern c = Pattern.compile("\\S+ (\\S+) (\\S+) rw.*");
    private static final Set<String> d;
    private final String a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile("^/cache.*"));
        arrayList.add(Pattern.compile("^/config.*"));
        arrayList.add(Pattern.compile("^/dev/.*"));
        arrayList.add(Pattern.compile("^/firmware.*"));
        arrayList.add(Pattern.compile("^/persist.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/legacy.*"));
        arrayList.add(Pattern.compile("^/storage/emulated/[0-9]+/Android/obb"));
        arrayList.add(Pattern.compile("^/sys/.*"));
        b = Collections.unmodifiableList(arrayList);
        HashSet hashSet = new HashSet();
        hashSet.add("tmpfs");
        hashSet.add("rootfs");
        hashSet.add("proc");
        hashSet.add("procfs");
        hashSet.add("selinuxfs");
        hashSet.add("sockfs");
        hashSet.add("sysfs");
        hashSet.add("cgroup");
        hashSet.add("cifs");
        hashSet.add("nfs");
        hashSet.add("smbfs");
        hashSet.add("configfs");
        hashSet.add("functionfs");
        d = Collections.unmodifiableSet(hashSet);
    }

    public dd0(t tVar) {
        StringBuilder V0 = je.V0("Android/data/");
        V0.append(tVar.y());
        V0.append("/files");
        this.a = V0.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v10. Raw type applied. Possible types: java.util.Set<java.lang.String> */
    /* JADX WARN: Type inference failed for: r9v0, types: [dd0] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC, Splitter:B:14:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x005f A[EDGE_INSN: B:55:0x005f->B:29:0x005f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<java.lang.String> a() {
        /*
            r9 = this;
            java.lang.String r0 = "/proc/mounts"
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0018 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0018 }
            java.util.Set r0 = r9.b(r3)     // Catch:{ IOException -> 0x0016 }
            r3.close()     // Catch:{ IOException -> 0x0015 }
            goto L_0x0024
        L_0x0015:
            r1 = r0
        L_0x0016:
            r2 = r3
            goto L_0x0019
        L_0x0018:
        L_0x0019:
            int r0 = org.apache.commons.io.d.a
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r1.clear()
            r0 = r1
        L_0x0024:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.List<java.util.regex.Pattern> r5 = defpackage.dd0.b
            java.util.Iterator r5 = r5.iterator()
        L_0x0041:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r5.next()
            java.util.regex.Pattern r6 = (java.util.regex.Pattern) r6
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0041
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            if (r3 != 0) goto L_0x002d
            r1.add(r2)
            goto L_0x002d
        L_0x005f:
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            r1.add(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r0 < r2) goto L_0x00b4
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0079:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r6 = new java.io.File
            java.lang.String r7 = r9.a
            r6.<init>(r5, r7)
            boolean r7 = r6.mkdirs()
            boolean r8 = r6.exists()
            if (r8 != 0) goto L_0x0098
            if (r7 == 0) goto L_0x009b
        L_0x0098:
            r0.add(r5)
        L_0x009b:
            if (r7 == 0) goto L_0x0079
            boolean r5 = r6.delete()
            if (r5 != 0) goto L_0x0079
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r6.getAbsolutePath()
            r5[r4] = r6
            java.lang.String r6 = "Could not delete the probe folder: %s"
            com.spotify.base.java.logging.Logger.n(r6, r5)
            goto L_0x0079
        L_0x00b1:
            r1.addAll(r0)
        L_0x00b4:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00bd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r5 = defpackage.gf0.o(r5)
            if (r5 == 0) goto L_0x00d8
            r0.add(r2)
            goto L_0x00bd
        L_0x00d8:
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r9.a
            r5.<init>(r2, r6)
            boolean r5 = defpackage.gf0.o(r5)
            if (r5 == 0) goto L_0x00e9
            r0.add(r2)
            goto L_0x00bd
        L_0x00e9:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            java.lang.String r2 = "Cannot write to mount point %s"
            com.spotify.base.java.logging.Logger.n(r2, r5)
            goto L_0x00bd
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd0.a():java.util.Set");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<java.lang.String> b(java.io.InputStream r5) {
        /*
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0041 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "ascii"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0041 }
            r1.<init>(r2)     // Catch:{ all -> 0x0041 }
        L_0x0011:
            java.lang.String r5 = r1.readLine()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0039
            java.util.regex.Pattern r2 = defpackage.dd0.c     // Catch:{ all -> 0x003f }
            java.util.regex.Matcher r5 = r2.matcher(r5)     // Catch:{ all -> 0x003f }
            boolean r2 = r5.matches()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0011
            r2 = 2
            java.lang.String r2 = r5.group(r2)     // Catch:{ all -> 0x003f }
            java.util.Set<java.lang.String> r3 = defpackage.dd0.d     // Catch:{ all -> 0x003f }
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0011
            r2 = 1
            java.lang.String r5 = r5.group(r2)     // Catch:{ all -> 0x003f }
            r0.add(r5)     // Catch:{ all -> 0x003f }
            goto L_0x0011
        L_0x0039:
            int r5 = org.apache.commons.io.d.a
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            return r0
        L_0x003f:
            r5 = move-exception
            goto L_0x0043
        L_0x0041:
            r5 = move-exception
            r1 = 0
        L_0x0043:
            int r0 = org.apache.commons.io.d.a
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            goto L_0x004c
        L_0x004b:
            throw r5
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd0.b(java.io.InputStream):java.util.Set");
    }
}
