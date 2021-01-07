package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: qvd  reason: default package */
public class qvd {
    private static final a a = new a(6);

    /* access modifiers changed from: private */
    /* renamed from: qvd$a */
    public static class a extends r1<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    static void a(Drawable drawable, ColorStateList colorStateList, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (drawable.mutate() == drawable) {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                int colorForState = colorStateList.getColorForState(iArr, 0);
                a aVar = a;
                aVar.getClass();
                int i = (colorForState + 31) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
                    PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.c(Integer.valueOf(mode.hashCode() + i), porterDuffColorFilter);
                }
            }
            drawable.setColorFilter(porterDuffColorFilter);
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }
}
