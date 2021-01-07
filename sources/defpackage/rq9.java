package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.content.a;
import com.spotify.music.C0707R;

/* renamed from: rq9  reason: default package */
public class rq9 {
    private final Paint a;
    private final Paint b;
    private final Shader c;
    private RectF d;

    public rq9(Context context) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        int b2 = a.b(context, C0707R.color.home_promotion_background_gradient_start);
        int b3 = a.b(context, C0707R.color.home_promotion_background_gradient_end);
        int b4 = a.b(context, C0707R.color.home_promotion_background_overlay);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{b2, b3}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
        this.c = linearGradient;
        paint.setShader(linearGradient);
        paint2.setColorFilter(new PorterDuffColorFilter(b4, PorterDuff.Mode.SRC_IN));
    }

    public void a(Canvas canvas, Paint paint, float f, float f2) {
        paint.setAlpha((int) (f * 255.0f));
        paint.setShader(this.c);
        canvas.drawRoundRect(this.d, f2, f2, this.b);
        canvas.drawRoundRect(this.d, f2, f2, this.a);
    }

    public void b(Rect rect) {
        this.d = new RectF(rect);
    }

    public void c(Matrix matrix) {
        this.c.setLocalMatrix(matrix);
    }
}
