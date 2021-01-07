package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.common.base.MoreObjects;
import com.squareup.picasso.h0;

/* renamed from: bwd  reason: default package */
public class bwd implements h0 {
    private final int a;
    private final int b;

    public bwd(int i, int i2) {
        boolean z = true;
        boolean z2 = i > 0;
        MoreObjects.checkArgument(z2, "targetWidth " + i + " must be greater than 0");
        z = i2 <= 0 ? false : z;
        MoreObjects.checkArgument(z, "targetHeight " + i2 + " must be greater than 0");
        this.a = i;
        this.b = i2;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return String.format("center_crop_top_w_%s_h_%s", Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        int i3 = this.a;
        if (i3 != 0) {
            f2 = (float) i3;
            f = (float) width;
        } else {
            f2 = (float) this.b;
            f = (float) height;
        }
        float f5 = f2 / f;
        int i4 = this.b;
        if (i4 != 0) {
            f4 = (float) i4;
            f3 = (float) height;
        } else {
            f4 = (float) i3;
            f3 = (float) width;
        }
        float f6 = f4 / f3;
        int i5 = 0;
        if (f5 > f6) {
            int ceil = (int) Math.ceil((double) ((f6 / f5) * ((float) height)));
            f6 = ((float) this.b) / ((float) ceil);
            i2 = width;
            i = ceil;
        } else if (f5 < f6) {
            int ceil2 = (int) Math.ceil((double) ((f5 / f6) * ((float) width)));
            i = height;
            i2 = ceil2;
            f5 = ((float) this.a) / ((float) ceil2);
            i5 = (width - ceil2) / 2;
        } else {
            i2 = width;
            i = height;
            f5 = f6;
        }
        matrix.preScale(f5, f6);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i5, 0, i2, i, matrix, true);
        if (createBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }
}
