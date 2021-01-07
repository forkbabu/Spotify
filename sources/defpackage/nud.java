package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.c;

/* renamed from: nud  reason: default package */
public final class nud {
    public static int a(int i, int i2, int i3, int i4, int i5, float f) {
        float f2 = (float) i;
        float f3 = f2 / ((float) (((int) (((float) (i3 - i4)) * f)) + i5));
        float f4 = (float) ((int) f3);
        float f5 = f3 - f4;
        if (f5 < 0.2f) {
            f3 = f4 + 0.2f;
        } else if (f5 > 0.8f) {
            f3 = ((float) ((int) (f3 + 1.0f))) + 0.2f;
        }
        return ((int) ((1.0f / f) * ((float) (((int) (f2 / Math.max(f3, ((float) (i2 - 1)) + 0.2f))) - i5)))) + i4;
    }

    public static float b(float f) {
        return c(0.0f, 1.0f, f);
    }

    public static float c(float f, float f2, float f3) {
        if (f > f2) {
            f2 = f;
            f = f2;
        }
        return f3 <= f ? f : f3 >= f2 ? f2 : f3;
    }

    public static int d(int i, int i2, int i3) {
        return Math.max(i, Math.min(i3, i2));
    }

    public static Drawable e(Context context, int i) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ovd.a(i, 0.4f), h(context, 16842836)});
    }

    public static int f(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static int g(float f, Resources resources) {
        int round = Math.round(resources.getDisplayMetrics().density * f);
        if (round != 0) {
            return round;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public static int h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static ColorStateList i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static Drawable j(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static int k(TextPaint textPaint, int i) {
        float[] fArr = new float[10];
        textPaint.getTextWidths("0123456789", fArr);
        float f = 0.0f;
        for (int i2 = 0; i2 < 10; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
            }
        }
        return (int) ((f * ((float) i)) + 0.5f);
    }

    public static int l(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static boolean m(Context context) {
        if (Build.VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static boolean n(View view) {
        return q4.o(view) == 1;
    }

    public static float o(float f, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f;
        if (f6 == 0.0f) {
            f6 = 1.0f / f2;
        }
        float f7 = (f5 - f) / f6;
        return (f4 * f7) + ((1.0f - f7) * f3);
    }

    public static void p(Context context, TextView textView, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        c.n(textView, resourceId);
    }

    public static int q(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().scaledDensity);
    }
}
