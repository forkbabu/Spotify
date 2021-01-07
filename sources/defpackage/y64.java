package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: y64  reason: default package */
public final class y64 {
    static float a(Rect rect) {
        return Math.min(((float) rect.height()) * 0.73913044f, ((float) rect.width()) * 0.41463414f);
    }

    static float b(boolean z) {
        return z ? -25.0f : 25.0f;
    }

    public static void c(Rect rect) {
        float a = a(rect);
        RectF rectF = new RectF(0.0f, 0.0f, a, a);
        Matrix matrix = new Matrix();
        matrix.postRotate(25.0f);
        matrix.mapRect(rectF);
        rect.set(0, 0, Math.round(rectF.width() * 0.66396165f), Math.round(rectF.height() * 0.88528216f));
    }

    static PointF d(Rect rect, boolean z) {
        float f;
        float a = a(rect);
        RectF rectF = new RectF(0.0f, 0.0f, a, a);
        Matrix matrix = new Matrix();
        matrix.postRotate(b(z));
        matrix.mapRect(rectF);
        float width = rectF.width();
        float height = ((-rectF.top) + ((float) rect.height())) - (rectF.height() * 0.88528216f);
        if (z) {
            f = (-rectF.left) - (width * 0.33603835f);
        } else {
            f = ((-rectF.left) + ((float) rect.width())) - (width * 0.66396165f);
        }
        return new PointF(f, height);
    }
}
