package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.h0;
import kotlin.jvm.internal.h;

/* renamed from: uw0  reason: default package */
public final class uw0 implements h0 {
    private final int a;
    private final float b;

    public uw0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        StringBuilder V0 = je.V0("rounded_corner_transformation(radius=");
        V0.append(this.a);
        V0.append(", margin=");
        V0.append(this.b);
        V0.append(')');
        return V0.toString();
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        h.e(bitmap, "source");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = this.b;
        RectF rectF = new RectF(f, f, ((float) bitmap.getWidth()) - this.b, ((float) bitmap.getHeight()) - this.b);
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        if (!h.a(bitmap, createBitmap)) {
            bitmap.recycle();
        }
        h.d(createBitmap, "output");
        return createBitmap;
    }
}
