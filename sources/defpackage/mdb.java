package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.h;

/* renamed from: mdb  reason: default package */
public abstract class mdb extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.e(textPaint, "ds");
        textPaint.setUnderlineText(true);
    }
}
