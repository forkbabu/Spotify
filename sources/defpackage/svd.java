package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import com.spotify.music.C0707R;

/* renamed from: svd  reason: default package */
public class svd {
    private static final int[] c = new int[0];
    private static final int[] d = {-16842910};
    private static final int[] e = {16842908};
    private static final int[] f = {16842919};
    private final int a;
    private final int b;

    public svd(Context context) {
        float b2 = b(context, C0707R.attr.pastePressedDimFraction, 0.3f);
        float b3 = b(context, C0707R.attr.pasteDisabledDimFraction, 0.6f);
        int h = nud.h(context, C0707R.attr.pasteDimOverlayColor);
        this.a = s2.h(h, (int) (b2 * 255.0f));
        this.b = s2.h(h, (int) (b3 * 255.0f));
    }

    private static float b(Context context, int i, float f2) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.getFraction(1.0f, 1.0f) : f2;
    }

    public ColorStateList a(int i) {
        return new ColorStateList(new int[][]{d, f, e, c}, new int[]{s2.e(this.b, i), s2.e(this.a, i), s2.e(this.a, i), i});
    }
}
