package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: sjb  reason: default package */
public class sjb extends ClickableSpan {
    private final int a;
    private final a b;

    /* renamed from: sjb$a */
    public interface a {
        void a();
    }

    public sjb(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.b.a();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.a);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
