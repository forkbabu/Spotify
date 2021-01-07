package com.spotify.music.features.login.startview;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.h0;

public class r implements h0 {
    private final int a;
    private final int b;

    public r(int i, int i2) {
        Logger.b("StartScreenImageTransformation: width = %d, height = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.a = i;
        this.b = i2;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        StringBuilder V0 = je.V0("scale-crop-transformation-");
        V0.append(this.a);
        V0.append('x');
        V0.append(this.b);
        return V0.toString();
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        int i = this.a;
        Logger.b("scaling bitmap to %d", Integer.valueOf(i));
        double height = (double) bitmap.getHeight();
        double width = (double) bitmap.getWidth();
        Double.isNaN(height);
        Double.isNaN(width);
        Double.isNaN(height);
        Double.isNaN(width);
        double d = height / width;
        double d2 = (double) i;
        Double.isNaN(d2);
        Double.isNaN(d2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, (int) (d2 * d), true);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        int height2 = createScaledBitmap.getHeight();
        int i2 = this.b;
        if (!(height2 > i2)) {
            return createScaledBitmap;
        }
        Logger.b("cropping bitmap to %d", Integer.valueOf(i2));
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, createScaledBitmap.getWidth(), i2);
        if (createBitmap != createScaledBitmap) {
            createScaledBitmap.recycle();
        }
        return createBitmap;
    }
}
