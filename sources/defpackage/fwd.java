package defpackage;

import android.graphics.Bitmap;
import com.squareup.picasso.h0;

/* renamed from: fwd  reason: default package */
public class fwd implements h0 {
    public static final fwd b = new fwd();
    private b a = new a(this);

    /* renamed from: fwd$a */
    class a implements b {
        a(fwd fwd) {
        }
    }

    /* renamed from: fwd$b */
    interface b {
    }

    private fwd() {
    }

    @Override // com.squareup.picasso.h0
    public String a() {
        return "color_extract";
    }

    @Override // com.squareup.picasso.h0
    public Bitmap b(Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() == null) {
            return bitmap;
        }
        ((a) this.a).getClass();
        int b2 = dwd.b(kvd.a(bitmap).a());
        bitmap.recycle();
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        createBitmap.setPixel(0, 0, b2);
        return createBitmap;
    }
}
