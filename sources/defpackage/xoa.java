package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: xoa  reason: default package */
public final class xoa extends soa {
    private final woa a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xoa(woa woa, String str) {
        super(str);
        h.e(woa, "listener");
        h.e(str, "url");
        this.a = woa;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        h.e(view, "widget");
        super.onClick(view);
        woa woa = this.a;
        String url = getURL();
        h.d(url, "url");
        woa.c(url);
        view.invalidate();
    }

    @Override // android.text.style.CharacterStyle, android.text.style.ClickableSpan
    public void updateDrawState(TextPaint textPaint) {
        h.e(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 1));
    }
}
