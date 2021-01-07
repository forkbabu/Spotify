package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineBackgroundSpan;
import kotlin.jvm.internal.h;

/* renamed from: pdb  reason: default package */
public final class pdb implements LineBackgroundSpan {
    private final RectF a = new RectF();
    private final int b;

    public pdb(int i) {
        this.b = i;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        h.e(canvas, "c");
        h.e(paint, "p");
        h.e(charSequence, "text");
        int b2 = anf.b(paint.measureText(charSequence, i6, i7));
        int color = paint.getColor();
        this.a.set((float) (i - 10), (float) ((i3 - (i8 == 0 ? 5 : -5)) + 5), (float) (i + b2 + 10), (float) (i5 + 5));
        paint.setColor(this.b);
        RectF rectF = this.a;
        Resources system = Resources.getSystem();
        h.d(system, "Resources.getSystem()");
        float f = (float) 5;
        Resources system2 = Resources.getSystem();
        h.d(system2, "Resources.getSystem()");
        canvas.drawRoundRect(rectF, system.getDisplayMetrics().density * f, system2.getDisplayMetrics().density * f, paint);
        paint.setColor(color);
    }
}
