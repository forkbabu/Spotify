package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.spotify.music.navigation.t;

/* renamed from: tf3  reason: default package */
public class tf3 extends ClickableSpan {
    private final String a;
    private final t b;
    private final uk9 c;

    public tf3(String str, t tVar, uk9 uk9) {
        str.getClass();
        this.a = str;
        tVar.getClass();
        this.b = tVar;
        uk9.getClass();
        this.c = uk9;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.c.e(this.a);
        this.b.d(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(-1);
    }
}
