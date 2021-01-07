package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import com.google.common.base.Optional;
import java.io.InputStream;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: w1d  reason: default package */
public class w1d {
    private final a a;
    private final DisplayMetrics b;

    /* renamed from: w1d$a */
    public static class a {
    }

    public w1d(a aVar, DisplayMetrics displayMetrics) {
        this.a = aVar;
        this.b = displayMetrics;
    }

    private Bitmap c(Bitmap bitmap, String str, String str2) {
        int i = this.b.widthPixels;
        int i2 = (i * 16) / 9;
        float f = (float) i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f, Color.parseColor(str), Color.parseColor(str2), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setShader(linearGradient);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRect(0.0f, 0.0f, (float) i, f, paint);
        canvas.drawBitmap(bitmap, (((float) createBitmap.getWidth()) * 0.5f) - (((float) bitmap.getWidth()) * 0.5f), (((float) createBitmap.getHeight()) * 0.4f) - (((float) bitmap.getHeight()) * 0.5f), (Paint) null);
        return createBitmap;
    }

    public Optional<Bitmap> a(v<e0> vVar) {
        if (!vVar.f() || vVar.a() == null) {
            return Optional.absent();
        }
        try {
            InputStream a2 = vVar.a().a();
            this.a.getClass();
            Bitmap decodeStream = BitmapFactory.decodeStream(a2);
            a2.close();
            return Optional.fromNullable(decodeStream);
        } catch (Exception unused) {
            return Optional.absent();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r4 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.base.Optional<android.graphics.Bitmap> b(retrofit2.v<okhttp3.e0> r4) {
        /*
            r3 = this;
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r4.a()
            if (r0 != 0) goto L_0x000d
            goto L_0x005a
        L_0x000d:
            okhttp3.t r0 = r4.e()
            java.lang.String r1 = "X-Background-Top-Color"
            java.lang.String r0 = r0.c(r1)
            okhttp3.t r1 = r4.e()
            java.lang.String r2 = "X-Background-Bottom-Color"
            java.lang.String r1 = r1.c(r2)
            if (r0 == 0) goto L_0x0055
            if (r1 != 0) goto L_0x0026
            goto L_0x0055
        L_0x0026:
            java.lang.Object r4 = r4.a()
            okhttp3.e0 r4 = (okhttp3.e0) r4
            java.io.InputStream r4 = r4.a()
            w1d$a r2 = r3.a     // Catch:{ all -> 0x0047 }
            r2.getClass()     // Catch:{ all -> 0x0047 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ all -> 0x0047 }
            android.graphics.Bitmap r0 = r3.c(r2, r0, r1)     // Catch:{ all -> 0x0047 }
            com.google.common.base.Optional r0 = com.google.common.base.Optional.of(r0)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0050 }
        L_0x0046:
            return r0
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            if (r4 == 0) goto L_0x004f
            r4.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            com.google.common.base.Optional r4 = com.google.common.base.Optional.absent()
            return r4
        L_0x0055:
            com.google.common.base.Optional r4 = com.google.common.base.Optional.absent()
            return r4
        L_0x005a:
            com.google.common.base.Optional r4 = com.google.common.base.Optional.absent()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1d.b(retrofit2.v):com.google.common.base.Optional");
    }
}
