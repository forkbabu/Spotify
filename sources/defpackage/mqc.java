package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: mqc  reason: default package */
public class mqc extends ClickableSpan {
    private final a a;
    private final CharSequence b;

    /* renamed from: mqc$a */
    public interface a {
        void a(CharSequence charSequence);
    }

    public mqc(a aVar, CharSequence charSequence) {
        this.a = aVar;
        this.b = charSequence;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.a.a(this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
