package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* access modifiers changed from: package-private */
public final class StaticLayoutBuilderCompat {
    private static boolean j;
    private static Constructor<StaticLayout> k;
    private static Object l;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d;
    private Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    private int f = Integer.MAX_VALUE;
    private boolean g = true;
    private boolean h;
    private TextUtils.TruncateAt i = null;

    /* access modifiers changed from: package-private */
    public static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = defpackage.je.V0(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Throwable):void");
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i2;
        this.d = charSequence.length();
    }

    public static StaticLayoutBuilderCompat b(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i2);
    }

    public StaticLayout a() {
        Class<?> cls;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, (float) max, this.i);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.h) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.b, max);
            obtain.setAlignment(this.e);
            obtain.setIncludePad(this.g);
            obtain.setTextDirection(this.h ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.i;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f);
            return obtain.build();
        }
        if (!j) {
            try {
                boolean z = this.h && i2 >= 23;
                if (i2 >= 18) {
                    cls = TextDirectionHeuristic.class;
                    l = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = StaticLayoutBuilderCompat.class.getClassLoader();
                    String str = this.h ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    l = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
                k = declaredConstructor;
                declaredConstructor.setAccessible(true);
                j = true;
            } catch (Exception e2) {
                throw new StaticLayoutBuilderCompatException(e2);
            }
        }
        try {
            Constructor<StaticLayout> constructor = k;
            constructor.getClass();
            Object obj = l;
            obj.getClass();
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.d), this.b, Integer.valueOf(max), this.e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.g), null, Integer.valueOf(max), Integer.valueOf(this.f));
        } catch (Exception e3) {
            throw new StaticLayoutBuilderCompatException(e3);
        }
    }

    public StaticLayoutBuilderCompat c(Layout.Alignment alignment) {
        this.e = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat d(TextUtils.TruncateAt truncateAt) {
        this.i = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat e(boolean z) {
        this.g = z;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z) {
        this.h = z;
        return this;
    }

    public StaticLayoutBuilderCompat g(int i2) {
        this.f = i2;
        return this;
    }
}
