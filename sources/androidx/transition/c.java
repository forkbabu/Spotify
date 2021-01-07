package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class c extends o0 {
    @Override // androidx.transition.v
    public long b(ViewGroup viewGroup, Transition transition, x xVar, x xVar2) {
        int i;
        int i2;
        int i3;
        if (xVar == null && xVar2 == null) {
            return 0;
        }
        if (xVar2 == null || d(xVar) == 0) {
            i = -1;
        } else {
            xVar = xVar2;
            i = 1;
        }
        int e = e(xVar);
        int f = f(xVar);
        Rect z = transition.z();
        if (z != null) {
            i3 = z.centerX();
            i2 = z.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(viewGroup.getTranslationX() + ((float) ((viewGroup.getWidth() / 2) + iArr[0])));
            int i4 = iArr[1];
            i2 = Math.round(viewGroup.getTranslationY() + ((float) ((viewGroup.getHeight() / 2) + i4)));
            i3 = round;
        }
        float f2 = ((float) i3) - ((float) e);
        float f3 = ((float) i2) - ((float) f);
        float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
        float width = ((float) viewGroup.getWidth()) - 0.0f;
        float height = ((float) viewGroup.getHeight()) - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((double) ((height * height) + (width * width))));
        long j = transition.c;
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / 3.0f) * sqrt2);
    }
}
