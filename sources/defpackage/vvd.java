package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: vvd  reason: default package */
public class vvd extends ImageSpan {
    public vvd(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        float f2 = paint.getFontMetrics().ascent;
        float f3 = paint.getFontMetrics().descent;
        canvas.translate(f, ((((float) i4) + f3) - ((f3 - f2) / 2.0f)) - (((float) drawable.getIntrinsicHeight()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = ((i3 - i4) / 2) + i4;
            int i6 = ((-drawable.getBounds().height()) / 2) + i5;
            int height = (drawable.getBounds().height() / 2) + i5;
            int min = Math.min(fontMetricsInt2.ascent, i6);
            int max = Math.max(fontMetricsInt2.descent, height);
            fontMetricsInt.ascent = min;
            fontMetricsInt.descent = max;
            fontMetricsInt.top = min;
            fontMetricsInt.bottom = max;
        }
        return bounds.right;
    }
}
