package com.spotify.image.provider;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.squareup.picasso.h0;

public class b implements h0 {
    private final Paint a = new Paint(1);
    private final Paint b;

    public b() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return "circular_image";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - min) / 2;
        int height = (bitmap.getHeight() - min) / 2;
        Rect rect = new Rect(width, height, width + min, height + min);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect2 = new Rect(0, 0, min, min);
        float width2 = ((float) createBitmap.getWidth()) / 2.0f;
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(width2, width2, width2, this.a);
        canvas.drawBitmap(bitmap, rect, rect2, this.b);
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
