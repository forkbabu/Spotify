package com.spotify.mobile.android.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.spotify.music.features.churnlockedstate.b;

/* access modifiers changed from: package-private */
public class z extends URLSpan {
    private final y a;

    public z(String str, y yVar) {
        super(str);
        this.a = yVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        boolean z;
        y yVar = this.a;
        if (yVar != null) {
            ((b) yVar).a(getURL());
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.onClick(view);
        }
        view.invalidate();
    }

    @Override // android.text.style.CharacterStyle, android.text.style.ClickableSpan
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
