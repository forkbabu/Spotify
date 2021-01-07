package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: sud  reason: default package */
public class sud extends MetricAffectingSpan {
    public static final /* synthetic */ int b = 0;
    private Typeface a;

    public sud(Typeface typeface) {
        this.a = typeface;
    }

    private void a(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            Typeface typeface2 = textPaint.getTypeface();
            if (typeface2 != null) {
                int style = typeface2.getStyle();
                if (typeface.getStyle() != style) {
                    typeface = Typeface.create(typeface, style);
                }
                this.a = typeface;
            }
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
