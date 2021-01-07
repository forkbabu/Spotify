package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.squareup.picasso.h0;

/* renamed from: ewd  reason: default package */
public class ewd implements h0 {
    private final int a;
    private b b = new a(this);

    /* renamed from: ewd$a */
    class a implements b {
        a(ewd ewd) {
        }
    }

    /* renamed from: ewd$b */
    interface b {
    }

    public ewd(double d, float f, int i) {
        this.a = i;
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return "image_color_extracted_background";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() == null) {
            return bitmap;
        }
        ((a) this.b).getClass();
        int a2 = ovd.a(dwd.b(kvd.a(bitmap).a()), 0.4f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        double width = (double) createBitmap.getWidth();
        Double.isNaN(width);
        Double.isNaN(width);
        double height = (double) createBitmap.getHeight();
        Double.isNaN(height);
        Double.isNaN(height);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * 0.75d), (int) (height * 0.75d), false);
        float f = (float) this.a;
        Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
        Canvas canvas2 = new Canvas(createBitmap);
        canvas2.drawColor(a2);
        canvas2.drawBitmap(createBitmap2, (float) ((createBitmap.getWidth() / 2) - (createBitmap2.getWidth() / 2)), (float) ((createBitmap.getHeight() / 2) - (createBitmap2.getHeight() / 2)), (Paint) null);
        createBitmap2.recycle();
        bitmap.recycle();
        return createBitmap;
    }
}
