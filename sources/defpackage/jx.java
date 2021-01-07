package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.appcompat.widget.h0;

/* renamed from: jx  reason: default package */
public class jx {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = i0.a(context, resourceId)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList b(Context context, h0 h0Var, int i) {
        int n;
        ColorStateList a;
        if (h0Var.s(i) && (n = h0Var.n(i, 0)) != 0 && (a = i0.a(context, n)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return h0Var.c(i);
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = i0.b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    public static kx d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new kx(context, resourceId);
    }
}
