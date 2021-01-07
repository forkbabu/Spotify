package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import com.spotify.music.C0707R;
import java.util.Locale;

/* renamed from: xud  reason: default package */
public final class xud {
    private static void a(float f, float f2, float f3, float f4) {
        if (f == -1.0f || f2 == -1.0f || f3 == -1.0f || f4 == -1.0f) {
            throw new IllegalStateException(String.format(Locale.US, "Incorrectly defined easing curve style. All control points must be set: (%.1f, %.1f, %.1f, %.1f)", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
        }
    }

    public static Interpolator b(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0707R.attr.pasteEasingCurveInHard, typedValue, true)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, oud.a);
            try {
                float f = obtainStyledAttributes.getFloat(0, -1.0f);
                float f2 = obtainStyledAttributes.getFloat(2, -1.0f);
                float f3 = obtainStyledAttributes.getFloat(1, -1.0f);
                float f4 = obtainStyledAttributes.getFloat(3, -1.0f);
                a(f, f2, f3, f4);
                return h5.a(f, f2, f3, f4);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            throw new IllegalStateException("Failed to resolve the attribute: 2130969732");
        }
    }
}
