package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;

/* access modifiers changed from: package-private */
/* renamed from: lx  reason: default package */
public class lx extends mx {
    final /* synthetic */ TextPaint a;
    final /* synthetic */ mx b;
    final /* synthetic */ kx c;

    lx(kx kxVar, TextPaint textPaint, mx mxVar) {
        this.c = kxVar;
        this.a = textPaint;
        this.b = mxVar;
    }

    @Override // defpackage.mx
    public void a(int i) {
        this.b.a(i);
    }

    @Override // defpackage.mx
    public void b(Typeface typeface, boolean z) {
        this.c.i(this.a, typeface);
        this.b.b(typeface, z);
    }
}
