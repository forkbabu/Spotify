package com.spotify.music.features.ads.screensaver;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.h0;

public class v0 implements h0 {
    @Override // com.squareup.picasso.h0
    public String a() {
        return v0.class.getSimpleName();
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = (float) width;
        float f2 = (float) height;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f, f2), 10.0f, 10.0f, paint);
        float f3 = (float) (height - (height / 3));
        paint.setShader(new LinearGradient(0.0f, f3, 0.0f, f2, 0, -1728053248, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(new RectF(0.0f, f3, f, f2), 10.0f, 10.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }
}
