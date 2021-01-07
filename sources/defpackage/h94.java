package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: h94  reason: default package */
public class h94 extends g94 {
    private final p94 f;
    private final Matrix g = new Matrix();

    public h94(Context context, int i) {
        super(i);
        this.f = new p94(context);
    }

    @Override // defpackage.g94, defpackage.i94, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f.a(canvas, b(), c(), (float) a());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.g94
    public void f(Rect rect) {
        super.f(rect);
        this.f.b(rect);
        RectF rectF = new RectF(rect);
        this.g.reset();
        this.g.setScale(rectF.width(), rectF.height());
        this.f.c(this.g);
    }
}
