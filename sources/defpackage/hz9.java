package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.h0;

/* renamed from: hz9  reason: default package */
public class hz9 implements h0 {
    private final int a;

    public hz9(int i) {
        this.a = i;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return "rounded";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
