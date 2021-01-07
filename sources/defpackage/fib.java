package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.squareup.picasso.h0;
import kotlin.jvm.internal.h;

/* renamed from: fib  reason: default package */
public final class fib implements h0 {
    private final int a;
    private final int b;

    public fib(int i) {
        this.b = i;
        this.a = Color.argb(0, Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        StringBuilder V0 = je.V0("GradientTransformation-");
        V0.append(this.b);
        return V0.toString();
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        h.e(bitmap, "source");
        try {
            Bitmap copy = !bitmap.isMutable() ? bitmap.copy(Bitmap.Config.ARGB_8888, true) : null;
            Canvas canvas = new Canvas(copy != null ? copy : bitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, (float) bitmap.getHeight(), 0.0f, 0.0f, new int[]{this.b, this.a}, new float[]{0.0f, 0.75f}, Shader.TileMode.CLAMP));
            canvas.drawPaint(paint);
            if (copy == null) {
                return bitmap;
            }
            bitmap.recycle();
            return copy;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }
}
