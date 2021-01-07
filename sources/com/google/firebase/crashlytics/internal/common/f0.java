package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.v;
import com.spotify.music.features.ads.model.Ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class f0 {
    private static final String e = String.format(Locale.US, "Crashlytics Android SDK/%s", "17.2.1");
    private static final Map<String, Integer> f;
    private final Context a;
    private final n0 b;
    private final b c;
    private final e10 d;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        je.f(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
    }

    public f0(Context context, n0 n0Var, b bVar, e10 e10) {
        this.a = context;
        this.b = n0Var;
        this.c = bVar;
        this.d = e10;
    }

    private CrashlyticsReport.d.AbstractC0117d.a.b.c c(f10 f10, int i, int i2, int i3) {
        String str = f10.b;
        String str2 = f10.a;
        StackTraceElement[] stackTraceElementArr = f10.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        f10 f102 = f10.d;
        if (i3 >= i2) {
            f10 f103 = f102;
            while (f103 != null) {
                f103 = f103.d;
                i4++;
            }
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.c.a();
        a2.f(str);
        a2.e(str2);
        a2.c(v.c(d(stackTraceElementArr, i)));
        a2.d(i4);
        if (f102 != null && i4 == 0) {
            a2.b(c(f102, i, i2, i3 + 1));
        }
        return a2.a();
    }

    private v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.a();
            a2.c(i);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0L) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = (long) stackTraceElement.getLineNumber();
            }
            a2.e(max);
            a2.f(str);
            a2.b(fileName);
            a2.d(j);
            arrayList.add(a2.a());
        }
        return v.c(arrayList);
    }

    private CrashlyticsReport.d.AbstractC0117d.a.b.e e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a a2 = CrashlyticsReport.d.AbstractC0117d.a.b.e.a();
        a2.d(thread.getName());
        a2.c(i);
        a2.b(v.c(d(stackTraceElementArr, i)));
        return a2.a();
    }

    public CrashlyticsReport.d.AbstractC0117d a(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3;
        Thread thread2 = thread;
        int i4 = this.a.getResources().getConfiguration().orientation;
        e10 e10 = this.d;
        String localizedMessage = th.getLocalizedMessage();
        String name = th.getClass().getName();
        StackTraceElement[] a2 = e10.a(th.getStackTrace());
        Throwable cause = th.getCause();
        f10 f10 = cause != null ? new f10(cause, e10) : null;
        CrashlyticsReport.d.AbstractC0117d.b a3 = CrashlyticsReport.d.AbstractC0117d.a();
        a3.f(str);
        a3.e(j);
        ActivityManager.RunningAppProcessInfo i5 = CommonUtils.i(this.c.d, this.a);
        Boolean valueOf = i5 != null ? Boolean.valueOf(i5.importance != 100) : null;
        CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a a4 = CrashlyticsReport.d.AbstractC0117d.a.a();
        a4.b(valueOf);
        a4.e(i4);
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b a5 = CrashlyticsReport.d.AbstractC0117d.a.b.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(e(thread2, a2, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread2)) {
                    arrayList.add(e(key, this.d.a(entry.getValue()), 0));
                }
                thread2 = thread;
            }
        }
        a5.e(v.c(arrayList));
        if (a2 == null) {
            a2 = new StackTraceElement[0];
        }
        if (i2 <= 0) {
            f10 f102 = f10;
            i3 = 0;
            while (f102 != null) {
                f102 = f102.d;
                i3++;
            }
        } else {
            i3 = 0;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a a6 = CrashlyticsReport.d.AbstractC0117d.a.b.c.a();
        a6.f(name);
        a6.e(localizedMessage);
        a6.c(v.c(d(a2, i)));
        a6.d(i3);
        if (f10 != null && i3 == 0) {
            a6.b(c(f10, i, i2, 1));
        }
        a5.c(a6.a());
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a a7 = CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.a();
        a7.d(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        a7.c(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        a7.b(0);
        a5.d(a7.a());
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a a8 = CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.a();
        a8.b(0);
        a8.d(0);
        a8.c(this.c.d);
        a8.e(this.c.b);
        a5.b(v.d(a8.a()));
        a4.d(a5.a());
        a3.b(a4.a());
        e a9 = e.a(this.a);
        Float b2 = a9.b();
        Double valueOf2 = b2 != null ? Double.valueOf(b2.doubleValue()) : null;
        int c2 = a9.c();
        boolean m = CommonUtils.m(this.a);
        long p = CommonUtils.p();
        Context context = this.a;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = p - memoryInfo.availMem;
        long a10 = CommonUtils.a(Environment.getDataDirectory().getPath());
        CrashlyticsReport.d.AbstractC0117d.c.a a11 = CrashlyticsReport.d.AbstractC0117d.c.a();
        a11.b(valueOf2);
        a11.c(c2);
        a11.f(m);
        a11.e(i4);
        a11.g(j2);
        a11.d(a10);
        a3.c(a11.a());
        return a3.a();
    }

    public CrashlyticsReport b(String str, long j) {
        Integer num;
        CrashlyticsReport.a b2 = CrashlyticsReport.b();
        b2.h("17.2.1");
        b2.d(this.c.a);
        b2.e(this.b.c());
        b2.b(this.c.e);
        b2.c(this.c.f);
        b2.g(4);
        CrashlyticsReport.d.b a2 = CrashlyticsReport.d.a();
        a2.l(j);
        a2.i(str);
        a2.g(e);
        CrashlyticsReport.d.a.AbstractC0116a a3 = CrashlyticsReport.d.a.a();
        a3.c(this.b.b());
        a3.e(this.c.e);
        a3.b(this.c.f);
        a3.d(this.b.c());
        a2.b(a3.a());
        CrashlyticsReport.d.e.a a4 = CrashlyticsReport.d.e.a();
        a4.d(3);
        a4.e(Build.VERSION.RELEASE);
        a4.b(Build.VERSION.CODENAME);
        a4.c(CommonUtils.t(this.a));
        a2.k(a4.a());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str2 = Build.CPU_ABI;
        int i = 7;
        if (!TextUtils.isEmpty(str2) && (num = f.get(str2.toLowerCase(Locale.US))) != null) {
            i = num.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long p = CommonUtils.p();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean r = CommonUtils.r(this.a);
        int k = CommonUtils.k(this.a);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        CrashlyticsReport.d.c.a a5 = CrashlyticsReport.d.c.a();
        a5.b(i);
        a5.f(Build.MODEL);
        a5.c(availableProcessors);
        a5.h(p);
        a5.d(blockCount);
        a5.i(r);
        a5.j(k);
        a5.e(str3);
        a5.g(str4);
        a2.d(a5.a());
        a2.h(3);
        b2.i(a2.a());
        return b2.a();
    }
}
