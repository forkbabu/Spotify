package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

/* renamed from: odb  reason: default package */
public final class odb extends ClickableSpan {
    private final int a;
    private final a<Integer> b;

    public odb(int i, a<Integer> aVar) {
        h.e(aVar, "lineSelectedSubject");
        this.a = i;
        this.b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        h.e(view, "widget");
        this.b.onNext(Integer.valueOf(this.a));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        h.e(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
