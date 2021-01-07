package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.squareup.picasso.h0;

/* renamed from: cwd  reason: default package */
public class cwd implements h0 {
    private final Paint a = new Paint(1);

    @Override // com.squareup.picasso.h0
    public String a() {
        return "circle";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - min) / 2, (bitmap.getHeight() - min) / 2, min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.a.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        float f = ((float) min) / 2.0f;
        canvas.drawCircle(f, f, f, this.a);
        createBitmap.recycle();
        return createBitmap2;
    }
}
