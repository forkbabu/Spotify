package com.google.firebase.crashlytics.internal.proto;

import android.app.ActivityManager;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.features.ads.model.Ad;
import java.util.List;
import java.util.Map;

public class c {
    private static final a a = a.b(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
    private static final a b = a.b("Unity");

    private static int a(a aVar, a aVar2) {
        int b2 = CodedOutputStream.b(3, aVar) + CodedOutputStream.h(2, 0) + CodedOutputStream.h(1, 0) + 0;
        return aVar2 != null ? b2 + CodedOutputStream.b(4, aVar2) : b2;
    }

    private static int b(String str, String str2) {
        int b2 = CodedOutputStream.b(1, a.b(str));
        if (str2 == null) {
            str2 = "";
        }
        return CodedOutputStream.b(2, a.b(str2)) + b2;
    }

    private static int c(f10 f10, int i, int i2) {
        int i3 = 0;
        int b2 = CodedOutputStream.b(1, a.b(f10.b)) + 0;
        String str = f10.a;
        if (str != null) {
            b2 += CodedOutputStream.b(3, a.b(str));
        }
        for (StackTraceElement stackTraceElement : f10.c) {
            int h = h(stackTraceElement, true);
            b2 += CodedOutputStream.e(h) + CodedOutputStream.f(4) + h;
        }
        f10 f102 = f10.d;
        if (f102 == null) {
            return b2;
        }
        if (i < i2) {
            int c = c(f102, i + 1, i2);
            return b2 + CodedOutputStream.e(c) + CodedOutputStream.f(6) + c;
        }
        while (f102 != null) {
            f102 = f102.d;
            i3++;
        }
        return b2 + CodedOutputStream.g(7, i3);
    }

    private static int d() {
        a aVar = a;
        return CodedOutputStream.h(3, 0) + CodedOutputStream.b(2, aVar) + CodedOutputStream.b(1, aVar) + 0;
    }

    private static int e(f10 f10, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2) {
        int f = CodedOutputStream.f(1);
        int i2 = i(thread, stackTraceElementArr, 4, true);
        int e = CodedOutputStream.e(i2) + f + i2 + 0;
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i(threadArr[i3], list.get(i3), 0, false);
            e += CodedOutputStream.e(i4) + f + i4;
        }
        int c = c(f10, 1, i);
        int e2 = CodedOutputStream.e(c) + CodedOutputStream.f(2) + c + e;
        int d = d();
        int f2 = CodedOutputStream.f(3);
        int a2 = a(aVar, aVar2);
        return CodedOutputStream.e(a2) + CodedOutputStream.f(3) + a2 + CodedOutputStream.e(d) + f2 + d + e2;
    }

    private static int f(f10 f10, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, a aVar, a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int e = e(f10, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        boolean z = true;
        int e2 = CodedOutputStream.e(e) + CodedOutputStream.f(1) + e + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int b2 = b(entry.getKey(), entry.getValue());
                e2 += CodedOutputStream.e(b2) + CodedOutputStream.f(2) + b2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            e2 += CodedOutputStream.a(3, z);
        }
        return CodedOutputStream.g(4, i2) + e2;
    }

