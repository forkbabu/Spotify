package com.spotify.mobile.android.util;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class x {
    private static Boolean a;

    public static <T> int a(List<T> list, List<T> list2, b0 b0Var, c0<T> c0Var) {
        if (list2.size() * list.size() > 10000) {
            Logger.n("Calculating difference on big lists! Be wary of performance issues.", new Object[0]);
        }
        int[] iArr = new int[2];
        iArr[1] = list2.size() + 1;
        iArr[0] = list.size() + 1;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        iArr2[0][0] = 0;
        for (int i = 1; i <= list.size(); i++) {
            iArr2[i][0] = i;
        }
        for (int i2 = 1; i2 <= list2.size(); i2++) {
            iArr2[0][i2] = i2;
        }
        for (int i3 = 1; i3 <= list.size(); i3++) {
            for (int i4 = 1; i4 <= list2.size(); i4++) {
                int i5 = i3 - 1;
                int i6 = i4 - 1;
                if (b(list.get(i5), list2.get(i6), c0Var)) {
                    iArr2[i3][i4] = iArr2[i5][i6];
                } else {
                    iArr2[i3][i4] = Math.min(iArr2[i3][i6] + 1, iArr2[i5][i4] + 1);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int size2 = list2.size();
        while (size > 0 && size2 > 0) {
            int i7 = size - 1;
            int i8 = size2 - 1;
            if (b(list.get(i7), list2.get(i8), c0Var)) {
                arrayList.add(0);
                size = i7;
            } else if (iArr2[i7][size2] + 1 == iArr2[size][size2]) {
                arrayList.add(-1);
                size = i7;
            } else {
                arrayList.add(1);
            }
            size2 = i8;
        }
        while (size > 0) {
            arrayList.add(-1);
            size--;
        }
        while (size2 > 0) {
            arrayList.add(1);
            size2--;
        }
        Collections.reverse(arrayList);
        int i9 = 0;
        int i10 = 0;
        while (i9 < arrayList.size()) {
            if (((Integer) arrayList.get(i9)).intValue() == 0) {
                i10++;
                i9++;
            } else {
                int intValue = ((Integer) arrayList.get(i9)).intValue();
                int i11 = i9;
                int i12 = 0;
                while (i11 < arrayList.size() && ((Integer) arrayList.get(i11)).intValue() == intValue) {
                    i12 += intValue;
                    i11++;
                }
                if (i12 > 0) {
                    if (i12 == 1) {
                        b0Var.a(i10);
                    } else {
                        b0Var.b(i10, i12);
                    }
                } else if (i12 == -1) {
                    b0Var.c(i10);
                } else {
                    b0Var.d(i10, -i12);
                }
                i9 += Math.abs(i12);
                i10 += Math.max(0, i12);
            }
        }
        return iArr2[list.size()][list2.size()];
    }

    private static <T> boolean b(T t, T t2, c0<T> c0Var) {
        if (c0Var != null) {
            T t3 = t;
            T t4 = t2;
            if (t3.b().uid().equals(t4.b().uid())) {
                if (TextUtils.equals(t3.b().metadata().get("title"), t4.b().metadata().get("title"))) {
                    return true;
                }
            }
            return false;
        } else if (t == t2) {
            return true;
        } else {
            if (t == null || !t.equals(t2)) {
                return false;
            }
            return true;
        }
    }

    public static <V extends View> void c(V v, qg0<V> qg0) {
        v.getClass();
        v.getViewTreeObserver().addOnPreDrawListener(new e0(qg0, v, true));
    }

    public static String d(o oVar) {
        ImmutableList<b> artists = oVar.getArtists();
        if (artists == null) {
            return "";
        }
        return Joiner.on(", ").join(Collections2.transform((List) artists, (Function) new n0()));
    }

    public static boolean e(LinkType linkType) {
        int ordinal = linkType.ordinal();
        if (ordinal == 69 || ordinal == 75 || ordinal == 71 || ordinal == 72) {
            return true;
        }
        switch (ordinal) {
            case 54:
            case 55:
            case 56:
            case 57:
                return true;
            default:
                switch (ordinal) {
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static synchronized boolean g(Context context) {
        boolean booleanValue;
        synchronized (x.class) {
            if (a == null) {
                int i = context.getResources().getConfiguration().smallestScreenWidthDp;
                if (Build.VERSION.SDK_INT >= 24) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                    i = (int) (((float) i) / (((float) DisplayMetrics.DENSITY_DEVICE_STABLE) / ((float) displayMetrics.densityDpi)));
                }
                a = Boolean.valueOf(i >= 600);
            }
            booleanValue = a.booleanValue();
        }
        return booleanValue;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean i(l0 l0Var) {
        switch (l0Var.q().ordinal()) {
            case 8:
            case 25:
            case 70:
            case 101:
            case 131:
            case 184:
            case 215:
            case 216:
            case 217:
            case 218:
            case 220:
            case 258:
            case 260:
            case 275:
            case 298:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static r0 k(Context context, SensorRecorder sensorRecorder) {
        return new r0(context, sensorRecorder);
    }

    public static void l(Spannable spannable, y yVar) {
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new z(uRLSpan.getURL(), yVar), spanStart, spanEnd, 0);
        }
    }

    public static void m(Context context, TextView textView, a aVar) {
        aVar.b(new h(textView), new c(context, textView), new k(context, textView), new b(context, textView), new f(textView), new d(textView), new i(textView), new a(textView));
    }

    public static <T> T n(T t, T t2) {
        return t != null ? t : t2;
    }
}
