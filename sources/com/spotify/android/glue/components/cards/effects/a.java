package com.spotify.android.glue.components.cards.effects;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.h0;

public class a implements h0 {
    private static final Paint d = new Paint(1);
    private final String a;
    private final Drawable b;
    private final GlueRippleCoverArtShape c;

    public a(Context context, boolean z) {
        GlueRippleCoverArtShape glueRippleCoverArtShape = z ? GlueRippleCoverArtShape.CIRCLE : GlueRippleCoverArtShape.SQUARE;
        this.c = glueRippleCoverArtShape;
        this.a = "GlueRadioCardRippleTransformation (" + glueRippleCoverArtShape + ')';
        this.b = androidx.core.content.a.d(context, glueRippleCoverArtShape.mDrawableResId);
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return this.a;
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        int b2 = dwd.b(kvd.a(bitmap).a());
        Rect clipBounds = canvas.getClipBounds();
        float centerX = (float) clipBounds.centerX();
        float centerY = (float) clipBounds.centerY();
        int round = Math.round(((float) Math.min(canvas.getWidth(), canvas.getHeight())) / 2.0f);
        matrix.preTranslate(-centerX, -centerY);
        bitmapShader.setLocalMatrix(matrix);
        canvas.drawColor(b2);
        canvas.save();
        canvas.translate(centerX, centerY);
        int i = -round;
        this.b.setBounds(i, i, round, round);
        this.b.draw(canvas);
        canvas.restore();
        canvas.save();
        Paint paint = d;
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        canvas.translate(centerX, centerY);
        canvas.scale(0.5f, 0.5f);
        this.c.d(canvas, (float) round, paint);
        canvas.restore();
        bitmap.recycle();
        return createBitmap;
    }
}