    private static int g(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            f.floatValue();
            i3 = 0 + CodedOutputStream.f(1) + 4;
        }
        int f2 = CodedOutputStream.f(2);
        int i4 = i << 1;
        int a2 = CodedOutputStream.a(3, z);
        return CodedOutputStream.h(6, j2) + CodedOutputStream.h(5, j) + CodedOutputStream.g(4, i2) + a2 + i3 + CodedOutputStream.e((i >> 31) ^ i4) + f2;
    }

    private static int h(StackTraceElement stackTraceElement, boolean z) {
        int i;
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            i = CodedOutputStream.h(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            i = CodedOutputStream.h(1, 0);
        }
        int b2 = CodedOutputStream.b(2, a.b(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName())) + i + 0;
        if (stackTraceElement.getFileName() != null) {
            b2 += CodedOutputStream.b(3, a.b(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += CodedOutputStream.h(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return CodedOutputStream.g(5, i2) + b2;
    }

    private static int i(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int g = CodedOutputStream.g(2, i) + CodedOutputStream.b(1, a.b(thread.getName()));
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int h = h(stackTraceElement, z);
            g += CodedOutputStream.e(h) + CodedOutputStream.f(3) + h;
        }
        return g;
    }

    private static a j(String str) {
        if (str == null) {
            return null;
        }
        return a.b(str);
    }

    public static void k(CodedOutputStream codedOutputStream, String str, String str2, long j) {
        codedOutputStream.m(1, a.b(str2));
        codedOutputStream.m(2, a.b(str));
        codedOutputStream.u(3, j);
    }

    private static void l(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) {
        codedOutputStream.q((i << 3) | 2);
        codedOutputStream.q(h(stackTraceElement, z));
        int i2 = 0;
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.u(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.u(1, 0);
        }
        codedOutputStream.m(2, a.b(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.m(3, a.b(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.u(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 4;
        }
        codedOutputStream.t(5, i2);
    }

    public static void m(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, int i, String str5) {
        a b2 = a.b(str);
        a b3 = a.b(str2);
        a b4 = a.b(str3);
        a b5 = a.b(str4);
        a b6 = str5 != null ? a.b(str5) : null;
        codedOutputStream.s(7, 2);
        int b7 = CodedOutputStream.b(2, b3);
        int b8 = CodedOutputStream.b(6, b5) + CodedOutputStream.b(3, b4) + b7 + CodedOutputStream.b(1, b2) + 0;
        if (b6 != null) {
            b8 = CodedOutputStream.b(9, b6) + CodedOutputStream.b(8, b) + b8;
        }
        codedOutputStream.q(CodedOutputStream.d(10, i) + b8);
        codedOutputStream.m(1, b2);
        codedOutputStream.m(2, b3);
        codedOutputStream.m(3, b4);
        codedOutputStream.m(6, b5);
        if (b6 != null) {
            codedOutputStream.m(8, b);
            codedOutputStream.m(9, b6);
        }
        codedOutputStream.n(10, i);
    }

    public static void n(CodedOutputStream codedOutputStream, String str) {
        a b2 = a.b(str);
        codedOutputStream.s(7, 2);
        int b3 = CodedOutputStream.b(2, b2);
        codedOutputStream.q(CodedOutputStream.e(b3) + CodedOutputStream.f(5) + b3);
        codedOutputStream.s(5, 2);
        codedOutputStream.q(b3);
        codedOutputStream.m(2, b2);
    }

    public static void o(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        int i4;
        int i5;
        int i6;
        a j3 = j(str);
        a j4 = j(str3);
        a j5 = j(str2);
        codedOutputStream.s(9, 2);
        int d = CodedOutputStream.d(3, i) + 0;
        if (j3 == null) {
            i4 = 0;
        } else {
            i4 = CodedOutputStream.b(4, j3);
        }
        int h = CodedOutputStream.h(6, j);
        int h2 = CodedOutputStream.h(7, j2) + h + CodedOutputStream.g(5, i2) + d + i4;
        int g = CodedOutputStream.g(12, i3) + CodedOutputStream.a(10, z) + h2;
        if (j5 == null) {
            i5 = 0;
        } else {
            i5 = CodedOutputStream.b(13, j5);
        }
        int i7 = g + i5;
        if (j4 == null) {
            i6 = 0;
        } else {
            i6 = CodedOutputStream.b(14, j4);
        }
        codedOutputStream.q(i7 + i6);
        codedOutputStream.n(3, i);
        codedOutputStream.m(4, j3);
        codedOutputStream.t(5, i2);
        codedOutputStream.u(6, j);
        codedOutputStream.u(7, j2);
        codedOutputStream.l(10, z);
        codedOutputStream.t(12, i3);
        if (j5 != null) {
            codedOutputStream.m(13, j5);
        }
        if (j4 != null) {
            codedOutputStream.m(14, j4);
        }
    }

    public static void p(CodedOutputStream codedOutputStream, long j, String str, f10 f10, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f, int i3, boolean z, long j2, long j3) {
        a b2 = a.b(str2);
        a aVar = null;
        a b3 = str3 == null ? null : a.b(str3.replace("-", ""));
        if (bArr != null) {
            aVar = a.a(bArr);
        } else {
            ty.f().b("No log data to include with this event.");
        }
        codedOutputStream.s(10, 2);
        int b4 = CodedOutputStream.b(2, a.b(str)) + CodedOutputStream.h(1, j) + 0;
        int f2 = f(f10, thread, stackTraceElementArr, threadArr, list, i, b2, b3, map, runningAppProcessInfo, i2);
        int e = CodedOutputStream.e(f2) + CodedOutputStream.f(3) + f2 + b4;
        int g = g(f, i3, z, i2, j2, j3);
        int e2 = CodedOutputStream.e(g) + CodedOutputStream.f(5) + g + e;
        if (aVar != null) {
            int b5 = CodedOutputStream.b(1, aVar);
            e2 += CodedOutputStream.e(b5) + CodedOutputStream.f(6) + b5;
        }
        codedOutputStream.q(e2);
        codedOutputStream.u(1, j);
        codedOutputStream.m(2, a.b(str));
        codedOutputStream.s(3, 2);
        codedOutputStream.q(f(f10, thread, stackTraceElementArr, threadArr, list, i, b2, b3, map, runningAppProcessInfo, i2));
        codedOutputStream.s(1, 2);
        codedOutputStream.q(e(f10, thread, stackTraceElementArr, threadArr, list, i, b2, b3));
        t(codedOutputStream, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            t(codedOutputStream, threadArr[i4], list.get(i4), 0, false);
        }
        q(codedOutputStream, f10, 1, i, 2);
        codedOutputStream.s(3, 2);
        codedOutputStream.q(d());
        a aVar2 = a;
        codedOutputStream.m(1, aVar2);
        codedOutputStream.m(2, aVar2);
        codedOutputStream.u(3, 0);
        codedOutputStream.s(4, 2);
        codedOutputStream.q(a(b2, b3));
        codedOutputStream.u(1, 0);
        codedOutputStream.u(2, 0);
        codedOutputStream.m(3, b2);
        if (b3 != null) {
            codedOutputStream.m(4, b3);
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                codedOutputStream.s(2, 2);
                codedOutputStream.q(b(entry.getKey(), entry.getValue()));
                codedOutputStream.m(1, a.b(entry.getKey()));
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                codedOutputStream.m(2, a.b(value));
            }
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.l(3, runningAppProcessInfo.importance != 100);
        }
        codedOutputStream.t(4, i2);
        codedOutputStream.s(5, 2);
        codedOutputStream.q(g(f, i3, z, i2, j2, j3));
        if (f != null) {
            float floatValue = f.floatValue();
            codedOutputStream.q(13);
            int floatToRawIntBits = Float.floatToRawIntBits(floatValue);
            codedOutputStream.o(floatToRawIntBits & BitmapRenderer.ALPHA_VISIBLE);
            codedOutputStream.o((floatToRawIntBits >> 8) & BitmapRenderer.ALPHA_VISIBLE);
            codedOutputStream.o((floatToRawIntBits >> 16) & BitmapRenderer.ALPHA_VISIBLE);
            codedOutputStream.o((floatToRawIntBits >> 24) & BitmapRenderer.ALPHA_VISIBLE);
        }
        codedOutputStream.q(16);
        codedOutputStream.q((i3 << 1) ^ (i3 >> 31));
        codedOutputStream.l(3, z);
        codedOutputStream.t(4, i2);
        codedOutputStream.u(5, j2);
        codedOutputStream.u(6, j3);
        if (aVar != null) {
            codedOutputStream.s(6, 2);
            codedOutputStream.q(CodedOutputStream.b(1, aVar));
            codedOutputStream.m(1, aVar);
        }
    }

    private static void q(CodedOutputStream codedOutputStream, f10 f10, int i, int i2, int i3) {
        codedOutputStream.q((i3 << 3) | 2);
        codedOutputStream.q(c(f10, 1, i2));
        codedOutputStream.m(1, a.b(f10.b));
        String str = f10.a;
        if (str != null) {
            codedOutputStream.m(3, a.b(str));
        }
        int i4 = 0;
        for (StackTraceElement stackTraceElement : f10.c) {
            l(codedOutputStream, 4, stackTraceElement, true);
        }
        f10 f102 = f10.d;
        if (f102 == null) {
            return;
        }
        if (i < i2) {
            q(codedOutputStream, f102, i + 1, i2, 6);
            return;
        }
        while (f102 != null) {
            f102 = f102.d;
            i4++;
        }
        codedOutputStream.t(7, i4);
    }

    public static void r(CodedOutputStream codedOutputStream, String str, String str2, boolean z) {
        a b2 = a.b(str);
        a b3 = a.b(str2);
        codedOutputStream.s(8, 2);
        int b4 = CodedOutputStream.b(2, b2) + CodedOutputStream.d(1, 3) + 0;
        codedOutputStream.q(CodedOutputStream.a(4, z) + CodedOutputStream.b(3, b3) + b4);
        codedOutputStream.n(1, 3);
        codedOutputStream.m(2, b2);
        codedOutputStream.m(3, b3);
        codedOutputStream.l(4, z);
    }

    public static void s(CodedOutputStream codedOutputStream, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        a b2 = a.b(str);
        j(null);
        j(null);
        codedOutputStream.s(6, 2);
        codedOutputStream.q(CodedOutputStream.b(1, b2) + 0);
        codedOutputStream.m(1, b2);
    }

    private static void t(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        codedOutputStream.s(1, 2);
        codedOutputStream.q(i(thread, stackTraceElementArr, i, z));
        codedOutputStream.m(1, a.b(thread.getName()));
        codedOutputStream.t(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            l(codedOutputStream, 3, stackTraceElement, z);
        }
    }
}
