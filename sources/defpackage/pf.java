package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: pf  reason: default package */
public class pf {
    private static final FileFilter a = new a();

    /* renamed from: pf$a */
    static class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    public static int b() {
        int i = -1;
        for (int i2 = 0; i2 < d(); i2++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i3 = 0;
                        while (Character.isDigit(bArr[i3]) && i3 < 128) {
                            i3++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                        if (valueOf.intValue() > i) {
                            i = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int f = f("cpu MHz", fileInputStream2) * Constants.ONE_SECOND;
                if (f > i) {
                    i = f;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC, Splitter:B:21:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r3) {
        /*
            r0 = -1
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0042, all -> 0x003b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x003b }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            java.lang.String r1 = r3.readLine()     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            r3.close()     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r3 = "0-[\\d]+$"
            boolean r3 = r1.matches(r3)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            if (r3 != 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            r3 = 2
            java.lang.String r3 = r1.substring(r3)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            int r3 = r3.intValue()     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            int r0 = r3 + 1
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r0
        L_0x0036:
            r3 = move-exception
            r1 = r2
            goto L_0x003c
        L_0x0039:
            r1 = r2
            goto L_0x0043
        L_0x003b:
            r3 = move-exception
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r3
        L_0x0042:
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf.c(java.lang.String):int");
    }

    public static int d() {
        int i = Build.VERSION.SDK_INT;
        try {
            int c = c("/sys/devices/system/cpu/possible");
            if (c == -1) {
                c = c("/sys/devices/system/cpu/present");
            }
            return c == -1 ? new File("/sys/devices/system/cpu/").listFiles(a).length : c;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static long e(Context context) {
        int i = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private static int f(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        if (i2 >= read) {
                            continue;
                            break;
                        }
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }
}
