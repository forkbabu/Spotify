package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtils {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long b = -1;
    public static final Comparator<File> c = new a();

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> t;

        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            t = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        static Architecture d() {
            Architecture architecture = UNKNOWN;
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                ty.f().b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return architecture;
            }
            Architecture architecture2 = t.get(str.toLowerCase(Locale.US));
            return architecture2 == null ? architecture : architecture2;
        }
    }

    class a implements Comparator<File> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean b(Context context) {
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    public static void c(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ty.f().e(str, e);
            }
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    static long e(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static String f(String... strArr) {
        if (strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return v(sb2);
            }
        }
        return null;
    }

    public static String g(File file, String str) {
        Throwable th;
        BufferedReader bufferedReader;
        Exception e;
        String str2 = null;
        str2 = null;
        BufferedReader bufferedReader2 = null;
        str2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str2 = split[1];
                            break;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            ty.f().e("Error parsing " + file, e);
                            c(bufferedReader, "Failed to close system file reader.");
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            c(bufferedReader2, "Failed to close system file reader.");
                            throw th;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedReader = null;
                ty.f().e("Error parsing " + file, e);
                c(bufferedReader, "Failed to close system file reader.");
                return str2;
            } catch (Throwable th3) {
                th = th3;
                c(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            c(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    public static void h(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                ((CodedOutputStream) flushable).flush();
            } catch (IOException e) {
                ty.f().e(str, e);
            }
        }
    }

    public static ActivityManager.RunningAppProcessInfo i(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean j(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int n = n(context, str, "bool");
            if (n > 0) {
                return resources.getBoolean(n);
            }
            int n2 = n(context, str, "string");
            if (n2 > 0) {
                return Boolean.parseBoolean(context.getString(n2));
            }
        }
        return z;
    }

    public static int k(Context context) {
        boolean z = true;
        int i = r(context) ? 1 : 0;
        if (t(context)) {
            i |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        return z ? i | 4 : i;
    }

    public static String l(Context context) {
        int n = n(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (n == 0) {
            n = n(context, "com.crashlytics.android.build_id", "string");
        }
        if (n != 0) {
            return context.getResources().getString(n);
        }
        return null;
    }

    public static boolean m(Context context) {
        if (!r(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    public static int n(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i);
            } catch (Resources.NotFoundException unused) {
                str3 = context.getPackageName();
            }
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public static SharedPreferences o(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long p() {
        long j;
        synchronized (CommonUtils.class) {
            if (b == -1) {
                long j2 = 0;
                String g = g(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(g)) {
                    String upperCase = g.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = e(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = e(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = e(upperCase, "GB", 1073741824);
                        } else {
                            ty f = ty.f();
                            f.b("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        ty f2 = ty.f();
                        f2.e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                b = j2;
            }
            j = b;
        }
        return j;
    }

    public static String q(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean r(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.PRODUCT;
        return "sdk".equals(str) || "google_sdk".equals(str) || string == null;
    }

    public static boolean s(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean t(Context context) {
        boolean r = r(context);
        String str = Build.TAGS;
        if ((!r && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (r || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String u(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String v(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA1);
            instance.update(bytes);
            return q(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            ty f = ty.f();
            f.e("Could not create hashing algorithm: " + Constants.SHA1 + ", returning empty string.", e);
            return "";
        }
    }

    public static String w(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }
}
