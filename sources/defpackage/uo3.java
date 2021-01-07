package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.h0;

/* renamed from: uo3  reason: default package */
public class uo3 implements h0 {
    private final int a;

    public uo3(int i) {
        this.a = i;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return je.B0(je.V0("topbanner_corner_radius_"), this.a, "_px");
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Rect rect = new Rect(1, 1, bitmap.getWidth() - 1, bitmap.getHeight() - 1);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(rect);
        Rect rect2 = new Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth(), bitmap.getHeight() / 2);
        Rect rect3 = new Rect(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        int i = this.a;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect3, paint);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
