package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.music.C0707R;

/* renamed from: iy  reason: default package */
public class iy {
    private static final int[] a = {16842752, C0707R.attr.theme};
    private static final int[] b = {C0707R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof s0) && ((s0) context).b() == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        s0 s0Var = new s0(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            s0Var.getTheme().applyStyle(resourceId2, true);
        }
        return s0Var;
    }
}
