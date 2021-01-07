package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: qoc  reason: default package */
public final class qoc {
    public static int a(Resources resources, int i, int i2) {
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int c = (int) (((float) resources.getDisplayMetrics().widthPixels) * c(resources, i));
        return c < dimensionPixelSize ? c : dimensionPixelSize;
    }

    public static String b(String str) {
        str.getClass();
        return z42.m(str).toString().replace('\n', ' ').trim();
    }

    public static float c(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }
}
