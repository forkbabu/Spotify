package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.getkeepsafe.relinker.b;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class a implements b.a {

    /* access modifiers changed from: private */
    /* renamed from: com.getkeepsafe.relinker.a$a  reason: collision with other inner class name */
    public static class C0081a {
        public ZipFile a;
        public ZipEntry b;

        public C0081a(ZipFile zipFile, ZipEntry zipEntry) {
            this.a = zipFile;
            this.b = zipEntry;
        }
    }

    private C0081a a(Context context, String[] strArr, String str, d dVar) {
        String[] d = d(context);
        int length = d.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = d[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = strArr[i6];
                            StringBuilder V0 = je.V0("lib");
                            V0.append(File.separatorChar);
                            V0.append(str3);
                            V0.append(File.separatorChar);
                            V0.append(str);
                            String sb = V0.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb;
                            objArr[1] = str2;
                            dVar.e("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new C0081a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        c = 0;
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    private String[] b(Context context, String str) {
        StringBuilder V0 = je.V0("lib");
        V0.append(File.separatorChar);
        V0.append("([^\\");
        V0.append(File.separatorChar);
        V0.append("]*)");
        V0.append(File.separatorChar);
        V0.append(str);
        Pattern compile = Pattern.compile(V0.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : d(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] d(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x00ec A[SYNTHETIC, Splitter:B:101:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x00bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x00bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0096 A[SYNTHETIC, Splitter:B:58:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009d A[SYNTHETIC, Splitter:B:62:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a5 A[SYNTHETIC, Splitter:B:69:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b4 A[SYNTHETIC, Splitter:B:77:0x00b4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r17, java.lang.String[] r18, java.lang.String r19, java.io.File r20, com.getkeepsafe.relinker.d r21) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.a.c(android.content.Context, java.lang.String[], java.lang.String, java.io.File, com.getkeepsafe.relinker.d):void");
    }
}
