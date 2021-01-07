package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: q  reason: default package */
public final class q {
    public static void a(Rect rect, Rect rect2) {
        if (!rect.isEmpty()) {
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            if (!rect.intersect(rect2)) {
                rect.setEmpty();
                return;
            }
            c(rect, rect);
            int centerX2 = centerX - rect.centerX();
            int centerY2 = centerY - rect.centerY();
            rect.offset(centerX2, centerY2);
            if (!rect2.contains(rect)) {
                rect.offset(-centerX2, -centerY2);
            }
        }
    }

    public static void b(Rect rect, Rect rect2) {
        int i = rect2.left;
        int i2 = rect2.top;
        int i3 = rect2.bottom;
        rect.set(i, (i2 + i3) / 2, rect2.right, i3);
    }

    public static void c(Rect rect, Rect rect2) {
        int min = Math.min(rect2.width(), rect2.height()) / 2;
        rect.set(rect2.centerX() - min, rect2.centerY() - min, rect2.centerX() + min, rect2.centerY() + min);
    }

    public static int d(Context context, int i, int i2) {
        return (int) (context.getResources().getFraction(i2, 1, 1) * ((float) i));
    }

    public static void e(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.setEmpty();
            return;
        }
        int i = rect2.left;
        rect.set(i, rect2.top, rect2.height() + i, rect2.bottom);
    }

    public static void f(Rect rect, Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.set(rect2);
            return;
        }
        rect.set(rect2.height() + rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    public static void g(Rect rect, Rect rect2) {
        int i = rect2.left;
        int i2 = rect2.top;
        rect.set(i, i2, rect2.right, (rect2.bottom + i2) / 2);
    }

    public static boolean h(Rect rect) {
        return ((float) rect.width()) > ((float) rect.height()) * 2.0f;
    }

    public static void i(Rect rect, Rect rect2, float f) {
        rect.set(rect2);
        float f2 = 0.5f - (f / 2.0f);
        rect.inset((int) (((float) rect.width()) * f2), (int) (((float) rect.height()) * f2));
    }
}
