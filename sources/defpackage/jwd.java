package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

/* renamed from: jwd  reason: default package */
public class jwd {
    private static final Paint c = new Paint(3);
    private static final Rect[] d = {new Rect(0, 0, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), new Rect(AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, 0, 300, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150), new Rect(0, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, 300), new Rect(AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150, 300, 300)};
    private final yb3 a;
    private final hwd b;

    public jwd(yb3 yb3, hwd hwd) {
        this.a = yb3;
        this.b = hwd;
    }

    static String c(String str) {
        MoreObjects.checkArgument(!str.startsWith("spotify:mosaic:"));
        try {
            return new String(Base64.decode(Uri.decode(str), 0), Charsets.UTF_8);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    private static String d(String str) {
        return Base64.encodeToString(str.getBytes(Charsets.UTF_8), 0);
    }

    static boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("spotify:mosaic:") || c(str).startsWith("spotify:mosaic:")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ec, code lost:
        if (r6 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011d, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwd.a(java.lang.String):android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.BitmapFactory.Options b(java.lang.String r4, float r5) {
        /*
            r3 = this;
            yb3 r0 = r3.a
            jc1 r0 = r0.a
            java.io.InputStream r4 = r0.a(r4)
            r0 = 0
            if (r4 != 0) goto L_0x0011
            if (r4 == 0) goto L_0x0010
            r4.close()
        L_0x0010:
            return r0
        L_0x0011:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ all -> 0x004c }
            android.graphics.BitmapFactory.decodeStream(r4, r0, r1)     // Catch:{ all -> 0x004c }
            int r0 = r1.outHeight     // Catch:{ all -> 0x004c }
            float r0 = (float) r0     // Catch:{ all -> 0x004c }
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            int r0 = r1.outWidth     // Catch:{ all -> 0x004c }
            float r0 = (float) r0     // Catch:{ all -> 0x004c }
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
        L_0x002a:
            int r0 = r1.outWidth     // Catch:{ all -> 0x004c }
            float r0 = (float) r0     // Catch:{ all -> 0x004c }
            float r0 = r0 / r5
            int r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x004c }
            int r1 = r1.outHeight     // Catch:{ all -> 0x004c }
            float r1 = (float) r1     // Catch:{ all -> 0x004c }
            float r1 = r1 / r5
            int r5 = java.lang.Math.round(r1)     // Catch:{ all -> 0x004c }
            int r2 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x004c }
        L_0x003e:
            r4.close()
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 0
            r4.inJustDecodeBounds = r5
            r4.inSampleSize = r2
            return r4
        L_0x004c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwd.b(java.lang.String, float):android.graphics.BitmapFactory$Options");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap e(java.lang.String[] r7) {
        /*
            r6 = this;
            int r0 = r7.length
            r1 = 0
        L_0x0002:
            r2 = 0
            if (r1 >= r0) goto L_0x0032
            r3 = r7[r1]
            r4 = 1133903872(0x43960000, float:300.0)
            android.graphics.BitmapFactory$Options r4 = r6.b(r3, r4)
            if (r4 == 0) goto L_0x002f
            yb3 r5 = r6.a
            java.io.InputStream r3 = r5.a(r3)
            if (r3 != 0) goto L_0x001a
            if (r3 == 0) goto L_0x002f
            goto L_0x0024
        L_0x001a:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r2, r4)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0024
            r3.close()
            return r2
        L_0x0024:
            r3.close()
            goto L_0x002f
        L_0x0028:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x002a }
        L_0x002a:
            r7 = move-exception
            r3.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r7
        L_0x002f:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwd.e(java.lang.String[]):android.graphics.Bitmap");
    }
}
