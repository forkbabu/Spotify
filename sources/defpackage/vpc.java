package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
/* renamed from: vpc  reason: default package */
public class vpc {
    private final TextPaint a;
    private final int b;
    private final int c;
    private final Path d = new Path();
    private int e;
    private int f;
    private CharSequence g;
    private StaticLayout h;
    private Rect i;

    vpc(TextPaint textPaint, int i2, int i3) {
        this.c = i3;
        this.a = textPaint;
        this.b = i2;
    }

    private void e() {
        Rect rect = this.i;
        if ((rect != null && rect.width() > 0 && rect.height() > 0) && !TextUtils.isEmpty(this.g)) {
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.g;
                charSequence.getClass();
                this.h = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, this.f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 0.9f).setIncludePad(false).build();
            } else {
                this.h = new StaticLayout(this.g, this.a, this.f, Layout.Alignment.ALIGN_NORMAL, 0.9f, 0.0f, false);
            }
            this.d.reset();
            Path path = this.d;
            RectF rectF = new RectF(this.i);
            int i2 = this.b;
            path.addRoundRect(rectF, (float) i2, (float) i2, Path.Direction.CW);
            StaticLayout staticLayout = this.h;
            Rect rect2 = this.i;
            int paragraphDirection = staticLayout.getParagraphDirection(0);
            int width = staticLayout.getWidth() - rect2.width();
            int i3 = this.c;
            if (paragraphDirection == -1) {
                i3 = (-width) - i3;
            }
            this.e = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Canvas canvas, int i2) {
        if (this.h != null) {
            canvas.save();
            canvas.clipPath(this.d);
            canvas.translate((float) this.e, (float) this.c);
            this.a.setColor(i2);
            this.h.draw(canvas);
            canvas.restore();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.h = null;
        this.i = null;
        this.d.reset();
        this.g = null;
    }

    /* access modifiers changed from: package-private */
    public boolean c(CharSequence charSequence) {
        if (TextUtils.equals(this.g, charSequence)) {
            return false;
        }
        this.g = charSequence;
        e();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(Rect rect) {
        Rect rect2 = new Rect(rect);
        this.i = rect2;
        this.f = (int) (((float) rect2.width()) * 1.5f);
        e();
    }
}
